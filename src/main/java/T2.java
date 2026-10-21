import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

class T2 implements Icon {
   final Icon V;

   T2(Icon var1) {
      this.V = var1;
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      ((Icon)com.c.c(128150346220784577L).get(this)).paintIcon(var1, var2, var3, var4);
      ((Icon)com.c.c(177860219788792196L).get(null)).paintIcon(var1, var2, var3, var4);
   }

   @Override
   public int getIconWidth() {
      return ((Icon)com.c.c(128150346220784577L).get(this)).getIconWidth();
   }

   @Override
   public int getIconHeight() {
      return ((Icon)com.c.c(128150346220784577L).get(this)).getIconHeight();
   }
}





