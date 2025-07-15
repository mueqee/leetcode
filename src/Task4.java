public class Task4 {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5,10,15,20,25,30,35,40};
        for (int i = 0; i<arr.length; i++) {
            if (10 < arr[i] && 20 > arr[i]) {
                System.out.println(arr[i]);
            }
        }
    }
}
