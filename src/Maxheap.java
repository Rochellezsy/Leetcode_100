public class Maxheap {
    private int []a;
    private int size;

    public Maxheap(int capacity) {
        this.a=new int[capacity+1];
        this.size=0;
        a[0]=Integer.MAX_VALUE;
    }
    public boolean isfull(){
        return size==a.length-1;
    }

    public boolean iskong(){
        return size==0;
    }

    public boolean insert(int value){
        if(isfull()){
            System.out.println("已满");
            return false;
        }
        size++;
        a[size]=value;

        int i=size;
        while(a[i]>a[i/2]){
            swap(a,i,i/2);
            i=i/2;
        }
        return true;

    }

    //删除最大堆堆顶元素
    public boolean delete(){
        if(iskong()){
            System.out.println("已空");
            return false;
        }

        int temp=a[size];
        size--;

        int parent=1;
        int child=2;
        while(child<size){
            if(a[child]<a[child+1]){
                child++;
            }

            if(temp>a[child]){
                break;
            }
            else {
                swap(a,parent,child);
            }
            parent=child;
            child=parent*2;
        }
        a[parent]=temp;
        return true;
    }


    public void swap(int[]nums ,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void print() {
        if(iskong()) {
            System.out.println("无元素");
            return;
        }
        for(int i=1;i<=size;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] b= {10,8,4,5,9,15,11,20};
        Maxheap heap=new Maxheap(b.length);
        for(int i=0;i<b.length;i++) {
            heap.insert(b[i]);
        }
        System.out.println("插入后形成最大堆：");
        heap.print();
        //下面测试删除后是否还是最大堆
        for(int i=0;i<3;i++) {
            System.out.println("删除元素："+heap.delete());
        }
        System.out.println("删除后是否还是最大堆：");
        heap.print();
    }


}
