package Week5.Week6.Date1025;

public class HashFunction {
    public int hash(String key){
        int asciiSum=0;
        for(int i = 0; i < key.length(); i++){
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;
    }
}
