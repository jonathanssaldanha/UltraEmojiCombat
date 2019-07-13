package ultraemojicombat;
public class UltraEmojiCombat {
  
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Jonathan01", "Brasileiro", 30, 1.75f, 68.9f, 1, 20, 15);
        l[1] = new Lutador("Jonathan02", "Brasileiro", 30, 1.75f, 68.9f, 2, 10, 25);
        l[2] = new Lutador("Jonathan03", "Brasileiro", 30, 1.75f, 68.9f, 3, 30, 35);
        l[3] = new Lutador("Jonathan04", "Brasileiro", 30, 1.75f, 68.9f, 11, 2, 1);
        l[4] = new Lutador("Jonathan05", "Brasileiro", 30, 1.75f, 68.9f, 11, 2, 1);
        l[5] = new Lutador("Jonathan06", "Brasileiro", 30, 1.75f, 68.9f, 11, 2, 1);
        
        
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        System.out.println("------------------------");
        l[1].status();
//        System.out.println("------------------------");
//        
//        l[3].apresentar();
//        
//        System.out.println("------------------------");
//        
//        l[3].ganharLuta();
//        l[3].empatarLuta();
//        l[3].perderLuta();
//        
//                
//        l[3].setPeso(10f);
//        l[3].status();
//        
//        System.out.println("---------------------------------");
//        Lutador lutador2 = new Lutador("Jonathan", "Brasileiro", 28, 1.65f, 92.2f, 11, 2, 1);
//        //l.apresentar();
//        lutador2.status();
    }
    
}
