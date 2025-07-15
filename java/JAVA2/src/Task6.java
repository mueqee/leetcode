
public class Task6 {
    public static void main(String[] args) {
//        int var = 0;
//        int var2 = 0;

        int[][] twoArrs = {{0, 20, 40, 60}, {80, 100, 120, 140}, {160, 180, 200, 220}, {240, 260, 280, 300}};

        int[] sums = new int[twoArrs.length];

        for (int i = 0; i < twoArrs.length; i++) {

            System.out.println("Элементы в массиве " + i);

            int a = 0;

            for (int j = 0; j < twoArrs[0].length; j++) {

                System.out.print(twoArrs[i][j] + " ");
                a += twoArrs[i][j];
            }
            System.out.println();
            System.out.println("Сумма" + " равна " + a);
            System.out.println();

            sums[i] = a;
        }

        int var = 0;
        int var2 = sums[0];

        for (int o = 1; o < sums.length; o++) {
            if (sums[o] > var2) {
                var2 = sums[o];
                var = o;
            }
        }
        System.out.println("Индекс = " + var + "; Сумма = " + var2);


        System.out.print("Массив: ");
        for (int num : twoArrs[var]) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
