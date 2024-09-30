/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testexception;

/**
 *
 * @author hessaalseiari
 */
public class PremiumUserAccount extends UserAccount implements Authenticatable {
    private String username;
    private String password;

    // Constructor to initialize username and password
    public PremiumUserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Override the initiateUserAccount method
    @Override
    public String initiateUserAccount() {
        return "User account has been initiated with username: " + username;
    }

    // Override the authenticate method
    @Override
    public void authenticate() {
        System.out.println("User: " + username + " has been authenticated successfully");
    }

    // Modified login method to throw InvalidPasswordException for incorrect password
    public void login(String inputPassword) throws InvalidPasswordException {
        if (!password.equals(inputPassword)) {
            throw new InvalidPasswordException("Invalid password.");
        }
        System.out.println("Login successful!");
    }
}
