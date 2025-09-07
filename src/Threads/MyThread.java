package Threads;

public class MyThread implements Runnable{


    @Override
    public void run() {
        for (; ;){
            System.out.println("World");
        }
    }
}
