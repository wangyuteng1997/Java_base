package Obj.object;

/**
 * @author wang yuteng
 * @data 2020/7/1 17:27
 */
public class Person_baseclass {
/*一个标准的类通常含有一下三个部分
1.private类型的成员变量
2.空的或者全参的方法体
3.get和set方法
* 使用alt+insert 快捷键 使用constructor 生成方法体
* 使用getter setter 生成对应的get和set方法
* */
         private String name;
         private int age;

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

    public Person_baseclass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person_baseclass() {
    }

    public static void main(String[] args) {

    }
}
