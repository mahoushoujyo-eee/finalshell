import java.io.IOException;
import java.io.InputStream;

class lb_4 implements Runnable {
   final F0 n;
   private final InputStream a;
   private static final long b;

   lb_4(F0 var1, InputStream var2) {
      this.n = var1;
      this.a = var2;
   }

   @Override
   public void run() {
      byte[] var1 = new byte[(int)b];
      boolean var2 = false;

      try {
         while (this.a.read(var1) > 0) {
         }
      } catch (IOException var4) {
      }

      this.n.d();
   }

   static {
      long var0 = 405675892572364770L;
      long var10002 = -7209564859997414430L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





