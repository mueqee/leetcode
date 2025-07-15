public class TaskBubble {
    public static void main(String[] args) {

        int[] arr = new int[4];                         // объявление массива
            double max = 20.0, min = 0.0;               // объявление переменных для диапазона чисел генерации
            for (int i = 0; i < arr.length; i++) {      // заполнение массива рандомизированными числами
                arr[i] = (int) (Math.random() * max + min);
            }


            for (int v : arr)                           // перебор и вывод элементов массива
            System.out.print(v + " ");
            System.out.println();
            System.out.println("После сортировки:");

        for (int j = 0; j < arr.length - 1; j++) {      // перебор элементов массива
            for (int i = 1; i < arr.length - j; i++)    // перебор всех остальных элементов массива для КАЖДОГО элемента массива
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i - 1];              // сохранить ЛЕВЫЙ элт
                    arr[i - 1] = arr[i];                // левый = правый
                    arr[i] = temp;                      // правый = сохраненному
                }
        }

        for (int v : arr)
        System.out.print(v + " ");
    }
}
