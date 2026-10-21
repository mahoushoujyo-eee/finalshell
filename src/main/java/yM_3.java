import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.SwingUtilities;

class yM_3 extends ComponentAdapter {
   final KQ q;

   yM_3(KQ var1) {
      this.q = var1;
   }

   @Override
   public void componentShown(ComponentEvent var1) {
      ((KQ)com.c.c(173060672883094482L).get(this)).setFocusableWindowState(true);
      ((KQ)com.c.c(173060672883094482L).get(this)).getContentPane().requestFocus();
      SwingUtilities.invokeLater(new nV(this));
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
      ((KQ)com.c.c(173060672883094482L).get(this)).setFocusableWindowState(false);
   }
}





