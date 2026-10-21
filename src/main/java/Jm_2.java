import java.io.IOException;
import java.net.Socket;

class Jm_2 extends Thread {
   final Bg_2 P;

   Jm_2(Bg_2 var1) {
      this.P = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Socket var1 = this.P.v.accept();
            this.P.T(var1);
         } catch (IOException var2) {
            var2.printStackTrace();
         }
      }
   }
}





