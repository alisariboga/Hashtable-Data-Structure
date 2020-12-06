public class Demo {
    public static void main(String[] args) {
        HashTableArray<String > test = new HashTableArray<>(10);
        test.put(11, "Ali");
        test.put(12, "Can");
        test.put(13, "Veli");
        test.put(11, "Ali");

        System.out.println(test.get(11));
    }
}
