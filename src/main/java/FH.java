import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class FH implements ActionListener {
   final JCheckBox q;
   final VN B;

   FH(VN var1, JCheckBox var2) {
      this.B = var1;
      this.q = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.c.c(376642468236131701L).setBoolean(com.c.c(598983633426453347L).get(this), ((JCheckBox)com.c.c(516913929395634792L).get(this)).isSelected());
   }
}





