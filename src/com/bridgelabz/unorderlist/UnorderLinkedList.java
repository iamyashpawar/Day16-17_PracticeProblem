package com.bridgelabz.unorderlist;

public class  UnorderLinkedList<T> {

  Node<T> head;
   Node<T> tail;



    public void insert(String data) {
        Node<T> newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Node<T> search(T searchData) {
        Node<T> temp = head;

        while (temp != null) {
            if (temp.data.equals(searchData)) {

                return temp;
            }
            temp = temp.next;
        }
        return  null;
    }

    public void push(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }


    public void remove(String searchedWord) {
        T popData = head.data;
        head = head.next;
    }

    public void display() {
        Node<T> temp = head;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean insertAfter(T searcheData, T insertData) {
        Node<T> insertNode = new Node<>(insertData);
        Node<T> searchedNode= search(searcheData);
         if(searchedNode != null)
         {
             Node<T> temp = searchedNode.next;
             searchedNode.next = insertNode;
             insertNode.next = temp;
             return true;

         }
        return false;
    }
}
