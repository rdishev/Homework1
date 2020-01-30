package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserAccount;

@Repository
public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {

	List <UserAccount> findByFirstName (String firstName);
	List <UserAccount> findByLastName (String lastName);
	List <UserAccount> findByFirstNameAndLastName (String firstName, String lastName);
	List <UserAccount> findByEmail (String email);
}
