import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
       int[] arr = new int[10];
//       int[] arr2 = {2,6,4,8,9,1,5,3,0,7};

        System.out.println();
        for (int r = 0; r <arr.length; r++) {
           arr[r] = (int)(Math.random()*100.0);
       }
       System.out.println("Массив рандом:");
        for (int v :arr){
           System.out.print (v + "; ");
        }

        for (int i = 0; i <arr.length; i++){
            int aaa = i;
            for (int k = i + 1; k<arr.length; k++){
                if (arr[k]<arr[aaa]){
                    aaa = k;
                }
            }
            int xyz = arr[i];
            arr[i] = arr[aaa];
            arr[aaa] = xyz;
        }

        System.out.println();
        System.out.println("Массив после сортировки:");
        for (int v : arr) {
            System.out.print(v + "; ");
        }
        System.out.println(Arrays.toString(arr));

        System.out.println();
    }
}
