package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserAccount;
import com.example.demo.repository.UserAccountRepository;

@RestController
public class UserAccountController {

	String regexMail = "^[A-Za-z0-9+_.-]+@(.+)$";
	String regexPass = "^((?=.*[@!#$%])(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,22})";
	String regexDOB = "^((0[1-9]||[12][0-9]||3[01])[.](0[1-9]||1[012])[-/.](19||20))\\d\\d$";
	
	Pattern patternMail = Pattern.compile(regexMail);
	Pattern patternPass = Pattern.compile(regexPass);
	Pattern patternDOB = Pattern.compile(regexDOB);
	
	@Autowired
	UserAccountRepository userAccountRepository;
	
	@RequestMapping(value="/useraccount", method = RequestMethod.POST)
	public ResponseEntity <UserAccount> addUserAccount(@RequestBody UserAccount userAccount){
		Matcher matcherMail = patternMail.matcher(userAccount.getEmail());
		Matcher matcherPass = patternPass.matcher(userAccount.getPassword());
		Matcher matcherDOB = patternDOB.matcher(userAccount.getDOB());
		if(matcherMail.matches()&& matcherPass.matches()&&matcherDOB.matches()) {
			userAccountRepository.save(userAccount);
			return new ResponseEntity<>(userAccount, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/useraccount/{id}", method = RequestMethod.GET)
	public ResponseEntity <UserAccount> findById(@PathVariable Long id){
		Optional<UserAccount> optAcc = userAccountRepository.findById(id);
		if(optAcc.isPresent()) {
			return new ResponseEntity<>(optAcc.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value="/useraccount/firstname/{lastName}", method = RequestMethod.GET)
	public ResponseEntity <List<UserAccount>> findByLastName(@PathVariable String lastName){
		if(lastName == null || lastName.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		List<UserAccount> userAccounts = userAccountRepository.findByLastName(lastName);
		return new ResponseEntity<>(userAccounts, HttpStatus.OK);
	}
	
	@RequestMapping(value="/useraccount/firstname/{firstName}", method = RequestMethod.GET)
	public ResponseEntity <List<UserAccount>> findByFirstName(@PathVariable String firstName){
		if(firstName == null || firstName.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		List<UserAccount> userAccounts = userAccountRepository.findByFirstName(firstName);
		return new ResponseEntity<>(userAccounts, HttpStatus.OK);
	}
	
	@RequestMapping(value="/useraccount/allaccounts", method = RequestMethod.GET)
	public ResponseEntity <List<UserAccount>> findAll(){
		List<UserAccount> useraccounts = new ArrayList<>();
		userAccountRepository.findAll().forEach(useraccounts :: add);
		return new ResponseEntity<>(useraccounts, HttpStatus.OK);
	}
	
	@RequestMapping(value="/useraccount", method = RequestMethod.PUT)
	public ResponseEntity<UserAccount> updateUserAccount(@RequestBody UserAccount userAccount) {
		if(userAccount.getId() == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Optional<UserAccount> userAccountOpt = userAccountRepository.findById(userAccount.getId());
		if(!userAccountOpt.isPresent()) {
			return new ResponseEntity<UserAccount>(HttpStatus.BAD_REQUEST);
		}
		Matcher matcherMail = patternMail.matcher(userAccount.getEmail());
		Matcher matcherPass = patternPass.matcher(userAccount.getPassword());
		Matcher matcherDOB = patternDOB.matcher(userAccount.getDOB());
		if(matcherMail.matches()&& matcherPass.matches()&&matcherDOB.matches()) {
		UserAccount updatedRecord = userAccountRepository.save(userAccount);
		return new ResponseEntity<>(updatedRecord, HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/useraccount", method = RequestMethod.DELETE)
	public ResponseEntity<UserAccount> deleteFabric(@RequestBody UserAccount userAccount) {
		if(userAccount.getId() == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Optional<UserAccount> fabricOpt = userAccountRepository.findById(userAccount.getId());
		if(!fabricOpt.isPresent()) {
			return new ResponseEntity<UserAccount>(HttpStatus.BAD_REQUEST);
		}
		userAccountRepository.delete(userAccount);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
}
