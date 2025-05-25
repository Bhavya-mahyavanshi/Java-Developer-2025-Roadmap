import java.util.*;

class TreeClass{
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

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }

        }
    }
    //Count of nodes
    public static int TotalCount(Node root){
        if(root == null){
            return 0;
        }
        
        int leftNodes = TotalCount(root.left);
        int rightNodes = TotalCount(root.right);

        return leftNodes + rightNodes + 1;
    }
    //Sum of Nodes
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);

        return leftsum + rightsum + root.data;
    }

    //Height of a tree
    public static int HeightofTree(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = HeightofTree(root.left);
        int rightheight = HeightofTree(root.right);

        int myHeight = Math.max(leftheight, rightheight) + 1;

        return myHeight;
    }

    //Diameter of tree (Question as been asked in Adobe and snapdeal)
    //Two approaches : [1] O(N^2) ---> Diam1 -> LS
    //                                 Diam2 -> Rs 
    //                                 Diam3 -> LS + RS + 1

    public static int diameter1(Node root){
        if(root == null){
            return 0;
        }

        int diam1 = diameter1(root.left);
        int diam2 = diameter1(root.right);
        int diam3 = HeightofTree(root.left) + HeightofTree(root.right) + 1;

        return Math.max(diam3 , Math.max(diam1, diam2));
    }

    //[2] O(N) --> store Height and diameter on each level (Optimizing approach 1)
    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root == null){
           return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(diam3, Math.max(diam1,diam2));

        TreeInfo myinfo = new TreeInfo(myHeight, myDiam);
        return myinfo;
    }

    //Subtree of Another tree (Microsoft, Facebook, Amazon)
    //LeetCode: https://leetcode.com/problems/subtree-of-another-tree/description/?envType=problem-list-v2&envId=tree
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println("\n");
        levelOrder(root);
        System.out.println();
        System.out.println("Count: " + TotalCount(root));
        System.out.println("Sum of Nodes: " + sumOfNodes(root));
        System.out.println("Height: " + HeightofTree(root));
        System.out.println("Diameter Approach 1: " + diameter1(root));
        System.out.println("Diameter Approach 2: " + diameter2(root).diam);
    }
    
} 