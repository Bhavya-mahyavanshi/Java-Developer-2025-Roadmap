import java.util.*;
class BinarySearchTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }  

    //Function to make binary search tree
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //Binary Search in BST
    public static boolean search(Node root, int key){ //Time complexity: O(H)
        if(root == null){
            return false;
        }

        if(root.data > key){
            //search left subtree
            return search(root.left, key);
        }else if(root.data == key){
            return true;
        }else{
            //search right subtree
            return search(root.right, key);
        }
    }

    //Delete Node from tree
    public static Node delete(Node root, int val){
        if(root.data > val){
           root.left = delete(root.left, val);
        }else if(root.data < val){
            root.right = delete(root.right, val);
        }else{
            //root.data == val;
            //case[1] --> leaf Node
            if(root.left == null && root.right == null){
                return null;
            }

            //case[2] --> one child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return  root.left;
            }

            //Case[3] --> two child
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root .left != null){
            root = root.left;
        }

        return root;
    }

    //Question to print the data that lies in the given range (inclusive)
    public static void printInRange(Node root, int x, int y){
        if(root == null){
            return;
        }

        if(root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        }else if(root.data >= y){
            printInRange(root.left, x, y);
        }else if(root.data <= x){
            printInRange(root.right, x, y);
        }
    }
    
    //Question: print the path from root to leaf
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i) + "-->");
        }
        System.out.println();
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if (root  == null) {
            return;
        }

        path.add(root.data);

        //leaf node condition
        if(root.left == null && root.right == null){
            printPath(path);
        }else{ //non leaf nodes 
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }
    public static void main(String[] args) {
        int[] val = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < val.length; i++){
            root = insert(root, val[i]);
        }
        inorder(root);
        System.out.println();

        printRootToLeaf(root, new ArrayList<>());
    }
}