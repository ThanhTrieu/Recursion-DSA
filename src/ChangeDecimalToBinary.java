public class ChangeDecimalToBinary {

    public static String toBinary(int n) {
        if(n <= 1){
            return String.valueOf(n);
            //String.valueOf : bien 1 gia tri thanh chuoi
        }
        return toBinary(n/2) + String.valueOf(n%2);
        // de quy chuyen 1 so thap phan sang day so nhi phan
    }
}
