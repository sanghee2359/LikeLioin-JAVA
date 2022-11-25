package Week6.Date1025;

import java.util.HashSet;
import java.util.Set;

public class HashFunction2 {
    private int size = 10000;
    private int [] table = new int[size];
    public HashFunction2(){

    }

    public HashFunction2(int size) { // 매개변수가 size인 생성자
        this.size = size;
        this.table = new int[size];
    }
    public int hash(String key) { // hash 함수
        int asciiSum = 0;
        for(int i = 0; i<key.length(); i++){
            char c = key.charAt(i);
            int ascii = c;
            System.out.printf("%s %d\n", c, ascii);
            asciiSum += ascii;
        }
//        return asciiSum % size; // 나머지로 index를 만드는 이유는 뭘까?
//        System.out.println("asciiSum:"+asciiSum);
        return asciiSum % size;
        /*
        1. 지정된 크기의 배열에 값을 저장하기 때문
        2. size로 정한 배열의 어딘가로 가도록 하기 위함
        */
    }
    public void insert(String key, Integer value){
        int hashCode = hash(key);
        this.table[hashCode] = value;
        System.out.println(key + " "+hashCode+"방에 저장이 완료 되었습니다.");
    }
    public int search(String key) {
        return this.table[hash(key)]; // search(key)형태로 값을 받아온다.
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
