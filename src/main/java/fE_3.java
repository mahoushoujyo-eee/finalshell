import java.io.IOException;

class fE_3 implements Runnable {
   final byte[] l;
   private static final long a;

   fE_3(byte[] var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      bj_4.t = true;
      bj_4.x = true;

      try {
         bj_4.F = bN_3.J.read(this.l, 0, (int)a);
         bj_4.T = System.currentTimeMillis();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      bj_4.t = false;
   }

   static {
      long var0 = 541338869980506280L;
      long var10002 = 1132557778453047528L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





