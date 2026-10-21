import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class fs_4 extends Thread {
   final yF_3 n;
   private final ServerSocket V;

   fs_4(yF_3 var1, ServerSocket var2) {
      this.n = var1;
      this.V = var2;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Socket var1 = this.V.accept();
            this.n.n(var1);
         } catch (IOException var2) {
            var2.printStackTrace();
         }
      }
   }
}





