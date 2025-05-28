import java.util.*;

class ImplementationOfHashMap{

    //<K,V> are generics
    static class HashMap<K,V> {
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[]; //N = buckets.length;

        @SuppressWarnings("unchecked") //to Remove the warinings from the output window
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){ //The bi need to be btn 0 to N-1
           int bi = key.hashCode();
           return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll= buckets[bi];
            @SuppressWarnings("unused")
            int di = 0;
            for(int i = 0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i; //di
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i = 0; i < N*2; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0; i < oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key); //bucket index
            int di = searchInLL(key, bi); //data index
            //di >= 0, valid value or -1 if key not exist

            if(di == -1){ //key doesnt exist
                buckets[bi].add(new Node(key, value));
                n++;
            }else{//Key Exist
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                //Rehashing
                rehash();
            }
        }

        public V get(K key){
            int bi = hashFunction(key); 
            int di = searchInLL(key, bi); 

            if(di == -1){ //key doesnt exist
               return null;
            }else{//Key Exist
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); 

            if(di == -1){ //key doesnt exist
                return false;
            }else{//Key Exist
                return true;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); 

            if(di == -1){ //key doesnt exist
                return null;
            }else{//Key Exist
               Node node = buckets[bi].remove(di);
               n--;
               return node.value;
            }
        }

        public boolean isEmpty(){
            return n == 0;
        }

        public ArrayList<K> KeySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0; i < buckets.length; i++){ //bi
                LinkedList<Node> ll = buckets[i];
                for(int j = 0; j < ll.size(); j++){ //di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 220);
        map.put("USA", 90); //Worse case time complexity --> O(n)
    
        ArrayList<String> keys = map.KeySet();
        for(int i = 0; i < keys.size(); i++){
            System.out.println(keys.get(i)+ " "+ map.get(keys.get(i)));
        }

        map.remove("China");
        System.out.println(map.get("China"));
    }
}