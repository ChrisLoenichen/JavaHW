package HW11;
/*
Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
 Print the sum of all numbers.
 */
public class HW4 {
    public static void main(String[] args) {
        int[][] nums={
                {1,2,3,},
                {4,5,6},
                {7,8,9}};
        int sum=0;

        for(int i= 0; i< nums.length;i++){
            for(int j = 0; j< nums[i].length; j++){
                sum+=nums[i][j];
            }
        }
        System.out.println(sum);
    }
}
