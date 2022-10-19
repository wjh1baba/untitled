package lambda表达式;

public class test2 {
    public static void main(String[] args) {
        Add1 ad = (a, b) -> a + b;
        System.out.println(ad.add(17, 18));
    }
}


interface Add1 {
    int add(int a, int b);
}