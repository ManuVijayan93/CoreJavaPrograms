package com.treeset2book;

import java.util.*;

public class TreeSetDemo {  
public static void main(String[] args) {  
    Set<Book> hs=new TreeSet<Book>();  
    //Creating Books  
    Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding Books to TreeSet  
    hs.add(b1);  
    hs.add(b2);  
    hs.add(b3);  
    //Traversing TreeSet  
    for(Book b:hs){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}
