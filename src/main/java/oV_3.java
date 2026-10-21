import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JTable;

class oV_3 implements ItemListener {
   final JComboBox u;
   final JTable D;
   final int[] Y;

   oV_3(JComboBox var1, JTable var2, int[] var3) {
      this.u = var1;
      this.D = var2;
      this.Y = var3;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      int var2 = ((JComboBox)com.c.c(527786525229751657L).get(this)).getSelectedIndex();
      ((JTable)com.c.c(471266748782016056L).get(this)).setAutoResizeMode(((int[])com.c.c(384109096542722567L).get(this))[var2]);
   }
}





