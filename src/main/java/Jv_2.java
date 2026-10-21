import java.io.IOException;

class Jv_2 implements Runnable {
   final a0 I;

   Jv_2(a0 var1) {
      this.I = var1;
   }

   @Override
   public void run() {
      try {
         this.I.L.close();
      } catch (IOException var2) {
      }
   }
}





