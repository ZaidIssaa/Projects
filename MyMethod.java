    /*
 * *******Name: Zaid Issa
 * ******Class: MyMethod
 * Description: class with all the math function methods
 */

package Lab3Q;

public class MyMethod {

    final public static double PI = 3.141592653589793;

    /**
     * Method: myPow
     * Description: Calculates x to the power of y
     * @param x - Base
     * @param y - Exponent
     * @return - Result of calculation
     */
    public static double myPow(double x, double y)
    {
        double result = 1;//Variable will store the value after multiplication

        //While the power is not equal to 0, this loop will continue to run
        while(y != 0){
            if(y > 0){
                result = result * x;
                y--;//Deducting the value of the power by one
            }//end of if

            else{
                result = result * (1/x);
                y++;//incrementing the value of the power by one
            }//end of else
        }//end of while loop

        return result;//returning the final result
    }//end of myPow method


    /**
     * Method: myFactorial
     * Description: Calculates the factorial of value n
     * @param n - 1 * 2 * 3 *...* n
     * @return - Result of product
     */
    public static double myFactorial(int n)
    {
        double result = 1;

        /*If the value is greater than or equal to zero, it will enter the if and as long as the value is greater than
        zero, it will continue to multiply the result by n, each time decrementing the value of n by one*/

//            while(n > 0)
//                result = result * n--;

            for(int i = 1; i <= n; i++){
                result = result * i;
            }

        return result;
    }//end of myFactorial method


    /**
     * Method: mySin
     * Description: Calculates the sin of an angle after converting from degrees to radians
     * @param x - Angle in degree
     * @return - The sin of angle
     */
    public static double mySin(double x)
    {
        double resultSin = 0;//variable that will store the calculated value of SIN

        x = myDegreeToRadian(x);

        //finding the sum of SIN equation: from n = 0 to N = 20
        for(int n = 0; n <= 20; n++)
            resultSin = resultSin + (myPow(-1, n) * myPow(x,2*n+1))/myFactorial(2*n+1);

        return resultSin;//returning the result of the sin equation from the for loop
    }//end of mySin method


    /**
     * Method: myCos
     * Description: Calculates the cos of an angle after converting from degree to radians
     * @param x - Angle in degree
     * @return - The cos of the angle
     */
    public static double myCos(double x)
    {
        double resultCos = 0;//variable that will store the calculated value of COS

        x = myDegreeToRadian(x);

        //Finding the sum of COS equation: from n = 0 to N = 20
        for(int n = 0; n <= 20; n++)
            resultCos += (myPow(-1,n) * myPow(x,2*n)) / myFactorial(2*n);

        return resultCos;//returning the result of the cos equation from for loop
    }//end of myCos method


    /**
     * Method: myDegreeToRadian
     * Description: Converts angle in degree to radians
     * @param d - Angle in degree
     * @return - Angle in radians
     */
    public static double myDegreeToRadian(double d){
        return (d*PI)/180;
    }//end of myDegreeToRadian method


    /**
     * Method: myToLowerCase
     * Description: Converts a capital letter to a lowercase letter
     * @param c - character
     * @return - returning the lower case letter
     */
    public static char myToLowerCase(char c){
        char lowerCase = 'a';

        if(c >= 'A' && c <= 'Z')
            return lowerCase = (char) (c + ('a'-'A'));
        else
            return lowerCase = c;
    }//end of myToLowerCase method


    /**
     * Method: myHeader
     * Description: Prints my personal information
     * @param ln - Lab number
     * @param qn - Question number
     * @param des - Description
     */
    public static void myHeader(int ln, int qn, String des){
        System.out.println("**********************************************************************");
        System.out.println("Name: Zaid Issa\nLab Assignment " + ln + ", Question: " + qn + "\nDescription: " + des +
                "\n**********************************************************************\n");
    }//end of myHeader method


    /**
     * Method: myFooter
     * Description: Prints my footer
     * @param qn - Question number
     */
    public static void myFooter(int qn){
        System.out.println("*** Signing off from Question " + qn + " - Zaid ***");
    }//end of myFooter method
}//end of MyMethod class
