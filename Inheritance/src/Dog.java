public class Dog extends Animal{

    private int eyes;
   private int legs;
   private int tail;
   private int teeth;
   private String coot;

    public Dog(  int size, int weight, String name, int eys, int legs, int tail,int teeth, String coot) {
        super(1, 1, size, weight, name);
        this.eyes=eys;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coot=coot;
    }

    private void chew(){
        System.out.println("chew from dog");
    }

    @Override
    public void eat() {
        System.out.println("eat from dog");
        chew();
        super.eat();

    }

    public void walk(){
        System.out.println("walk from dog");
       super.move(5);
    }

    public void run(){
        System.out.println("run from dog");
       //super is necesssary when the method is overridden in this class,
        // else by default it considers th super class method with out the super keyword
        //super.move() - only execute super class move method
        //move() - look for this class movee(), if there is none then execute super class's
        super.move(10);
    }
}
