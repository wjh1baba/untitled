package 存储学生对象并遍历;

public class Student<T,T1> {
    private T name;
    private T1 age;

    public Student(T name, T1 age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T1 getAge() {
        return age;
    }

    public void setAge(T1 age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
