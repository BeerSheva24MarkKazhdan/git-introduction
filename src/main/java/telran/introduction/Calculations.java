package telran.introduction;

public class Calculations {
public static int sum(int op1, int op2){
    int res = op1 + op2;
    return res;
}    
public static int multiply(int op1, int op2){
    int res = op1 * op2;
    return res;
}
public static int divide (int op1, int op2){
        int res = 0;
        if (op2 == 0) {
            System.out.println("Dividing on zero") ;
        } else {
            res = op1 / op2;
        }
    return res;
}
public static int substract (int op1, int op2){
    int res = op1 - op2;
    return res;
}
public static int sumOfDigits (int number){
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
           int digit = number % 10;
           sum = sum + digit;
           number /= 10;
        }
        return sum;
}
public static int maxDigit (int number){
    int maxvalue = -1;
        int max = -1;
        number = Math.abs(number);
        while (number > 0) {
            maxvalue = number % 10;
            number /= 10;
            if (maxvalue > max) {
                max = maxvalue;
            }
        }
    return max;
}
public static boolean isDividedOn (int number, int dividor){
        boolean result = false;
        if (dividor == 0) {
            System.out.println("Dividing on zero");
        } else if (number % dividor == 0) {
            result = true; 
        }
    return result;
}
}
