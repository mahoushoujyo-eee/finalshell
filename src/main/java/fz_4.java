import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

class fz_4 implements Runnable {
   final JPasswordField i;
   final yy_4 G;
   private static final long a;

   fz_4(yy_4 var1, JPasswordField var2) {
      this.G = var1;
      this.i = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new b3_2(this));
   }

   static {
      long var0 = 3403430707449283592L;
      long var10002 = 3403430707449283776L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





