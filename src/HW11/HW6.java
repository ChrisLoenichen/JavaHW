package HW11;
/*
Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored.
 */

public class HW6 {
    public static void main(String[] args) {

            String[][] countries= {
                    {"Mexico","USA","Canada"},
                    {"Ecuador","Colombia","Bolivia"},
                    {"UK","Spain","Portugal"},
                    {"Japan","Thailand","Korea"},
                    {"Ghana","Nigeria","Ethiopia"}
            };
            int calculate= 0;
            for (int i = 0; i< countries.length; i++){
                for (int j= 0; j<countries[i].length; j++){
                calculate++;
                }
            }
        System.out.println(calculate);
        System.out.println();
        calculate = 0;
        for(String[] o : countries){
            for(String k : o){
                calculate++;

            }
        }
        System.out.println(calculate);
    }
}
