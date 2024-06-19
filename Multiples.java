/*This is a java program is designed to display all the multiples of 2, 3 and 7 that are within the range of 71 to 150 */

//Create a class
public class Multiples {
    //Main method
    public static void main(String[]args){

        //The values that are within the range of 71 to 150
        int firstnumber = 71;
        int lastnumber = 150;

        //Outline the multiples of 2, 3, and 7 within the range of 71 to 150
        System.out.println("The multiples of 2, 3 and 7 from the number " + " " + firstnumber + " " + "to the number" + " " + lastnumber + " " + "is outlined as follows:");
        
        //loop x through the range of values
        for(int x = firstnumber; x <= lastnumber; x++){

            //Check if the number is divisible by 2, 3, or 7
            if(x % 7 == 0 || x % 3 == 0 || x % 2 == 0){

            //Expected results is then printed    
            System.out.println(x);
            }

        }
    }
}