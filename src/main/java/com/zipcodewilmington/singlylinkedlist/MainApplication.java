package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        //Add nodes to the list
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);

        //Displays the nodes present in the list
        list.display();

        //Counts the nodes present in the given list
        System.out.println("Count of nodes present in the list: " + list.size());
    }
}

