package com.fresco.play;
import java.util.Scanner;
import java.util.*;


public class Anagram 
{
    public static void main(String a[]){
       Scanner sc = new Scanner (System.in);
        //String str1=null;
        //String str2=null;

        // Write code to get 2 strings/sentences from command line and check if they are Anagrams
        System.out.println("Wanna check if your strings are anagrams???");
        System.out.print("Enter String1 : ");
        //Get user input in str1
       
        String str1=sc.nextLine();
        
        System.out.print("Enter String2 : ");       
        //Get user input in str2
        String str2=sc.nextLine();
        
        boolean status = isAnagram(str1,str2);

         if (status) {  
            System.out.println("Whoa!!!! "+str1 + " is a perfect ANAGRAM of " + str2 ); 
            
        } else {  
            System.out.println("Oh no!!! "+str1 + " and " + str2 + " do not match up to be Anagrams...");  
            
        }   
       
    }

       
     static boolean isAnagram(String str1, String str2) {  
        
        /*Compare if in1 and in2 are Anagrams and return true or false.
        This method should satisfy all the tests in AnagramTest.java*/
       
           int n1 = str1.length();
           int n2 = str2.length();
 
    // If length of both strings is not same, then they
    // cannot be anagram

ArrayList <Character> in1 = new ArrayList <Character> ();
ArrayList <Character> in2 = new ArrayList <Character> ();
  String str1l=str1.toLowerCase();
  String str2l=str2.toLowerCase();
  

    for(int i=0;i<str1.length();i++){
     if((str1l.charAt(i)>='a' && str1l.charAt(i)<='z') )
      in1.add(str1l.charAt(i));

    }
    
     for(int i=0;i<str2.length();i++){
   
      if((str2l.charAt(i)>='a' && str2l.charAt(i)<='z')  )
      in2.add(str2l.charAt(i));
    }


    // Sort both the strings
       Collections.sort(in1);
        Collections.sort(in2);
        
//System.out.println("\n"+in1);
//System.out.println(in2);
        
        if(in1.size()!=in2.size())
        return false;

       
        for (int i = 0; i < in1.size(); i++) {
       // System.out.println(in1.get(i)+" "+in2.get(i));
            if (in1.get(i) != in2.get(i))
                return false;
        }
 
        return true;
 

   
    }  

}

