import java.io.IOException;
import java.net.DatagramPacket;

class JP extends Thread {
   final lA_3 U;
   private static final long a;

   JP(lA_3 var1) {
      this.U = var1;
   }

   @Override
   public void run() {
      while (true) {
         byte[] var1 = new byte[(int)a];
         DatagramPacket var2 = new DatagramPacket(var1, var1.length);

         try {
            this.U.X.receive(var2);
            this.U.Q.add(var2);
         } catch (IOException var6) {
            var6.printStackTrace();

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var5) {
               var5.printStackTrace();
            }
         }
      }
   }

   static {
      long var0 = 3802407109053930472L;
      long var10002 = 835178757329542708L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





