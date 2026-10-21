import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

class dY_3 implements Runnable {
   final JScrollPane G;
   final xw_2 w;
   private static final long a;

   dY_3(xw_2 var1, JScrollPane var2) {
      this.w = var1;
      this.G = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new Lo_2(this));
   }

   static {
      long var0 = 4400891631342927584L;
      long var10002 = 4400891631342927400L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





