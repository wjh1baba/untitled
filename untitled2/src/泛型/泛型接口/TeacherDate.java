package 泛型.泛型接口;

import java.util.ArrayList;

public class TeacherDate implements Date<Teacher> {


    @Override
    public void add(Teacher teacher) {
        System.out.println(teacher+"666");
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public Teacher queryById(int id) {
        return null;
    }
}
