// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        long result = SumIntegerRecursion.sumNumber(5);
        System.out.println("Tong tu 1 toi 5 la " + result);

        int number = 101;
        String res = ChangeDecimalToBinary.toBinary(number);
        System.out.println("number of binary : " + number + " is = " + res);

        int a = 6;
        int b = 9;
        int kq = FindGCD.gcdNumber(a, b);
        System.out.println("GCD of " + a + " and " + b + " = " + kq);

        int myNumber = 123;
        long kq1 = SumDigitalNumber.calculateDigitalSum(myNumber);
        System.out.println(kq1);

        int[] arrNumber = {5,4,3,2,1};
        int max = FindMinMaxNumberArray.findMinMaxElement(arrNumber, 1);
        int min = FindMinMaxNumberArray.findMinMaxElement(arrNumber, 0);
        System.out.println("Max is : " + max);
        System.out.println("Min is : " + min);

        boolean isSort = SortASCAndDESCArrayNumber.isSorted(arrNumber, "asc");
        if (isSort){
            System.out.println("Array is sorted ASC");
        } else {
            System.out.println("Array is not sorted ASC");
        }
    }
}