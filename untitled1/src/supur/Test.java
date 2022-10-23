package supur;

public class Test{
    public static void main(String[] args) {
        teacher tr = new teacher("666",10);

        System.out.println(tr.getName());
        System.out.println(tr.getAge());

    }
}

class people {
    private String name;
    private int age;

    public people() {
    }

    public people(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



class teacher extends people{
    public teacher() {
    }

    public teacher(String name, int age) {
        super(name,age);
//        setName(name);
//        setAge(age);

    }

}


