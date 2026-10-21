import javax.swing.SwingUtilities;

class Di_2 implements Runnable {
   final Bq_2 q;
   private static final long a;

   Di_2(Bq_2 var1) {
      this.q = var1;
   }

   @Override
   public void run() {
      int var1 = (int)a;

      try {
         Thread.sleep((long)var1);
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

      SwingUtilities.invokeLater(new yx_4(this, var1));
   }

   static {
      long var0 = 4738022423121376192L;
      long var10002 = -3096284184352902236L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





