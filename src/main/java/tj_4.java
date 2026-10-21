import java.io.IOException;

class tj_4 implements Runnable {
   final or_4 P;

   tj_4(or_4 var1) {
      this.P = var1;
   }

   @Override
   public void run() {
      try {
         this.P.e.close();
      } catch (IOException var2) {
      }
   }
}





