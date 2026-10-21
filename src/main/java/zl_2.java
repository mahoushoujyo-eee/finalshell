import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

class zl_2 implements Runnable {
   final JPasswordField n;
   final fl_4 I;
   private static final long a;

   zl_2(fl_4 var1, JPasswordField var2) {
      this.I = var1;
      this.n = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new bb_4(this));
   }

   static {
      long var0 = 3696381474741709159L;
      long var10002 = 3696381474741709231L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





