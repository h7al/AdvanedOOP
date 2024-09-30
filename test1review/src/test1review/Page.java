/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1review;

/**
 *
 * @author hessaalseiari
 */
public class Page {
    
    private int pageNumber;
    private String content;

    public Page(int pageNumber, String content) {
        this.pageNumber = pageNumber;
        this.content = content;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getContent() {
        return content;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Adding clone method for deep copy
    public Page clone() {
        return new Page(this.pageNumber, this.content);
    }
}
