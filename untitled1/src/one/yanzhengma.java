package one;

import java.util.Random;

public class yanzhengma {
    public static void main(String[] args) {
        String code = createCode(5);
        System.out.println(code);

    }

    public static String createCode(int n) {
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);//验证码随机大写字母，小写字母，数字
            switch (type) {
                case 0 -> {
                    char ch = (char) (r.nextInt(26) + 65);
                    code += ch;
                    break;
                }
                case 1 -> {
                    char ch1 = (char) (r.nextInt(26) + 97);
                    code += ch1;
                    break;
                }
                case 2 -> {code += r.nextInt(10);
                break;
                }
            }
        }
    return code;
    }
}
