import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

class Og_2 implements ActionListener {
   final l5_2 R;

   Og_2(l5_2 var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      SwingUtilities.invokeLater(new Cv_2(this));
   }
}





