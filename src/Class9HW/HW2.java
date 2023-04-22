package Class9HW;
/*
Print even numbers from 20 to 1 (2 ways)

 */
public class HW2 {
    public static void main(String[] args) {
        for (int i = 20; i >=1; i--) {
            if (i%2==0){
                System.out.println(i);
            }
        }

        int j = 20;
        while (j>=1){
            if(j%2==0) {
                System.out.println(j);
            }
            j--;
        }
    }
}
