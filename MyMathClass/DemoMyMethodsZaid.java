/*
 * *******Name: Zaid Issa
 * *Student ID: 251300370
 * *******Date: March 9th, 2023
 * Description: Program replicating the Math class, performs similar calculations.
 */

package Lab3Q;

import java.util.Scanner;

public class DemoMyMethodsZaid {

    final public static Scanner input = new Scanner(System.in);//creating final public scanner

    public static void main (String[] args){

        //Creating objects and variables
        MyMethod header = new MyMethod();
        MyMethod function = new MyMethod();
        String des = "Program performing similar calculations to the Math Class";
        char choice;
        double x = 0, y = 0, degree;
        int n;
        boolean flag = true;//if flag turns false, program ends, otherwise it will continue looping

        header.myHeader(3, 1, des);//Invoking the myHeader method

        //While loop looping the menu to the user
        while(flag){
            //Displaying the menu to the user
            System.out.println("======MENU=======\na: Power Function\nb: Factorial Function\nc: Sine Function\n" +
                    "d: Cosine Function\ne: Exit\n================");
            choice = MyMethod.myToLowerCase(input.next().charAt(0));//obtaining the users choice

            //Switch statement for each option from the menu
            switch(choice){
                case 'a': {
                    //Prompting user and obtaining user input for x and y values
                    System.out.println("POWER FUNCTION: Calculating x to the power of y.");
                    System.out.print("Enter x: ");
                    x = input.nextDouble();
                    System.out.print("Enter y: ");
                    y = input.nextDouble();

                    //Printing the result of the x value raised to the y power
                    System.out.printf(x + "^" + y + " = %.2f\n\n", function.myPow(x, y));
                    break;
                }//end of case 'a'

                case 'b': {
                    System.out.println("FACTORIAL FUNCTION: Calculating factorial (n).");

                    //error checking users input ensuring they cant input a value for n less than 0
                    do {
                        //Prompting user to input a value of n
                        System.out.print("Enter n: ");
                        n = input.nextInt();

                        //if the value of n < 0, error message prints
                        if(n < 0)
                            System.out.println("Error, n must be >= 0");
                    }while(n < 0);

                    //displaying the value of n, followed by the factorial of that value
                    System.out.printf(n + "! = %.2f\n\n" , function.myFactorial(n));
                    break;
                }//end of case 'b'

                case 'c': {
                    //Prompting the user for a value of degrees
                    System.out.print("SINE FUNCTION: Calculating sin(k) degree.\nEnter k in degrees: ");
                    degree = input.nextDouble();

                    //Displaying the users inputted value followed by the sin of that degree
                    System.out.printf("sin(%.2f) = %.2f\n\n",degree, function.mySin(degree));
                    break;
                }//end of case 'c'

                case 'd': {
                    //Prompting the user for a value of degrees
                    System.out.print("COSINE FUNCTION: Calculating cos(m) degree.\nEnter m in degrees: ");
                    degree = input.nextDouble();

                    //Displaying the users inputted value followed by the cos of that degree
                    System.out.printf("cos(%.2f) = %.2f\n\n", degree, function.myCos(degree));
                    break;
                }//end of case 'd'

                case 'e': {
                    System.out.println("Hope to see you again, goodbye!");//printing goodbye message
                    flag = false;//switching flag to false, causing loop to end
                    break;
                }//end of case 'e'

                default: {
                    //Default message if user inputs a value not from the menu
                    System.out.println("Invalid input, please try again.");
                    break;
                }//end of default case
            }//end of switch
        }//end of while loop
        header.myFooter(1);//invoking the myFooter method
    }//end of main method
}//end of DemoMyMethodsZaid class
