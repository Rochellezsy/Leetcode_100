import java.util.ArrayList;

public class amicablenumber {
    public int sumn(int m){
        int n=0;
        for (int i=1;i<=m/2;i++){
            if(m%i==0){
                n=n+i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        amicablenumber amicablenumber = new amicablenumber();

        int i=1;

        while(i<3000){
            int sumn = amicablenumber.sumn(i);
            if(i==amicablenumber.sumn(sumn) && sumn!=i){
                list.add(i);
                list.add(sumn);
            }
            i++;
        }

        for (Integer l : list) {
            System.out.println(l);
        }
    }

}
