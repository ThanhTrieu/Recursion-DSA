public class FindMinMaxNumberArray {

    public static int findMinMaxElement(int[] arr, int type){
        // goi ham ben duoi
        // type == 0 : tim min
        // type == 1 : tim max
        return findMinMaxElement(arr, 0, arr.length-1, type);
    }
    private static int findMinMaxElement(int[] arr, int left, int right, int type){
        // left : xuat phat tu vi tri phan tu nao o ben trai mang
        // right: xuat phat tu vi tri phan tu nao o ben phai mang
        if(left == right){
            return arr[left];
            // dung de quy
            // khong the chia nho mang dc nua
        }
        int middle = (left + right) / 2;
        // De quy
        int maxLeft = findMinMaxElement(arr, left, middle, type); // tim ra phan tu lon nhat ben trai
        int maxRight = findMinMaxElement(arr, middle+1, right, type); // tim ra phan tu lon nhat o ben phai
        // dung ham max cua Math trong java de tim so lon nhat trong 2 so
        if(type == 0){
            return Math.min(maxLeft, maxRight);
        } else if (type == 1){
            return Math.max(maxLeft, maxRight);
        }
        return 0;
    }
}