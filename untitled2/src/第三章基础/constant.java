package 第三章基础;

//常量
public class constant {
    static final int age = 17;  //如果不对age赋值会报错
    public static void main(String[] args) {
        final int age;
        age = 18;
//        int num = 12;
//        num = 13;
//        age = 19;    //这里会报错说age预分配
        System.out.println(constant.age);
        System.out.println(age);
//        System.out.println(num);

    }

}
