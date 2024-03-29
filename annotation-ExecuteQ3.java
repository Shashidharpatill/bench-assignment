package capg.annotation.assignment7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
    int sequence() default 0;
}
public class ExecuteQ3 {
    public static void main(String[] args) {
        testing s= new testing(56);
        Class t=s.getClass();
        Annotation a=t.getAnnotation(Execute.class);
        Execute x=(Execute)a;
        System.out.println(x.sequence());
    }
}
class testing{
    private int pin;
    public testing(int pin){
        this.pin=pin;
    }
    @Execute(sequence=1)
    public static void run(){
    }
    @Execute(sequence=2)
    public static void run2(){
    }
}