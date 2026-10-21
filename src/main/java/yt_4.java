import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class yt_4 implements FocusListener {
   final KC x;

   yt_4(KC var1) {
      this.x = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
   }

   @Override
   public void focusLost(FocusEvent var1) {
      ((a3)com.c.c(489572751534480599L).get(com.c.c(169243950586061429L).get(this))).stopEditing();
   }
}





