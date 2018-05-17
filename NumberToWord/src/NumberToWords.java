public class NumberToWords {
    public static void main(String [] args){
        convertToWords(235);
    }

    public static int convertToWords(int number){
        if(number <0)
            return -1;
        else{
            int rev = reverse(number);
            int count = getDigitCount(rev);
            while(count != 0){

            }
        }
        return rev;
    }

    public static int reverse(int num){
        int rev=0;
        while(num !=0){
            int lastDig = num %10;
            rev = (rev*10)+lastDig;
            num = num /10;
        }
        return rev;
    }

    public static int getDigitCount(int num){
        int count =0;
        while(num !=0){
           count++;
            num = num /10;
        }
        return count;
    }
}
