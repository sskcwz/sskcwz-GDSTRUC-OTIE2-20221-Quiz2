package com.gdstruc.module2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // add players to the ArrayList
        Player goku = new Player(1, "Goku", 9001);
        Player vegeta = new Player(2, "Vegeta", 9000);
        Player broly = new Player(3, "Broly", 20000);

        // add the players to a linked list
        PlayerLinkedList linkedList = new PlayerLinkedList();
        linkedList.addToFront(goku);
        linkedList.addToFront(vegeta);
        linkedList.addToFront(broly);

        linkedList.printList();
        System.out.println("Deleting first element in the list... ");

        linkedList.remove(broly);
        linkedList.addToFront(goku);
        linkedList.addToFront(vegeta);

        linkedList.printList();
        linkedList.contains(new Player(3, "Broly", 20000));
        linkedList.indexOf(vegeta);
    }
}