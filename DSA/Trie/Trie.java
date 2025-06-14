package DSA.Trie;

/*
 * Note: if you want to store all valid charater in java
 *       than the array size become 256 
 */
public class Trie {
    static class Node{
        Node[] childern; //As we are make a basic trie, the length of array is 26, equal to  the number of Alphabet
        boolean endOfWord;

        public Node(){
            childern = new Node[26]; //a-z
            for(int i = 0; i < 26; i++){
                childern[i] = null;
            }

            endOfWord = false;
        }
    }

    static Node root = new Node(); //Null or Empty node.

    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.childern[idx] == null){
                //add new node
                curr.childern[idx] = new Node();
            }

            if(i == word.length() - 1){
                curr.childern[idx].endOfWord = true;
            }

            curr = curr.childern[idx];
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i = 0; i < key.length(); i++){ //O(L); L = key Length
            int idx = key.charAt(i) - 'a';
            Node node = curr.childern[idx];

            if(node == null){
                return false;
            }

            if(i == key.length() - 1 && node.endOfWord == false){
                return false;
            }

            curr = curr.childern[idx];
        }

        return true;
    }
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i = 1; i <=key.length(); i++){
            String firstpart = key.substring(0, i);
            String secondPart = key.substring(i);

            if(search(firstpart) && wordBreak(secondPart)){
                return true;
            }
        }

        return false;
    }

    public static boolean startsWith(String key){
        Node curr = root;
        for(int i = 0; i < key.length(); i++){ //O(L); L = key Length
            int idx = key.charAt(i) - 'a';
            Node node = curr.childern[idx];

            if(node == null){
                return false;
            }
            curr = curr.childern[idx];
        }

        return true;
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(root.childern[i] != null){
                count += countNode(root.childern[i]);
            }
        }


        return count+1;
    }

    public static String ans = "";

    public static void longetWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i = 0; i < 26; i++){
            if(root.childern[i] != null && root.childern[i].endOfWord == true){
                temp.append((char)(i + 'a'));

                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longetWord(root.childern[i], temp);

                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        //Uncomment this first comment to understant the Trie DS
        
        
        
        /*
        String words[] = {"the", "a", "there", "their", "any"}; 

        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("their")); //true
        System.out.println(search("thor")); //false
        System.out.println(search("an")); //false
        */





        /*
         * Word Break Probelm [Asked in Google Interview]
         * 
         * Context: Given an input string and a dictionary of words, find out if the 
         *          input string can be broken into a space-separated sequence of 
         *          dictionary words
         * 
         * Example: Words[] = {i, like, sam, samsung, mobile, ice}
         * key = "ilikesamsung"
         * 
         * output: true
         */




        /*
        String words[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        String key = "ilikesung";

        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }

        System.out.println(wordBreak(key));
        */





        /*
         * Starts With Problem
         * 
         * context: Create a function boolean startsWith(String prefix) for a trie
         *          Returns true if there is a previously inserted string word that 
         *          has the prefix prefix, and false otherwise
         * 
         * Example: words[] = {"apple", "app", "mango", "man", "woman"}
         * 
         * prefix: "app"     output: true
         * prefix: "moon"  output: false
         */
        
        
        
        
        /*String words1[] = {"apple", "app", "mango", "man", "woman"};
        String prefix = "moon";

        for(int i = 0; i < words1.length; i++){
            insert(words1[i]);
        }

        System.out.println(startsWith(prefix));
        */

      
      
      
      
        /*
         * Count unique SubStrings [Microsoft, Google]
         * 
         * context: Given a string of length n of lowercase alphabet, we need 
         *          to count total number of distinct substrings of the string
         * 
         * Example: str = "ababa"
         * ans = 10
         * 
         * Note: Substring ---> all prefix of all suffix
         */
        
        
        
        
        
         /*
        String str = "ababa";
        
        for(int i = 0; i < str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNode(root));
        */




        /*
         * Longest word with all prefixes
         * 
         * context: find the longest string in words such that every prefix
         *          of it is also in words
         * 
         * Example: words[] = {"a", "banana", "app", "ap", "apply", "apple"}
         *          answer = "apple"
         * 
         * Note: if there are multiple answer than we will print the answer that 
         *       is lexicographically smaller
         */
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }

        longetWord(root, new StringBuilder(""));
        System.out.println(ans);
    }

}
