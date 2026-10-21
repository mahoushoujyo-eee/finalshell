import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class F3 extends DefaultTableCellRenderer {
   JLabel p;
   private static final long a;

   public F3() {
      com.c.c(417667448505604278L).set(this, new JLabel());
      ((JLabel)com.c.c(417667448505604278L).get(this)).setBorder(BorderFactory.createEmptyBorder(0, (int)a, 0, 0));
      ((JLabel)com.c.c(417667448505604278L).get(this)).setOpaque(false);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      ((JLabel)com.c.c(417667448505604278L).get(this)).setText(var2.toString());
      return (JLabel)com.c.c(417667448505604278L).get(this);
   }

   static {
      long var0 = 3611884370304039577L;
      long var10002 = 7260341071144680094L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





