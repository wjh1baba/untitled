package 泛型.泛型方法;

public class Test {
    public static void main(String[] args) {
        String[] names = {"小李","小冲"};
        printArray(names);
    }

    private static <T> void printArray(T[] t) {
        if (t != null){
            StringBuilder sb = new StringBuilder(new String("["));
            for (int i = 0; i < t.length; i++) {
                sb.append(t[i]).append(i == t.length-1?"":",");
            }
            sb.append("]");
            System.out.println(sb);
        }
        else
            System.out.println(t);
    }
}
