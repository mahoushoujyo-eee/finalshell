import java.io.IOException;

class Cu_2 implements Runnable {
   final aU Y;
   final DH q;

   Cu_2(DH var1, aU var2) {
      this.q = var1;
      this.Y = var2;
   }

   @Override
   public void run() {
      try {
         this.q.H(this.Y);
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }
}





