import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

class Ly_2 implements WindowFocusListener {
   final C5 x;

   Ly_2(C5 var1) {
      this.x = var1;
   }

   @Override
   public void windowGainedFocus(WindowEvent var1) {
   }

   @Override
   public void windowLostFocus(WindowEvent var1) {
      com.c.c(551384867496479483L).setLong(com.c.c(622353857250685855L).get(this), System.currentTimeMillis());
      ((C5)com.c.c(622353857250685855L).get(this)).setVisible(false);
   }
}





