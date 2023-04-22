package Class9HW;

//Print odd numbers between 20 and 50 (2 ways)
public class HW3 {
    public static void main(String[] args) {
        for (int i = 20; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println();

        int j = 20;
        while (j <= 50) {
            if (j % 2 == 1) {
                System.out.println(j);
            }
            j++;
        }
    }
}
