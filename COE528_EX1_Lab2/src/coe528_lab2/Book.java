/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528_lab2;

/**
 *
 * @author Deon
 */
public class Book implements Comparable<Book> {
    
    private String title,isbn,author;
    
    Book(String title,String isbn,String author)
    {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }
    
    public String getTitle(){return this.title;}
    public void setTitle(String title){this.title = title;}
    
    public String getIsbn(){return this.isbn;}
    public void setIsbn(String isbn){this.isbn = isbn;}
    
    public String getAuthor(){return this.author;}
    public void setAuthor(String author){this.author = author;}
    
    @Override
    public String toString()
    {        
        return ""+title;
    }
    
    /*** Returns a negative integer, zero, or a positive integer depending on the title of
     * this book being lexicographically less than, equal to, or greater than the title
     * of the specified book b. [Hint: Use compareTo method of String class]*/
    public int compareTo(Book b)
    {        
        return title.compareTo(b.title);
    }
    
    
}
