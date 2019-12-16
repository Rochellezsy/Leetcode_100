public class MyThread extends Thread {
    public void run(){
        super.run();
        System.out.println("什么");
    }

    public static void main(String[] args) {
        MyThread my=new MyThread();
        my.start();
        System.out.println("oo");
    }

}
