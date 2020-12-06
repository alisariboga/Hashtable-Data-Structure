public class HashTableArray {

    Entry[] arrayHash;
    int size;

    public HashTableArray(int size) {
        this.size = size;
        arrayHash = new Entry[size];
        for (int i = 0; i < size; i++) {
            arrayHash[i] = new Entry();
        }
    }
    int getHash(int key){
        return key%size;
    }
    public void put(){

    }
}
