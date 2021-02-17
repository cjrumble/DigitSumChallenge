public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(232));
        System.out.println(sumDigits(111));
        System.out.println(sumDigits(100));
        System.out.println(sumDigits(999));
        System.out.println(sumDigits(000));
    }

     private static int sumDigits(int number) { //232
         if (number < 10) {
             return -1;
         }
         int sum = 0;
         for (int i = 0; number >= 1; i++) {
             int digit = number % 10;
             sum = sum + digit;
             number = number / 10;
         }
         return sum;
     }
}
