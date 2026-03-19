package Stack;

import java.util.Scanner;

public class StackImplementation {
    static int stack[] = new int[5];
    static int top = -1;

    static void push(int x) {
        if (top == 4) {
            System.out.println("Stack Full");
        } else {
            stack[++top] = x;
        }
    }

    static void peek() {
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Top Element: " + stack[top]);
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    static void isEmpty() {
        if (top == -1)
            System.out.println("Stack Empty");
        else
            System.out.println("Stack Not Empty");
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Push 2.Pop 3.Peek 4.isEmpty 5.Display 6.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int x = sc.nextInt();
                    push(x);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    isEmpty();
                    break;
                case 5:
                    display();
                    break;
            }
        } while (choice != 6);

        sc.close();
    }
}