package Task2_CredentialsManager;

import java.util.Arrays;

public class Credentials {

	private String username;
	private String password;
	
	public Credentials(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	Credentials [] cred = new Credentials [200];
	private int count = 0;
	
	public String ENROLL(final String username2, String password2) {
		cred [count] = new Credentials (username2, password2);
		count++;
		return "ENROLL success";
	}
	
	public String CHPASS(String username, String password, String newpassword) {
		if(username.equals(Arrays.binarySearch(cred,username))) {
			if(Arrays.binarySearch(cred, "username").password.equals(password))
		}
	}
	
	public static void main(String[] args) {
		
	}
}
