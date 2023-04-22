package Class10HW;

/*
Create an array of animals and store 5 elements into it.
 Using 2 different loops print all elements from the array.
 */
public class HW5 {
    public static void main(String[] args) {
        String[] animals = {"Zebra", "Loin", "Giraffe", "Monkey", "Turtle"};
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
        }
        for(String animal : animals){
            System.out.println(animal);
        }
    }
}
