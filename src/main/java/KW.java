import java.io.IOException;

class KW implements Runnable {
   final or_4 D;

   KW(or_4 var1) {
      this.D = var1;
   }

   @Override
   public void run() {
      try {
         this.D.H.close();
      } catch (IOException var2) {
      }
   }
}





