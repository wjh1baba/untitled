public class Test{
    public static void main(String[] args) {
        UI u = new UI();
        u.huihua1();
        Java J = new Java("李冲",'男',11);

    }
}

class Student{
    private String name;
    private char sex;
    private int age;

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void word(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


interface huihua{
    void huihua1();
}

class Java extends Student{
    public Java() {
    }

    public Java(String name, char sex, int age) {
        super(name, sex, age);
    }
}

class UI extends Student implements huihua{

    @Override
    public void huihua1() {
        System.out.println("溜溜球");
    }
}