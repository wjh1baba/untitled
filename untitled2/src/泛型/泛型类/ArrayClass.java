package 泛型.泛型类;

import java.util.Arrays;

public class ArrayClass<T> {
    private T[] arr;

    public T[] getArr() {
        return arr;
    }

    public ArrayClass(T[] arr) {
        this.arr = arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;

    }

    @Override
    public String toString() {
        return "ArrayClass{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}


class Test3 {
    public static void main(String[] args) {
        String[] arr1 = {"李冲","李景"};
        ArrayClass<String> ac = new ArrayClass<>(arr1);
        System.out.println(ac);
    }
}

