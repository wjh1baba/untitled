package 泛型.泛型类;

public class Test2 {
    public static void main(String[] args) {
        Book<String,Integer> bk = new Book<>("小洋");
        Book<Integer,Boolean> bk1 = new Book<>(17);

        System.out.println(bk.getClass());
    }
}

class Book<E,E1>{
    private E name;

    public Book(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }


}
