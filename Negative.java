/** Name: Katelyn Spier
 *  Date: 4/10/24
 *  File Name: Negative.java
 */
public class Negative{
    public static void main(String[]args){
        int sum;
        int num1 = (int)(7*Math.random()-3);
        int num2 = (int)(7*Math.random()-3);
        int num3 = (int)(7*Math.random()-3);
        int num4 = (int)(7*Math.random()-3);
        sum = (num1 + num2 + num3 + num4);
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
        System.out.println("num3 " + num3);
        System.out.println("num4 " + num4);
        System.out.println("The sum of the numbers is " + sum);
        if (sum < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Not Negative");
        }
    }
}