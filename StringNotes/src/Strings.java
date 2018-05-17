public class Strings {
    public static void main(String [] args){
       String str1 = "This is a String type";
        System.out.println(str1);
        str1 = str1+ " This is concating";
        System.out.println(str1);
        str1= "This is concating at the begining "+str1;
        System.out.println(str1);

        String str2="250.54";
        str2= str2 + "544.76";
        System.out.println(str2);

        String str3 = "10";
        int num1 = 50;
        str3 = str3+num1;
        System.out.println(str3);
    }
}
