package datastructures.binarysearchtree;


public class BinarySearchTree {

    // ROOT MUST BE PUBLIC FOR CODE IN MAIN METHOD TO WORK
    public Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value){
        Node newNode = new Node(value);
        if (root == null){
            root = newNode;
        }
        Node tracker = root;
        while (true){
            if (tracker.value == newNode.value) break;
            if (tracker.value > newNode.value){
                if (tracker.left == null){
                    tracker.left = newNode;
                    break;
                }
                tracker = tracker.left;
            } else {
                if (tracker.right == null){
                    tracker.right = newNode;
                    break;
                }
                tracker = tracker.right;
            }
        }
    }
    // WRITE INSERT METHOD HERE //
    //                          //
    //                          //
    //                          //
    //                          //
    //////////////////////////////

}