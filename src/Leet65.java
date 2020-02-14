public class Leet65 {
    public boolean isNumber(String s) {
        s=s.trim();
        if(s.length()==0)return false;
        int state=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            switch (c){
                case '+':
                case '-':
                    switch (state){
                        case 0:
                            state=1;
                            break;
                        case 4:
                            state=7;
                            break;
                        default:
                            return false;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    switch (state){
                        case 0:
                            state=2;
                            break;
                        case 1:
                            state=2;
                            break;
                        case 2:
                            break;
                        case 3:
                            state=5;
                            break;
                        case 4:
                            state=6;
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            state=6;
                            break;
                        case 8:
                            break;
                        case 9:
                            state=8;
                            break;
                        default:
                            return false;
                    }
                    break;
                case '.':
                    switch (state){
                        case 0:
                            state=9;
                            break;
                        case 1:
                            state=9;
                            break;
                        case 2:
                            state=3;
                            break;
                        default:
                            return false;
                    }
                    break;
                case 'e':
                    switch (state){
                        case 2:
                            state=4;
                            break;
                        case 3:
                            state=4;
                            break;
                        case 5:
                            state=4;
                            break;
                        case 8:
                            state=4;
                            break;
                        default:
                            return false;
                    }
                    break;
                default:
                    return false;
            }
        }

        return state==2 ||state==3||state==5 ||state==6 ||state==8;

    }

    public static void main(String[] args) {
        Leet65 test=new Leet65();
        System.out.println(test.isNumber("7e+6"));
    }
}
