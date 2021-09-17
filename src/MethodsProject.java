import java.util.Scanner;

public class MethodsProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //Task 1
        /*/
        System.out.println("Hello there, would you like me to find the lowest of three numbers of your choosing?");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(lowestNumber(number1, number2, number3));

        */

        //Task 2
        /*/

        int numbers = scanner.nextInt();

        System.out.println(PositiveNegativeNumber(numbers));
*/

        //Task 3
        /*/
        String name = scanner.nextLine();
        System.out.println("Here is the middle character " + findMiddleCharacter(name));
*/

        //Task 4
        /*/
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        System.out.println(findAreaOfATriangle(side1, side2, side3));
*/

        //Task 5
        /*
        System.out.println("Password valid if: " +
                "1. Password contains 8 or more characters " +
                "2. Password consists of only letters and digits " +
                "3. Password does not contain string (secret)" +
                "4. Passwords first character must not be dash (-)");
        String password = scanner.nextLine();
        if (validPassword(password)) {
            System.out.println("Valid Password " + password);
        } else {
            System.out.println("Password not valid " + password);


        }

*/

        //Task 6
        printNumbers(15);
        printNumbers(5);
    }

    //Task 1 method
    /*/
    public static int lowestNumber(int number1, int number2, int number3) {

        return Math.min(Math.min(number1, number2), number3);

    }

     */

    //Task 2 method
/*/
    public static int PositiveNegativeNumber(int numbers) {

        if (numbers > 0) {
            System.out.println("Positive Number");
        } else if (numbers < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Equals zero");
        }
        return 0;

    }
*/

    //Task 3 method
    /*/
    public static String findMiddleCharacter(String name) {
        int length = name.length();
        int middle = length / 2;
        System.out.println(name.charAt(middle));

        return "";


    }
*/

    //Task 4 method
    /*/
    public static double findAreaOfATriangle(double side1, double side2, double side3) {
        double sides = 0;
        double s = (side1 + side2 + side3) / 2;

        Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return s;

    }

     */

    //Task 5
    /*/
    public static boolean validPassword(String password) {

        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++)
            if (!Character.isLetterOrDigit(password.charAt(i))) {
            } else {
                if (Character.isLetterOrDigit(password.charAt(i))) {
                }
                if (password.contains("secret"))
                    return false;
                {

                    if (password.charAt(0) == '-')
                        return false;

                }

            }
        return true;

     */

    //Task 6
    public static void printNumbers(int maximum) {
        for (int i = 15; i <= maximum; i++) {
            System.out.print("[" + i + "] ");
        }

}
}