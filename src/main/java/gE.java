import javax.swing.SwingUtilities;

class gE implements Runnable {
   final aM Q;
   private static final long a;

   gE(aM var1) {
      this.Q = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
      }

      SwingUtilities.invokeLater(new YS(this));
   }

   static {
      long var0 = 4262348397449795676L;
      long var10002 = 4262348397449795732L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





