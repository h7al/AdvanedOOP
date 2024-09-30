/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testexception;

/**
 *
 * @author hessaalseiari
 */
public class TestException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    PremiumUserAccount user = new PremiumUserAccount("Sara_ba", "12345password");

        // Call initiateUserAccount method and display the result
        System.out.println(user.initiateUserAccount());

        // Call authenticate method
        user.authenticate();

        // Try block to handle login attempts
        try {
            // Attempt login with the wrong password
            user.login("wrongpassword");
        } catch (InvalidPasswordException e) {
            // Catch the InvalidPasswordException and print the error message
            System.out.println(e.getMessage());
        }
    }
}
    


