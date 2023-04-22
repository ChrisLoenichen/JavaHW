package Class10HW;
//From an array of integer elements find the largest number.
public class HW7 {
    public static void main(String[] args) {
        int[]num={1,3,5,6,20,2};
        int largest= num[0];
        for(int bignum : num){
            if (bignum>largest){
                largest=bignum;

            }
        } System.out.println(largest);

    }
}
