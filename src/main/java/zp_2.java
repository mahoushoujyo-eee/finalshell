import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class zp_2 implements ActionListener {
   final JCheckBox Q;
   final ak_2 C;

   zp_2(ak_2 var1, JCheckBox var2) {
      this.C = var1;
      this.Q = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.c.c(370516434131129032L).setBoolean(com.c.c(474425056060006573L).get(this), ((JCheckBox)com.c.c(247641154193850073L).get(this)).isSelected());
   }
}





