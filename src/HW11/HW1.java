package HW11;
/*
Create a 2D array(shorter way) in which first array will consist of 4 names
and second array will contain grades.
Then your program should print name of the students that has A and B grade
 */
public class HW1 {
    public static void main(String[] args) {
        String[][] school ={{"John","Mike","Jack","Jim"},
                {"A","B","C","A"}};

        for(int i =0; i< school[0].length; i++){
            if(school[1][i].equals("A")|| school[1][i].equals("B")){
                System.out.println(school[0][i]);

            }
        }


    }
}
