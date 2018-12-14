package suyichen.callback.again;

/**
 * Created by suyichen on 2018/12/13.
 */

public class TestDemo {

    public static void main(String[] args){
    SecondClass secondClass = new SecondClass();

    FirstClass firstClass = new FirstClass(secondClass);

    firstClass.sendMessage("messageBase");
    }
}
