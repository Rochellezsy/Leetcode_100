import java.util.Arrays;

public class Mystack_1 {
    private int capacity;
    private int count;
    private int[] array;
    private static final int GROW_FACTOR=2;

    //无参构造方法
    public Mystack_1(){
        this.capacity=8;
        this.count=0;
        this.array=new int[8];
    }

    //有参构造方法
    public Mystack_1(int initialCapacity){
        this.capacity=initialCapacity;
        this.count=0;
        this.array=new int[initialCapacity];
    }

    public void push(int value){
        if(count==capacity){
            //调用扩容函数
            grow();
        }
        array[count]=value;
        count++;
    }

    public void grow(){
        int newCapacity=capacity*GROW_FACTOR;
        array= Arrays.copyOf(array,newCapacity);
        capacity=newCapacity;
    }

    public int pop(){
        count--;
        if(count==-1)
            throw new IllegalArgumentException("kong");
        return array[count];
    }

    public int peek(){
        if(count==0)
            throw new IllegalArgumentException("kong");
        return array[count];
    }

    public boolean isEmpty(){
        return count==0;
    }

    public int size(){
        return  count;
    }




}
