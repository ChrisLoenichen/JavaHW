package HW11;
/*
Create 2D array of cars : american, german, korean, italian.
Then retrieve all values from that array using 2 different loops
 */
public class HW2 {
    public static void main(String[] args) {
        String[][] cars= {
                {"American","German","Korean","Italian"},
                {"Ford","Volks","Kia","Mini"}};
        for (int i = 0; i< cars.length; i++){
            for (int j = 0; j< cars[i].length; j++){
                System.out.println(cars[i][j]);
            }
        }
        System.out.println();

        for(String[] carros : cars){
            for(String vehicle: carros){
                System.out.println(vehicle);
            }
        }
    }
}
