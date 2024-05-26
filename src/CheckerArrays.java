public class CheckerArrays {
    private int[] arr1;
    private int[] arr2;

    public CheckerArrays(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public boolean checkArr(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length)return false;
        if (findMax(arr1) != findMax(arr2)) return false;

        int[] count1 = new int[findMax(arr1) + 1];
        int[] count2 = new int[findMax(arr2) + 1];

        for (int i = 0; i < arr1.length; i++) {
            count1[arr1[i]] = count1[arr1[i]] + 1;
            count2[arr2[i]] = count2[arr2[i]] + 1;
        }
        for (int i = 0; i < count1.length; i++) {
            if (count1[i] != count2[i]) return false;
        }
        return true;
    }

    public int findMax(int[] arr){
        int max = arr[0] ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}
