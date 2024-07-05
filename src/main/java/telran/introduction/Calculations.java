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
    Integer res = null;
    if (op2 != 0) {
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
        int length = String.valueOf(number).length();
        int[] arr = new int [length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int value = number % 10;
            number /= 10;
            arr[i] = value;
            sum += arr[i];
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
            };
        }
    return max;
}
public static boolean isDividedOn (int number, int dividor){
        boolean result = false;
        if (number % dividor == 0) {
           result = true;
        }
    return result;
}
}
