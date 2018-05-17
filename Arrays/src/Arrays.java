import java.util.Scanner;

public class Arrays {
    private static Scanner in =new Scanner(System.in);
    public static void main(String[] args){
      /*  int [] arr = new int[10];
        arr[5] = 50;
        double [] arr2 = new double[10];
        //default initialization is 0
        System.out.println(arr[6]);*/

      int[] arr= getInteger(5);


        printArray(arr);
        System.out.println(getAverage(arr));
    }

    public static int[] getInteger(int num){
        int [] val = new int[num];
        for(int j=0;j<val.length;j++){
            val[j] = in.nextInt();
        }
        return val;
    }
    public static void printArray(int [] aa){
        for(int i=0;i<aa.length;i++){
            System.out.println(aa[i]);
        }
    }

    public static double getAverage(int [] aaa){
        int sum=0;
        for(int i=0;i<aaa.length;i++){
            sum += aaa[i];
        }
      //  return (double)sum /(double) aaa.length;
        return (sum )/ (double)aaa.length;
    }
}
