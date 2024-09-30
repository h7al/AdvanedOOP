/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1review;

/**
 *
 * @author hessaalseiari
 */
public class WebSite implements Cloneable{

    private String title;
    private String author;
    private Page page;

    public WebSite(String title, String author, Page page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Page getPage() {
        return page;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    // Override clone for deep copy
    @Override
    public WebSite clone() {
        // Create a deep copy by also cloning the Page object
        return new WebSite(this.title, this.author, this.page.clone());
    }
}