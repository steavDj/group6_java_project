package xander.practice;

import java.util.LinkedList;
import java.util.Random;

// Java Collections utilizes the doubly Linked List (Node pointers for forward and backward)
// Additionally, there are Single Linked Lists; Must be done manually for Java

/*
Problem 1: Find the Middle Element of a LinkedList

Write a Java program that finds the middle element of a doubly linked list. If there are two middle elements
(i.e., for lists with an even number of nodes), find the second middle element.
 */

/*
Problem 2: Reverse a LinkedList

Write a Java program that reverses a doubly linked list. You need to implement the following:
LinkedList Node: A class representing a node in the linked list.
Reverse Function: A function that reverses the linked list.
*/

public class LinkedListTasks {
    public static void main(String[] args) {

        LinkedList<Integer> list = randomLinkedList(9);

        System.out.println(list);
        middleElement(list);

        System.out.println("-----");

        System.out.println(list);
        reverseList(list);

    }

    public static void middleElement(LinkedList<Integer> list) {

        // Check if Linked List is null or empty before trying to find the element
        if (list == null || list.isEmpty()) {
            System.out.println("Invalid Linked List");
            return;
        }

        // Tortoise & Hare Approach
        int tortoise = 0;
        int hare = 0;

        while (hare + 1 < list.size()) {
            tortoise += 1;
            hare += 2;
        }

        // Print the middle element (tortoise)
        int middle = list.get(tortoise);
        System.out.println(middle);

    }

    public static void reverseList(LinkedList<Integer> list) {

        LinkedList<Integer> reversedList = new LinkedList<>();

        // Uses the current head to add the first element, effectively shifting right with more elements
        for (int i = 0; i < list.size(); i++) {
            reversedList.addFirst(list.get(i));
        }

        System.out.println(reversedList);

    }

    public static LinkedList<Integer> randomLinkedList(int size) {

        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }

        return list;
    }

}
