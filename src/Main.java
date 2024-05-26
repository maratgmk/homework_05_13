public class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};
        CheckerArrays checkerArrays = new CheckerArrays(arr1,arr2);
        System.out.println(checkerArrays.findMax(arr1));
        System.out.println(checkerArrays.findMax(arr2));
        
        System.out.println(checkerArrays.checkArr(arr1, arr2));


    }
}