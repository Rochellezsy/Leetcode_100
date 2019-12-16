public class Runnabletest implements Runnable{

    @Override
    public void run() {
        System.out.println("my runnable");

    }

    public static void main(String[] args) {
        Runnabletest rtest=new Runnabletest();
        Thread thread=new Thread(rtest);
        thread.start();
        System.out.println("game over");
    }
}
