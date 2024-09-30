/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testexception;

/**
 *
 * @author hessaalseiari
 */
public class InvalidPasswordException extends Exception {
    // Constructor that accepts a message
    public InvalidPasswordException(String message) {
        super(message);
    }
}
