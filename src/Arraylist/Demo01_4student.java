package Arraylist;

import java.util.ArrayList;

public class Demo01_4student {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("A",10);
//        z这里因为Student类中的name和age都是private类型，赋值只能通过初始化和setter的形式赋值
        Student two = new Student("B",10);
        Student three = new Student("C",10);
        Student four = new Student("D",10);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println("姓名 ： =" + student.getName() + "," + "年龄 ：=" + student.getAge() );
        }
//        这里只有数组，字符串数组等求长度时使用length，泛型集合时使用size的
//        String []list={"ma","cao","yuan"};
//    String a="macaoyuan";
//    System.out.println(list.length);
//    System.out.println(a.length());
//    List array=new ArrayList();
//    array.add(a);
//    System.out.println(array.size());
//        输出为 3 9 1
    }
}
