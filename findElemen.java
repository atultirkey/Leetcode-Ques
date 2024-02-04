public class FindElement {
    public static void main(String[] args) {
        Integer[] array = {1,4,34,56,7};
        int target1 = 90, target2 = 56;
        System.out.println(target1 + " at index = " + findIndex(array, target1));
        System.out.println(target2 + " at index = " + findIndex(array, target2));
    }

    public static int findIndex(Integer[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}