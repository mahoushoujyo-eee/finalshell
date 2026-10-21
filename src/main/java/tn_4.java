import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

class tn_4 implements Runnable {
   final JPasswordField b;
   final fl_4 R;
   private static final long a;

   tn_4(fl_4 var1, JPasswordField var2) {
      this.R = var1;
      this.b = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new Yw_2(this));
   }

   static {
      long var0 = 8891621449729358866L;
      long var10002 = 8891621449729359066L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





