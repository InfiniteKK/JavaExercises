public class WaitAndNotifyAllApplication {
    public static void main(String[] args) {
        Object obj = new Object();
        // 消费者
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName()+"请求资源！");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"已收到资源！");
                        System.out.println("=========================================");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName()+"请求资源！");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"已收到资源！");
                        System.out.println("=========================================");
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (obj) {
                        System.out.println("资源已发出！");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        obj.notifyAll();
                    }
                }
            }
        }).start();
    }
}
