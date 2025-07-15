public class BubbleSortExample {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // Внешний цикл (проходы)
            for (int j = 0; j < n - 1 - i; j++) { // Внутренний цикл (перестановки)
                if (arr[j] > arr[j + 1]) { // Если текущий элемент больше следующего, меняем местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6}; // Исходный массив

        System.out.println("Исходный массив:");
        printArray(numbers);

        bubbleSort(numbers); // Сортировка пузырьком

        System.out.println("Отсортированный массив:");
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

