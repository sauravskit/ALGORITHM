package Code;


import Code.Singleylinkedist.Node;

//Importing basic required classes
import java.io.*;
import java.util.*;

//Main class
//To add elements to HashMap
public class GFG {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

	}

	Node head;

	public void addfirst(int temp) {
		Node newNode = new Node(temp);
		if (head != null) {

			newNode.next = head;
			head = newNode;
		} else {
			head = newNode;
		}
		display();
	}

	public void addlast(int temp) {
		Node newNode = new Node(temp);
		Node curr = head;
		if (head != null) {
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		} else {
			head = newNode;
		}
		display();
	}

	public void atAnyPlace(int temp, int pos) {
		Node newNode = new Node(temp);
		Node curr = head;

		while (--pos > 0) {
			curr = curr.next;

		}
		newNode.next = curr.next;
		curr.next = newNode;
		System.out.println("display after anyposition");
		display();
	}

	public void deleteAtBeg() {
		head = head.next;
		System.out.println("display after del at beg");
		display();
	}

	public void deleteAtLast() {
		System.out.println("display before del at end");
		display();
		Node tempNode = head;
		while (tempNode.next.next != null) {
			tempNode = tempNode.next;
		}
		tempNode.next = null;
		System.out.println("display after del at end");
		display();
	}

	public void deleteatanyPos(int pos) {
		Node tempNode = head;
		while (--pos > 0) {
			tempNode = tempNode.next;
		}
		tempNode.next = tempNode.next.next;
		System.out.println("display after del at pos");
		display();
	}

	public void display() {

		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

	public void reverse() {
		System.out.println("display before reversal");
		display();
		Node prev = null;
		Node next = null;
		Node current = head;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		prev = null;
		System.out.println("display after reversal");
		display();
	}

	public static void main(String[] args) {
		GFG object = new GFG();
		// object.addfirst(1);
		int[] x = { 1, 2, 3, 4, 5 };
		for (int i : x) {
			object.addlast(i);
		}
		// object.atAnyPlace(4, 3);
		// object.deleteAtBeg();
		// object.deleteAtLast();
		// object.deleteatanyPos(3);
		object.reverse();
	}
}
