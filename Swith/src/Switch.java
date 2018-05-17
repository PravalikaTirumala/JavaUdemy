public class Switch {
    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(6);
        /* int val =2;

        switch(val){
            case 1:
                System.out.println("val 1");
                break;
            case 2:
                System.out.println("val 2");
                 break;
            case 3: case 5: case 100:
                System.out.println("val 3");
                break;
            default:
                System.out.println("not 1 2 3 ");
        }
    }

        char c ='C';
        switch(Character.toLowerCase(c)){
            case 'A':
                System.out.println("it is A");
                break;
            case 'B':
                System.out.println("B");
                break;
            default:
                System.out.println("not A and B");
              //  break;
        }

    }
    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednusday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }*/
    }

    public static void printDayOfTheWeek(int day){
        if(day == 0)
            System.out.println("sunday");
        else if (day ==1)
                System.out.println("Monday");
        else if( day ==3)
                    System.out.println("tuesady");
        else
             System.out.println("invalid day");
        }

    }
