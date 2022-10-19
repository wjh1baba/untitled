package 泛型.泛型接口;

public class Teacher {
    private String name;
    private String age;

    public Teacher(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Teacher tc = new Teacher("李冲","250");

        TeacherDate td = new TeacherDate();
        System.out.println(tc
        );
        td.add(tc);
    }
}
