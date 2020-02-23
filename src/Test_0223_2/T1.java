package Test_0223_2;

public class T1 {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='#'){
                s.append(S.charAt(i));
            }
            else{
                if(s.length()!=0){
                    s.deleteCharAt(s.length()-1);
                }
            }
        }

        StringBuilder t=new StringBuilder();
        for(int i=0;i<T.length();i++){
            if(T.charAt(i)!='#'){
                t.append(T.charAt(i));
            }
            else{
                if(t.length()!=0){
                    t.deleteCharAt(t.length()-1);
                }
            }
        }
        return String.valueOf(s).equals(String.valueOf(t));
    }

    public static void main(String[] args) {
        T1 test=new T1();
        System.out.println(test.backspaceCompare("ab#c","ad#c"));
    }
}
