public class FindGCD {

    public static int gcdNumber(int a, int b){
        if(b == 0){
            // khu de quy;  dung de quy
            return a;
        }
        // de quy
        int remainder = a % b;
        return gcdNumber(b, remainder);
    }
}
