package ex_22_OOPs_Encp_AccessModifier.police;

public class Cop {
     protected int gun;
     protected String iCard;

     protected Cop(int bullet) {
         this.gun = bullet;
     }
     public void canIShoot(){
     System.out.println("Yes you can !!");
     }
     void thisDefaultF1(){
          System.out.println("Hi, Cop!");
     }
}
