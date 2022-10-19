package 泛型.泛型接口;

public interface Date<E>{
    void add(E e);
    void delete(int id);
    void update(E e);
    E queryById(int id);
}
