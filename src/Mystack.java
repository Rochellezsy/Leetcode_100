import java.util.Arrays;

public class Mystack {
    private int capacity;//容量
    private int[] array;
    private int count;
    private static final int GROW_FACTOR=2;

    public Mystack(){
        this.capacity=8;
        this.array=new int[8];
        this.count=0;
    }

    public Mystack(int initialCapacity){
        if(initialCapacity<1){
            throw new IllegalArgumentException("Capacity too small.");
        }
        this.capacity=initialCapacity;
        this.array=new int[initialCapacity];
        this.count=0;
    }

    public void push(int value){
        if(count==capacity){
            //调用扩充函数
            grow();
        }
        array[count]=value;
        count++;
    }

    //扩充函数
    public void grow(){
        int newCapacity=capacity*GROW_FACTOR;
        array= Arrays.copyOf(array,newCapacity);
        capacity=newCapacity;
    }

    //pop函数
    public int pop(){
        count--;
        if (count == -1)
            throw new IllegalArgumentException("Stack is empty.");
        return array[count];
    }

    public int peek(){
        if(count==0)
            throw new IllegalArgumentException("Stack is empty.");
        return array[count];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int size(){
        return count;
    }


}
