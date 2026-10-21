import java.io.IOException;

class B9 implements Runnable {
   final a0 l;

   B9(a0 var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      try {
         this.l.x.close();
      } catch (IOException var2) {
      }
   }
}





