import java.io.IOException;

class mJ implements Runnable {
   final com.dQ_3 C;
   final String J;
   final Ty_2 d;

   mJ(Ty_2 var1, com.dQ_3 var2, String var3) {
      this.d = var1;
      this.C = var2;
      this.J = var3;
   }

   @Override
   public void run() {
      try {
         ((com.dQ_3)com.c.c(558646295097493228L).get(this)).j().write(((String)com.c.c(408840269454195855L).get(this)).getBytes());
         ((com.dQ_3)com.c.c(558646295097493228L).get(this)).j().flush();
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }
}





