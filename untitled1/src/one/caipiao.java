package one;

import java.util.Arrays;
import java.util.Random;

public class caipiao {
    public static void main(String[] args) {
        int[] luckNumbers = createnumber();
        for (int i = 0; i < luckNumbers.length; i++) {
            System.out.println(luckNumbers[i]);
        }
    }

    public static int[] createnumber() {
        int[] numbers = new int[7];
        Random r = new Random();
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean flag = true;
            while (true){
                int data = r.nextInt(33) + 1;

                for (int j = 0; j < i; j++) {
                    if (numbers[j] == data){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    numbers[i] = data;
                    break;
                }
            }

        }
        numbers[numbers.length-1] = r.nextInt(16)+1;
        return numbers;
    }

}
