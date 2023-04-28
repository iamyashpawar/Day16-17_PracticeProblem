package com.bridgelabz.unorderlist;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class UnorderLinkedListMain {
    public static void main(String[] args) throws Exception {
        UnorderLinkedList<String> linkedList1 = new UnorderLinkedList<>();

       linkedList1.push("Welcome");
        linkedList1.push("Java");
        linkedList1.push("Programming");

        linkedList1.display();

       Node<String> searchNode = linkedList1.search("to");

       if(searchNode !=null  )
       {
           System.out.println("Element Found");
       }else {
           System.out.println("Element not found");
           linkedList1.insert(searchNode);
       }














    }
}
