public class Leet66 {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        for(int i=len-1;i>=0;i--){
            digits[i]++;
            digits[i]=digits[i]%10;
            if(digits[i]!=0)return digits;
        }
        int[] digit=new int[len+1];
        digit[0]=1;
        return digit;

    }
}
