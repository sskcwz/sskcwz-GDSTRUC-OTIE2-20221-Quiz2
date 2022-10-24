package com.gdstruc.module2;

import java.util.Objects;

public class PlayerLinkedList {
    private PlayerNode head;

    // function to add a new player to the front of the linked lists
    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    // function to print the elements of the linked list
    public void printList() {
        System.out.print("HEAD -> ");
        PlayerNode current = head;

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayer();
        }

        System.out.print(" NULL\n");
    }

    //remove front element
    public void remove(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = null;
    }

    //check if list contains a certain element
    public boolean contains(Player player) {
        if(Objects.equals(player,0)){
            System.out.println("This element exists in this list.");
        }
        else {
            System.out.println("This element does not exist in this list.");
        }
        return false;
    }

    // check index of a certain element
    public void indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;

        while (current != null){
            current = current.getNextPlayer();
        }
        System.out.print("The element's index is " + index);
    }
}
