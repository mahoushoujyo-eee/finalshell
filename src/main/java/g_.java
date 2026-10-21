import javax.swing.SwingUtilities;

class g_ implements Runnable {
   final KA V;
   private static final long a;

   g_(KA var1) {
      this.V = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new Jb_2(this));
   }

   static {
      long var0 = 591028527190101473L;
      long var10002 = 591028527190101381L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





