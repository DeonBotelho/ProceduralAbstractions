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
import java.util.*;
public class BookList 
{
    private ArrayList<Book> books;
    BookList()
    {
        books = new ArrayList<>();
    }
    //Write the code for addBook
    //Creates a book with its title t, isbn i and author a. Then adds the newly
    //created book to the arraylist books.
    public void addBook(String title,String isbn,String author)
    {        
        books.add(new Book(title,isbn,author));//add new book into books arraylist
    }
    
    public void sort()
    {
        Collections.sort(books);//sort books
    }
      
    @Override
    public String toString()
    {
        return books.toString();//returns string representation of books
    }
    
    public static void main(String[] args)
    {
        BookList bList = new BookList();
        bList.addBook("Calculus", "1234","Goldstein");
        bList.addBook("Java", "5678","Gosling");
        bList.addBook("Algorithms", "4629","Cormen");
        System.out.println(bList);
        bList.sort();
        System.out.println(bList);
        
    }
    
   
    
    
}
