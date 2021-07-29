package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList implements Comparable{

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head =null;
    public Node tail=null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void removeNode(int key) {
        Node remove = new Node(key);
        Node current = head;
        Node last = null;

        if (current!= null && current.data==key){
            head=current.next;
        }
        while(current!= null && current.data!=key){
            last=current;
            current=current.next;
        }
        if(current==null){
            System.out.println("There's nothing here...>_>");
        }
    }
    public boolean contains(int key) {
        Node current = head;
        Node last = null;
        if(current==null){
            System.out.println("There's nothing here...>_>");
            return false;
        }
        while(current!= null && current.data!=key){
            last=current;
            current=current.next;
            }
        if (current!= null && current.data==key){
                return true;
        }return false;
    }

    public int size(){
        int count=0;
        Node current=head;

        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public int find(int value){
        int count=1;
        Node current=head;
        while(current!=null&& current.data!=value){
            count++;
            current=current.next;
        }if (current!=null&& current.data==value){
            return count;
        }return -1;
    }
    public int get(int index){
        int count=1;
        Node current=head;
        while(count!=index&&current!=null){
            count++;
            current=current.next;
        }if (count==index){
            return current.data;
        }return -1;
    }
    public SinglyLinkedList copy(){
        Node current = head;
        SinglyLinkedList counterfeit = new SinglyLinkedList();
        while(current != null) {
            //Prints each node by incrementing pointer
            counterfeit.addNode(current.data);
            current = current.next;
        }
        return counterfeit;
    }
    public void sort(){
        Node current = head;
        int temp;
        if(head == null) {
            System.out.println("List is empty");
        } else
        { while(current!=null){
                Node index=current.next;
                while(index!=null){
                    if(current.data>index.data){
                        temp=current.data;
                        current.data=index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                current=current.next;
        }
        }
    }

    public int compareTo(Object o) {
        return 0;
    }
    public void display(){
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


