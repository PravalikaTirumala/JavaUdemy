public class Main {
    public static void main(String[] args){
//        Player player = new Player();
//        player.name ="tim";
//        player.health =20;
//        player.weapon ="bat";
//
//        int damage =10;
//        player.lossOFHEalth(damage);
//        System.out.println("remaining haelth"+ player.healthRemaining());

        EncapsuledPlayer e =new EncapsuledPlayer("tim",20,"bat");
        System.out.println(e.healthRemaining());
    }
}

//