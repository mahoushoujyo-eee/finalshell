import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;

class k1_2 extends WindowAdapter {
   final JPanel y;
   final DU G;

   k1_2(DU var1, JPanel var2) {
      this.G = var1;
      this.y = var2;
   }

   @Override
   public void windowOpened(WindowEvent var1) {
      ((JPanel)com.c.c(147251249798586499L).get(this)).requestFocus();
   }
}





