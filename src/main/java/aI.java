import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPopupMenu;

class aI implements ActionListener {
   final JPopupMenu p;
   final JButton z;
   final nj_2 S;

   aI(nj_2 var1, JPopupMenu var2, JButton var3) {
      this.S = var1;
      this.p = var2;
      this.z = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      ((JPopupMenu)com.c.c(435569998697578167L).get(this))
         .show((JButton)com.c.c(428587681583803988L).get(this), 1, ((JButton)com.c.c(428587681583803988L).get(this)).getHeight() - 2);
   }
}





