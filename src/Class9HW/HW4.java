package Class9HW;
//Print numbers from 1 to 50 except those that are divisible by 3
public class HW4 {
    public static void main(String[] args) {
        for(int i= 1; i<=50; i++){
            if(i%3 !=0){
                System.out.println(i);
            }
        }
    }
}
