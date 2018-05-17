// check whether a number is prime or not and palindrome
public class Test {
    public static void main(String[] args) {
        System.out.println(isPrime(19));
        System.out.println(isPalindrome(222));
        // 1st and last digit sum
        System.out.println(sumFirstAndLastDigit(23567));
    }

    public static boolean isPrime(int n) {
       // int count = 0;
        if (n == 1)
            return false;
        //n/2 gives more number of loops and sqrt(n) gives less number of loops
        //for(int i =2;i<=n/2;i++){
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
           // count++;
        }
      //  System.out.println(count);
        return true;
    }

    public static boolean isPalindrome(int number) {
        int rev = 0;
        int lastDig = 0;
        int num = number;
        while (true) {
            lastDig = num % 10;
            rev = (rev * 10) + lastDig;
            num = num / 10;
            if (num == 0)
                break;
        }


        return (rev == number);
    }
// first and last digit sum
    public static int  sumFirstAndLastDigit(int number){
        if(number <0)
            return -1;

        int first=0;
        int last =number %10;
        while(number >=10){
            number = number /10;
        }
        return (number + last);
    }
}



