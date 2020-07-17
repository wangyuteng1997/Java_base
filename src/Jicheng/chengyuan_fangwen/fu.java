package Jicheng.chengyuan_fangwen;

/**
 * @author wang yuteng
 * @data 2020/7/9 18:39
 */
public class fu {
    public int num_fu = 50;
    public  int num = 10;

    public fu(){
        System.out.println("父类无参构造方法");
    }

    public fu(int num){
        System.out.println("父类有参构造方法");
    }

    public void methodfu(){
        System.out.println(num);
    }

    public Object method(){
      return num;
    }



    public void show(){
        System.out.println("父类的方法");
    }

}
