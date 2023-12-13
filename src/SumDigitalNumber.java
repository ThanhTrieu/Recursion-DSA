public class SumDigitalNumber {

    public static long calculateDigitalSum(int number){
        // dung de quy (truong hop suy bien)
        if(number < 10){
            return number;
        }
        // trien khai De Quy
        int lastDigital = number % 10;
        int remainingNumber = number / 10;
        return  lastDigital + calculateDigitalSum(remainingNumber);
    }
}
