package Jicheng.super_use;

/**
 * wangyuteng create
 * 13/07/2020 21:56
 */
/*
* super关键字的用法有三种
* 1.在子类的成员方法中，访问父类的成员变量
* 2.在子类的成员方法中，访问父类的成员方法
* 3.在子类的构造方法中，访问父类的构造方法
* */
public class zi extends fu{
          int num = 20;

          public zi(){
              super();
          }

          public void methodzi(){
              System.out.println(num);
//              输出的是子类的成员变量
              System.out.println(super.num);
//          输出的是父类的成员变量
          }

    @Override
    public void method() {
        super.method();
    }
}
