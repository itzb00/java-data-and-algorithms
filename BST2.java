package bst;

import java.util.LinkedList;
import java.util.Queue;

public class BST2 {

    public static void main(String[] args) {
        Node thirtyThree = new Node(33,null,null);
        Node fortyOne = new Node(41, null,null);
        Node seventyTwo = new Node(72,null,null);
        Node thirtyEight = new Node(38,thirtyThree,fortyOne);
        Node twentyOne = new Node(21,null,null);
        Node sixty = new Node(60,null,seventyTwo);
        Node twentySeven = new Node(27,twentyOne,thirtyEight);
        Node fifty = new Node(50,null, sixty);
        Node root = new Node(42,twentySeven,fifty);
        printPaths(root);
    }
    static void printPaths(Node root) {
        int path[] = new int[1000];
        printPathsRecur(root,path,0);
    }

    static void printPathsRecur(Node root, int path[], int pathLen) {
        if (root == null)
            return;
        path[pathLen] = root.getValue();
        pathLen++;
        if (root.getLeftChild() == null && root.getRightChild() == null)
            printArray(path, pathLen);
        else {
            printPathsRecur(root.getLeftChild(), path, pathLen);
            printPathsRecur(root.getRightChild(), path, pathLen);
        }
    }

    static void printArray(int ints[], int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }

    public static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (true) {
            int count = q.size();
            if (count == 0) break;
            while (count > 0) {
                Node node = q.peek();
                System.out.println(node.getValue() + " ");
                q.remove();
                if (node.getLeftChild() != null) q.add(node.getLeftChild());
                if (node.getRightChild() != null) q.add(node.getRightChild());
                count --;
            }
            System.out.println();
        }
    }

    public static void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.getLeftChild());
        System.out.println(node.getValue());
        inOrder(node.getRightChild());
    }

    public static void preOrder(Node node) {
        if (node == null) return;
        System.out.println(node.getValue());
        preOrder(node.getLeftChild());
        preOrder(node.getRightChild());
    }

    public static void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.getLeftChild());
        postOrder(node.getRightChild());
        System.out.println(node.getValue());
    }
}
