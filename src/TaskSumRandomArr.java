public class TaskSumRandomArr {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        System.out.println();
        for (int r = 0; r < arr1.length; r++) {
            arr1[r] = (int) (Math.random() * 100.0);
        }
        System.out.println("Первый массив:");
        for (int v : arr1) {
            System.out.print(v + "; ");
        }

        System.out.println();
        for (int r = 0; r < arr2.length; r++) {
            arr2[r] = (int) (Math.random() * 100.0);
        }
        System.out.println("Второй массив:");
        for (int v : arr2) {
            System.out.print(v + "; ");
        }

        System.out.println();
        System.out.println("Результат перекрестного сложения элементов массива:");
        for (int i = 0; i < arr1.length; i++) {
            int sum = arr1[i] + arr2[arr2.length - 1 - i];
            System.out.print(sum + "; ");
        }

        System.out.println();
    }
}
