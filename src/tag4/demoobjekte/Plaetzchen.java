package tag4.demoobjekte;

public class Plaetzchen {

   private int dicke;
  
   private String verzierung;

   public Plaetzchen(int dicke) {
       this.dicke = dicke;
       verzierung = "nichts";
   }

   public void verziereMit(String verzierung){
       this.verzierung = verzierung;
   }

   public String toString() {
       return dicke + " mm mit " + verzierung;
   }
  
}
