import java.awt.Window;
import javax.swing.JFrame;

class kv_4 implements Runnable {
   final Window v;

   kv_4(Window var1) {
      this.v = var1;
   }

   @Override
   public void run() {
      com.ky_4[] var10000 = yT_3.c();
      ((Window)com.c.c(309631282188126622L).get(this)).setVisible(true);
      com.ky_4[] var1 = var10000;
      Window var3 = (Window)com.c.c(309631282188126622L).get(this);
      if (var1 != null) {
         if (var3 instanceof JFrame) {
            JFrame var2 = (JFrame)com.c.c(309631282188126622L).get(this);
            var2.setState(0);
         }

         var3 = (Window)com.c.c(309631282188126622L).get(this);
      }

      var3.toFront();
   }
}





