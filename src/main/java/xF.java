import java.io.IOException;
import java.net.DatagramPacket;

class xF implements Runnable {
   final F0 X;
   private static final long a;

   xF(F0 var1) {
      this.X = var1;
   }

   @Override
   public void run() {
      while (true) {
         byte[] var1 = new byte[(int)a];
         DatagramPacket var2 = new DatagramPacket(var1, var1.length);

         try {
            this.X.X.receive(var2);
            this.X.e(var2);
         } catch (IOException var4) {
            return;
         }
      }
   }

   static {
      long var0 = 5889304329227815079L;
      long var10002 = -7522189072139596421L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





