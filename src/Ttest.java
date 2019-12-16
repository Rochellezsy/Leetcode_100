public class Ttest {
    private static  <T extends Number &Comparable<? super T>>T min(T[] array){
        T min=array[0];
        for(int i=0;i<array.length;i++){
            if(min.compareTo(array[i])>0)
                min=array[i];
        }
        return min;
    }


    public static void main(String[] args) {

        int minInteger = min(new Integer[]{1, 2, 3});
        double minDouble = min(new Double[]{1.2, 2.2, -1d});//result:-1d
        System.out.println(minInteger);
        System.out.println(minDouble);
    }
}
