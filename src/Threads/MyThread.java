package Threads;

public class MyThread extends Thread{


    @Override
    public void run() {
        for (; ;){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println("World");
        }
    }
}
