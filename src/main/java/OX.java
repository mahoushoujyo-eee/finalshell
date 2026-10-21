import java.io.IOException;

class OX implements Runnable {
   final byte[] S;

   OX(byte[] var1) {
      this.S = var1;
   }

   @Override
   public void run() {
      bj_4.t = true;
      bj_4.x = true;

      try {
         bj_4.F = bN_3.J.read(this.S, 0, this.S.length);
         bj_4.T = System.currentTimeMillis();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      bj_4.t = false;
   }
}





