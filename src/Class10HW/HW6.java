package Class10HW;
//Create an array on integers and calculate the sum of all elements in an array
public class HW6 {
    public static void main(String[] args) {
        int [] numbers={10,20,30,50};
        int sum=0;
        for (int num : numbers){
            sum=sum+num;
        }
        System.out.println(sum);
    }
}
