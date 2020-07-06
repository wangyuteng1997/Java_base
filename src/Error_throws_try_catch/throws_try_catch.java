package Error_throws_try_catch;

/**
 * @author wang yuteng
 * @data 2020/7/6 17:29
 */
public class throws_try_catch {
    public static void function() throws NumberFormatException{
        if (true){
          throw new NumberFormatException();
        }
    }

    public static void main(String[] args) {
//try就像一个网，把try{}里面的代码所抛出的异常都网住，然后把异常交给catch{}里面的代码去处理。
        try{
            function();
        }
//catch出现在try代码块的后面，自身也是一个代码块，用于捕获异常try代码块中可能抛出的异常。catch关键字后面紧接着它能捕获的异常类型，所有异常类型的子类异常也能被捕获
        catch (Exception e){
//Exception    代表的就是异常了.  它下面很多派生类,   其中它的派生类也分两种, 一种是RuntimeException(运行时异常), 其他的都是非运行时异常
            System.err.println("非数据类型不能转换");
        }
    }


}
