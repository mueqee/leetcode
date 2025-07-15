public class TaskSearchString {
    public static void main(String[] args) {

        System.out.println();
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(word1);
        System.out.println(word2);

//        char w10 = word1.charAt(0);
//        char w11 = word1.charAt(1);
//        char w12 = word1.charAt(2);
//        char w13 = word1.charAt(3);
//        char w20 = word2.charAt(0);
//        char w21 = word2.charAt(1);
//        System.out.print("1) " + w10 + w20 + w11 + w21 + w12 + w13);

        System.out.print("2) ");
        for (int i = 0; i < word1.length(); i++) {
            if (i<word1.length()) {
                System.out.print(word1.charAt(i));
            }
            if (i<word2.length()) {
                System.out.print(word2.charAt(i));
            }
        }

        System.out.println();
    }
}
