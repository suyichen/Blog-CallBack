package suyichen.callback.again;

/**
 * Created by suyichen on 2018/12/13.
 */

public class FirstClass implements CallBackInterface {

    private SecondClass secondClass;

    public FirstClass(SecondClass secondClass){
        this.secondClass = secondClass;
    }

    public void sendMessage(final String message){
        new Thread(new Runnable() {
            @Override
            public void run() {
                secondClass.callMessage(FirstClass.this,message);
                System.out.print("First class send a message;");
            }
        }).start();

    }

    @Override
    public void result(String result) {
        System.out.print("CallBackMessage:"+ result + ";");
    }
}
