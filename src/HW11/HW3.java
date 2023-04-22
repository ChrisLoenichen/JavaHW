package HW11;
/*
Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops

 */
public class HW3 {
    public static void main(String[] args) {
        String[][] groceries={
                {"Veggies","Fruits","Dairy","Sweets"},
                {"Spinach","Apple","Milk","Chocolate"}
        };
        for(int i = 0; i< groceries.length; i++){
            for (int j = 0; j< groceries[i].length; j++){
                System.out.println(groceries[i][j]);
            }
        }
        System.out.println();

        for (String[]food : groceries){
            for(String needFood : food){
                System.out.println(needFood);
            }
        }
    }
}
