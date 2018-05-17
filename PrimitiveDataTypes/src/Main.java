/**
 * java treats right side of the expressions to be as int hence
 * for short and for byte it needs type casting
 */
public class Main {
    public static void main(String [] args){
        //  value, 200 - literal : (a+b) - expression
        //width of 32
      /*  int num1 = -2147483648; // minimum value of an integer
        int num2 = 2147483647; // max value of an integer

        //width of 16
        short num5= -32768;
        short num6= 32767;

        //width of 8
        byte num3= -128;//max of byte
        byte num4= 127; // min of byte

        //width of 64 : not using L/l is technically wrong
        long num7=100L; // 2 power of 63


       //by defalut in an expression java converts it in to in,hence
        //need type casting
       // num3=(num3/2); - gives error
       num3=(byte)(num3/2);


        byte test1=100;
        short test2=50;
        int test3=900;
        //casting is not required, as long holds larger values than byte short and int
        long test4=50000L + 10L * ( test1+test2+test3 );
        System.out.println(test4);
        short nn= (short)(1000+10+(test1+test2+test3));
        System.out.println();

      //floting point numbers - float and double

        int val1 = 5;
        float val2 = 5f; // right one
        //float val2 = 5.4 - error: it treats it as double
        double val3=5d;

        System.out.println(val1); //5
        System.out.println(val2);//5.0
        System.out.println(val3);//5.0

        //val1 = 5/2 : 2
        //val2 = 5f/2f : 2.5 , shows 7 digits after the precision
        //val3 = 5d/2d : 2.5 , shows 16 digits after the precision
        // width (float ) - 32 bits , double - 64 bits

      //challenge : 1 pound = 0.45359237 kgs
        double poundVal = 200;
        double kgVal = poundVal * 0.45359237;
        System.out.println(kgVal);

      //char and boolean
    //width of 16 : char
        char char1='\u00A9';
        System.out.println(char1);
    //boolean
        boolean b1 =true; //or it can be false*/
    //  challenge:

    char char2 ='\u00AE';
        System.out.println(char2);









    }
}
