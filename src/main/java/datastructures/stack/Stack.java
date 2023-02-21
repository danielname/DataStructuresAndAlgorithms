package datastructures.stack;

public class Stack {

    class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    private Node top;
    private int height;

    Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }


    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE//
    //                                                         //
    //                                                         //
    //                                                         //
    //                                                         //
    /////////////////////////////////////////////////////////////

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        if (top == null) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

}