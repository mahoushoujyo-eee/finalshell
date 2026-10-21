import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

class Qv_2 implements Runnable {
   final JPasswordField J;
   final yy_4 a;
   private static final long b;

   Qv_2(yy_4 var1, JPasswordField var2) {
      this.a = var1;
      this.J = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(b);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new OL(this));
   }

   static {
      long var0 = 5184639206001186526L;
      long var10002 = 5184639206001186326L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





