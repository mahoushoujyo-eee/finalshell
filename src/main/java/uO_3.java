import java.io.IOException;

class uO_3 implements Runnable {
   final byte[] u;

   uO_3(byte[] var1) {
      this.u = var1;
   }

   @Override
   public void run() {
      bz_4.o = true;

      try {
         bz_4.c = bN_3.J.read(this.u, 0, this.u.length);
         bz_4.a = System.currentTimeMillis();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      bz_4.o = false;
   }
}





