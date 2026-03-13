package Stack;

public class StackImplementation {
    static int stack[] = new int[5];
    static int top = -1;

    static void push(int x) {
        if (top == 4) {
            System.out.println("Stack Full");
        } else {
            top++;
            stack[top] = x;
        }
    }
    static void peek() {
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Top Element: " + stack[top]);
        }
    }

    static void pop(){
        if (top==-1){
            System.out.println("Stack Empty");
        }
        else{
            System.out.println("Top Element : "+stack[top]);
        }
    }
    static void display(){
        if(top==-1) {
            System.out.println("Stack Empty");
        } else {
            for(int i =top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }public static void main (String args[]){
        push(10);
        push(20);
        push(30);
        display();
        pop();
        peek();
    }
        }

