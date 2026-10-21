import javax.swing.SwingUtilities;

class Dz_2 implements Runnable {
   final int n;
   final Vz_2 V;
   private static final long a;

   Dz_2(Vz_2 var1, int var2) {
      this.V = var1;
      this.n = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new CQ(this));
   }

   static {
      long var0 = 2401060664398434607L;
      long var10002 = 2401060664398434635L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





