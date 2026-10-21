import java.io.IOException;
import java.net.DatagramPacket;

class yz_4 implements Runnable {
   final o9_2 k;
   private static final long a;

   yz_4(o9_2 var1) {
      this.k = var1;
   }

   @Override
   public void run() {
      String[] var1 = QI.N();

      while (true) {
         byte[] var2 = new byte[(int)a];
         DatagramPacket var3 = new DatagramPacket(var2, var2.length);

         try {
            this.k.k.receive(var3);
            byte[] var4 = var3.getData();
            int var5 = lH_3.z(var4, 0);

            while (var5 == D6.s) {
               Wu_2 var6 = new Wu_2(var3);
               int var7 = var6.l();
               lc_4 var8 = (lc_4)this.k.C.get(var7);
               if (var1 != null) {
                  lc_4 var10000;
                  label27: {
                     try {
                        var10000 = var8;
                        if (var1 == null) {
                           break label27;
                        }

                        if (var8 == null) {
                           break;
                        }
                     } catch (IOException var9) {
                        throw a(var9);
                     }

                     var8.B = true;
                     var8.m = System.currentTimeMillis();
                     var10000 = var8;
                  }

                  var10000.o = (int)(var8.m - var8.T);
                  break;
               }
            }
         } catch (IOException var10) {
            return;
         }
      }
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   static {
      long var0 = 6897935784349423364L;
      long var10002 = 7105626766262817540L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





