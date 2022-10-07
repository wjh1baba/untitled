package fengzhuang;

//使用private(私有，隐藏) 修饰，只能在本类中访问
public class Private {

    private int age;

//    private 修饰谁  set就跟谁  set是赋值
//    如下
//    private int ddd;
//    private void setDdd(){}

    public void setAge(int age) {
        if (age >= 1 && age < 200) {
            this.age = age;
        } else {
            System.out.println("输入年龄超出正常值");
        }
    }

    public int getAge() {
        return age;
    }
}
