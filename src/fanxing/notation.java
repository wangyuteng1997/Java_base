package fanxing;
/**
* 泛型：是一种未知的数据类型，当我们不知道使用什么类型的时候，就介意使用泛型
 * 泛型也可以看成一个变量，用来接收数据类型
 * E e：element 元素
 * T t:type 类型
 *
 * arraylist 集合在定义的时候，不知道集合中会存储什么类型的数据，类型使用泛型
 * E位置的数据类型
 *
 * 创建集合对象的时候，就会确定泛型的数据类型
 * Arraylist<String> list = new Arraylist<String>(); ----> 定义中 public class Arrarylist<String>{}
 * 因为定义list的函数中不知道是什么类型，这里将定义中的泛型转为实际的String类型
 * 会把数据类型作为参数传递，把String传给E
 * 也可以这样： Arraylist<Student> list = new Arraylist<Student>(); 这里是转为student类型的
*
* */
public class notation {

}
