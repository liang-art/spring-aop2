package log;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {
    public void test(){}
    public void log(){
        System.out.println("日志开始");
    }
    public void before(){
        System.out.println("前置通知");
    }

    public void afterRetunning(){
        System.out.println("后置通知");
    }

    public void afterthrowing(){
        System.out.println("异常通知");
    }

    public void after(){
        System.out.println("最终通知");
    }


    public Object arroundPringLog(ProceedingJoinPoint pjp){
        Object[] args = pjp.getArgs();

        Object rtValue = null;
        try {
            System.out.println("前置通知");
            rtValue = pjp.proceed(args);
            System.out.println("后置通知");
        } catch (Throwable throwable) {
            System.out.println("异常通知");
            new RuntimeException(throwable);
        }finally {
            System.out.println("最终通知");
        }
        return rtValue;
    }


}
