import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;

class dZ_3 implements Icon {
   final Image H;
   final Icon d;

   dZ_3(Image var1, Icon var2) {
      this.H = var1;
      this.d = var2;
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      var2.drawImage((Image)com.c.c(407852187882005563L).get(this), var3, var4, var1);
   }

   @Override
   public int getIconWidth() {
      return ((Icon)com.c.c(454908859540120195L).get(this)).getIconWidth();
   }

   @Override
   public int getIconHeight() {
      return ((Icon)com.c.c(454908859540120195L).get(this)).getIconHeight();
   }
}





