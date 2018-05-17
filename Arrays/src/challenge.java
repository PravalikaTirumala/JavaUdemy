import java.util.Scanner;

public class challenge {
    private static  Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int [] arr1 = getIntegers(3);
        printArray(arr1);
        int[] ars = sortArray(arr1);
       printArray(ars);
    }

    public static int[] getIntegers(int num){
        int [] val = new int[num];
        for(int j=0;j<val.length;j++){
            val[j] = in.nextInt();
        }
        return val;
    }


    public static void printArray(int [] arr2){
        for(int i=0;i<arr2.length;i++){
            arr2[i] = in.nextInt();
        }
    }
    public static int[] sortArray(int[] arr3){
        int[] sortarr =new int[arr3.length];

        for(int i=0; i< arr3.length;i++){
            sortarr[i] = arr3[i];
        }

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i=0;i<sortarr.length-1;i++){
                if(sortarr[i] < sortarr[i+1]){
                    temp = sortarr[i];
                    sortarr[i] = sortarr[i+1];
                    sortarr[i+1]=temp;
                    flag = true;
                }
            }
        }
        return sortarr;
    }
}
