import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new Thread(()->{
            System.out.println("Lambda:\n\t" + Thread.currentThread().getName());
        }));

        es.submit(new Thread(){
            @Override
            public void run() {
                System.out.println("Thread:\n\t" + Thread.currentThread().getName());
            }
        });

        es.submit(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable:\n\t" + Thread.currentThread().getName());
            }
        }));
        es.shutdown();
    }
}
