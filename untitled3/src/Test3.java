import java.util.Arrays;

public class Test3 {
    /**
     * 需求: 对下面的数组进行排序
     *
     * o1-o2 表示升序,  o2-o1 表示降序
     * Integer  简单理解就是一个 int 就行
     */
    public static void main(String[] args) {
        Integer[] ints = {3, 6, 4, 1, 5, 2};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints,(o1, o2) -> o2-o1);
        System.out.println(Arrays.toString(ints));
    }
}
