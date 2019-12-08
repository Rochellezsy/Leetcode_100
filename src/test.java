import java.util.HashMap;

public class test {

    private static int userNumber  = 0 ;

    public test(){
        userNumber ++;
    }
    public void fun(){
        System.out.println("**");
    }

    public static void main(String[] args) {
        test user1 = new test();
        test user2 = new test();


        System.out.println("user1 userNumber：" + test.userNumber);
//        System.out.println("user2 userNumber：" + test.userNumber);
    }

}
