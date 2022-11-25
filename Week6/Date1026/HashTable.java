package Week6.Date1026;

import Week6.Date1025.HashFunction2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashTable {
    // 저장할 때 key도 같이 저장한다.
    // 배열은 한 칸에 여러 개의 값을 저장할 수 없다.
    class Node{
        private String key;
        private Integer value;
        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
        public String getKey(){
            return key;
        }
        public Integer getValue() {
            return value;
        }
    }
    private int size = 10000;
    List<Node> [] table = new List[size];
    public int hash(String key) { // hash 함수
        int asciiSum = 0;
        for(int i = 0; i<key.length(); i++) {
            char c = key.charAt(i);
            int ascii = c;
            System.out.printf("%s %d\n", c, ascii);
            asciiSum += ascii;
        }
        return asciiSum % size;
    /*
    1. 지정된 크기의 배열에 값을 저장하기 때문
    2. size로 정한 배열의 어딘가로 가도록 하기 위함
    */
    }
    public void insert(String key, Integer value){
        int hashIdx = hash(key);
        if(this.table[hashIdx] == null){
            this.table[hashIdx] = new ArrayList<>();
        }
        this.table[hashIdx].add(new Node(key, value));
    }
    public Integer search(String key) {
        List<Node> nodes = this.table[hash(key)];
        for(Node node : nodes){
            if(key.equals(node.getKey())) return node.value;
        }
        return null;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"name1", "name2", "name3", "name4"};
        HashFunction2 ht = new HashFunction2(200);
        Set<Integer> nameSet = new HashSet<>();
        for(int i = 0; i < names.length; i++){
            nameSet.add(ht.hash(names[i]));
        }
        for (int i = 0; i < names.length; i++){
            ht.insert(names[i], ht.hash(names[i]));
        }
        System.out.println(ht.search("DongyeonKang"));
        System.out.println(ht.search("JiyoungAhn"));

        System.out.printf("%s %s", names.length, nameSet.size());
    }
}
