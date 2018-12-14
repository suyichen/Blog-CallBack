package suyichen.callback.again;

/**
 * Created by suyichen on 2018/12/13.
 */

public class SecondClass {

    public void callMessage(CallBackInterface callBackInterface,String message){
        System.out.print("send message is " + message + ";");


        String CallBackMessage = "CallBackMessage";
        callBackInterface.result(CallBackMessage);
    }

}
