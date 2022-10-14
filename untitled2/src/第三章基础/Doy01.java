package 第三章基础;

public class Doy01 {
    public String name = "名字";      //public全部全局变量
    static String name1 = "名字1";           //默认权限  同一个包下面的其他类
    private static String name2 = "名字2";     //private只可在本类中直接访问
    protected String name3 = "名字3";   //protected只可在同包其他类或子类，继承的子类都可以使用

//   public String name = "姓名";   在方法中是局部变量，不能加public

    public static String getName2() {
        return name2;
    }

    public static void setName2(String name2) {
        Doy01.name2 = name2;
    }


}
