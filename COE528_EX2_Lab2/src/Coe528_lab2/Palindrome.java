package Coe528_lab2;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Deon
 */



public class Palindrome {
    
   /*
    Requires: This method assumes single word Strings.Not case senstive. 
              Not guaranteed to work with spaces inbettween words
    Modifies: Takes input 'word', makes a reversed copy and then compares the two 
    Effects: Returns true if the word and it's reverse form is equal
                 returns false otherwise.
    */
    public static boolean isPalindrome(String word)
    {
        word = word.toLowerCase();//Make 'word' non case sensitve
        char temp[] = word.toCharArray();//converts 'word' to char array in order to reverse it
        char reverse[]= new char[temp.length];//create a holder for the reverse of 'word'
                
        //Take the contents of 'word' and puts it in reverse order into 'reverse'
        for(int i =0, o = temp.length-1;i < temp.length;i++,o--)
        {
            reverse[i]=temp[o];
        }
        
        //Convert char array to a string inorder to compare it to the original word.
        String reversed = new String(reverse);
        
        if(reversed.equals(word))
        {
            return true;// true if 'word' equals it's reversed form
        }        
        
        return false;//false if 'word' is not equal to it's reversed form
    }
    
    public static void main(String[] args)
    {
        //User prompt
        System.out.println("Please enter a word to find out if it is a palindrome");
        //Create scanner to take user input
        Scanner input = new Scanner(System.in);
        //Create String variable to hold user input
        String  wordIn = input.nextLine();
        //Create boolean varible to hold isPalindrome result
        boolean flag = Palindrome.isPalindrome(wordIn);
   
        //Print out appropriate message based off of isPalindrome result
        if(flag == true)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
       
        
    }
    
}
