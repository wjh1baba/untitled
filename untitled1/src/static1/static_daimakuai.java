package static1;

public class static_daimakuai {
    public static void main(String[] args) {

        System.out.println("-------main代码块-----");
        System.out.println(schoolname);

    }

    private static String schoolname;

    public static String getSchoolname() {
        return schoolname;
    }

    public static void setSchoolname(String schoolname) {
        static_daimakuai.schoolname = schoolname;
    }

    static {
        schoolname = "黑马";
        System.out.println("-----静态代码块------");
    }
}

