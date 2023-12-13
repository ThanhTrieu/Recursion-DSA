public class SortASCAndDESCArrayNumber {
    // ASC : tang dan
    // DESC : giam dan
    // kiem tra mang da dc sap xep hay chua???
    // khong di sap xep ma chi kiem  tra.

    public static boolean isSorted(int[] arrNumber, String type){
        return isSorted(arrNumber, 0, type);
    }

    private static boolean isSorted(int[] arrNumber, int index, String type){
        if(index == arrNumber.length - 1){
            // dung de quy
            return true;
        }
        if(type.equals("desc")){
            if(arrNumber[index] > arrNumber[index + 1]){
                // dung de quy
                return false;
            }
        }
        if(type.equals("asc")){
            if(arrNumber[index] < arrNumber[index + 1]){
                // dung de quy
                return false;
            }
        }

        // goi De Quy
        return isSorted(arrNumber, index, type);
    }
}
