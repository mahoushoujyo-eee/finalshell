import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

class oq_4 implements FocusListener {
   final xl_2 u;

   oq_4(xl_2 var1) {
      this.u = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
   }

   @Override
   public void focusGained(FocusEvent var1) {
      ((JTextField)com.c.c(626158744249045388L).get(com.c.c(132075193542412282L).get(this))).selectAll();
   }
}





