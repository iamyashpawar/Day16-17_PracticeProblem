package com.bridgelabz.unorderlist;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class UnorderLinkedListMain {
    public static void main(String[] args) throws Exception {
        UnorderLinkedList<String> linkedList1 = new UnorderLinkedList<>();

       linkedList1.push("Programming");
        linkedList1.push("Java");
        linkedList1.push("Welcome");

        linkedList1.display();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word ");
        String searchElement = sc.next();

      linkedList1.search(searchElement);

       if(linkedList1.equals(searchElement)  )
       {
           System.out.println("Element Found");
       }else {
           System.out.println("Element not found");
           boolean isInserted =linkedList1.insertAfter("Welcome" , searchElement);

       }



        System.out.println("******");
    linkedList1.display();













    }
}
