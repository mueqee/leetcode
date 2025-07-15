
public class Task5 {
    public static void main(String[] args) {
        int[][] arrArr = {
                {0, 20, 40, 60},
                {80, 100, 120, 140},
                {160, 180, 200, 220},
                {240, 260, 280, 300}
        };

        for (int i = 0; i < arrArr.length; i++) {
            for (int j = 0; j < arrArr[0].length; j++) {
                if (100 < arrArr[i][j] && 200 > arrArr[i][j]) {
                System.out.println(arrArr[i][j]);
                }
            }
        }
    }
}