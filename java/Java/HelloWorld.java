public class BinarySearchExample {
    public static void main(String[] args) {
        // Создаём массив на 12000 мест
        String[] array = new String[12000];

        // Размещаем "Hello" на 4562 месте
        array[4562] = "Hello";

        // Ищем "Hello" в массиве методом бинарного поиска
        int index = binarySearch(array, "Hello");

        // Выводим результат
        if (index != -1) {
            System.out.println("Элемент найден на позиции: " + index);
        } else {
            System.out.println("Элемент не найден");
        }
    }

    public static int binarySearch(String[] arr, String target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == null) {
                // Ищем ближайший непустой элемент влево
                int temp = mid;
                while (temp >= left && arr[temp] == null) {
                    temp--;
                }
                if (temp < left) {
                    left = mid + 1;
                    continue;
                }
                mid = temp;
            }

            if (arr[mid].equals(target)) {
                return mid;
            } else if (arr[mid].compareTo(target) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Элемент не найден
    }
}

