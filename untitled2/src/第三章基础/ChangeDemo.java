package 第三章基础;

public class ChangeDemo {
    public static void main(String[] args) {
        int[] arr = {12,19};
        System.out.println("第一个值是"+arr[0]+"第二个值是"+arr[1]);
        exchange(arr);
        System.out.println("第一个值是"+arr[0]+"第二个值是"+arr[1]);
    }

    private static void exchange(int[] arr) {
        int num;
        num = arr[0];
        arr[0] = arr[1];
        arr[1] = num;
    }
}
