import java.io.IOException;

class U8 implements Runnable {
   @Override
   public void run() {
      bF_3.L = true;

      try {
         bF_3.W = System.currentTimeMillis();
         bF_3.w = bN_3.J.read(bF_3.O, 0, bF_3.O.length);
         bF_3.D = System.currentTimeMillis();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      bF_3.L = false;
   }
}





