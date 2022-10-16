package StringBuilder_.案例;

public class test {
    public static void main(String[] args) {
        int[] arr = {111,222};
        System.out.println(toString1(arr));
    }

    public static String toString1(int[] arr) {
        if(arr != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i==arr.length-1?"":",");
            }
            sb.append("]");
            return sb.toString();
        }
        else
            return null;
    }
}
