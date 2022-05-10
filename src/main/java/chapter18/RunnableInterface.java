package chapter18;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableInterface {
    public static void main(String [] args) throws ExecutionException, InterruptedException {
        Runnable task1 = () -> {
            System.out.println("task 1");
            return;
        };
        Runnable task2 = () -> {
            System.out.println("task 2");
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // method void execute(); executa task la un moment dat in viitor

        System.out.println("begin");

        System.out.println("begin");
       // executorService.execute(task1);
        //executorService.execute(task2);


        // method Future<?> submit(Runnable r);

        Future future =executorService.submit(task1);
        System.out.println(future.get());
    }

    /*
    @FunctionalInterface
    public interface Runnable{

        public void run(){}
    }
     */
}
