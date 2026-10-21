import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

class xu_2 implements Runnable {
   final Li_2 v;
   private static final long a;

   xu_2(Li_2 var1) {
      this.v = var1;
   }

   @Override
   public void run() {
      try {
         Socket var1 = new Socket(this.v.l, (int)a);
         var1.close();
      } catch (UnknownHostException var2) {
         var2.printStackTrace();
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   static {
      long var0 = 8490971560785463072L;
      long var10002 = 6180988572465612656L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





