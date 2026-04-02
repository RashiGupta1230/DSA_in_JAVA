package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ImplementationOfLinkedList {
    static Node head = null;

    static void insertBeginning(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    static void insertEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node t = head;
        while (t.next != null) t = t.next;
        t.next = n;
    }

    static void insertMiddle(int data, int pos) {
        Node n = new Node(data);
        if (pos == 1) {
            n.next = head;
            head = n;
            return;
        }
        Node t = head;
        for (int i = 1; i < pos - 1 && t != null; i++) t = t.next;
        if (t == null) return;
        n.next = t.next;
        t.next = n;
    }

    static void deleteBeginning() {
        if (head != null) head = head.next;
    }

    static void deleteEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node t = head;
        while (t.next.next != null) t = t.next;
        t.next = null;
    }

    static void deleteMiddle(int pos) {
        if (head == null) return;
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node t = head;
        for (int i = 1; i < pos - 1 && t.next != null; i++) t = t.next;
        if (t.next == null) return;
        t.next = t.next.next;
    }

    static void traverse() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, data, pos;

        do {
            System.out.println("1.Insert Beginning");
            System.out.println("2.Insert End");
            System.out.println("3.Insert Middle");
            System.out.println("4.Delete Beginning");
            System.out.println("5.Delete End");
            System.out.println("6.Delete Middle");
            System.out.println("7.Traverse");
            System.out.println("8.Exit");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    data = sc.nextInt();
                    insertBeginning(data);
                    break;
                case 2:
                    data = sc.nextInt();
                    insertEnd(data);
                    break;
                case 3:
                    data = sc.nextInt();
                    pos = sc.nextInt();
                    insertMiddle(data, pos);
                    break;
                case 4:
                    deleteBeginning();
                    break;
                case 5:
                    deleteEnd();
                    break;
                case 6:
                    pos = sc.nextInt();
                    deleteMiddle(pos);
                    break;
                case 7:
                    traverse();
                    break;
            }
        } while (ch != 8);
    }
}
