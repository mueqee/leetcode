public class Task1 {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
            for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            }
        System.out.println();

            String temp = arr1[0];
            arr1[0] = arr1[1];
            arr1[1] = temp;
            for (String v : arr1)
            System.out.print(v + " ");

    }
}