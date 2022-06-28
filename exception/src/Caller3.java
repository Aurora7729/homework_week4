import myexceptions.*;

public class Caller3 {
    public void callThrowRTException() {
        System.out.println("Caller3.callThrowRTException开始");
        try{
            Object n = null;
            n.toString();
        } catch (Exception ex){
            throw new MyRuntimeException("执行callThrowRTException出错",ex);
        }

        System.out.println("Caller3.callThrowRTException结束");
    }

    public void callThrowException() throws MyException {
        System.out.println("Caller3.callThrowException开始");
        try{
            Class.forName("com.neverland.Rabbit");
        } catch (ClassNotFoundException ex){
            throw new MyException("执行callThrowException出错",ex);
        }


        System.out.println("Caller3.callThrowException结束");
    }
}
