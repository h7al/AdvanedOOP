/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1review;

/**
 *
 * @author hessaalseiari
 */
public class Test1review {


    public static void main(String[] args) {

        // Create an object of class Page
        Page page1 = new Page(1, "Introduction to Docker");

        // Create an object of class WebSite
        WebSite originalWebsite = new WebSite("Docker containers", "Author", page1);

        // Clone object originalWebSite
        WebSite clonedWebsite = originalWebsite.clone();

        // Modify the title and author of the cloned object
        clonedWebsite.setTitle("microservices architecture");
        clonedWebsite.setAuthor("NBL");
        clonedWebsite.getPage().setContent("Advanced microservices composition Topics");

        // Print the details of the original and cloned objects
        System.out.println("Original Web site details: Title: " + originalWebsite.getTitle()
                + ", Author: " + originalWebsite.getAuthor()
                + ", Page Content: " + originalWebsite.getPage().getContent());
        
        System.out.println("Cloned Web site Details: Title: " + clonedWebsite.getTitle()
                + ", Author: " + clonedWebsite.getAuthor()
                + ", Page Content: " + clonedWebsite.getPage().getContent());
    }
}
   
