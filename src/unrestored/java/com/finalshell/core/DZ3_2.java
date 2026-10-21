package com.finalshell.core;

import com.finalshell.reflect.Ref;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;

public class DZ3_2 implements Icon {
   public final Image H;
   public final Icon d;

   public DZ3_2(Image var1, Icon var2) {
      this.H = var1;
      this.d = var2;
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      Object var5 = 407852187882005563L;
      this.drawImage((Image)Ref.g(407852187882005563L, var5), var3, var4, var1);
   }

   @Override
   public int getIconWidth() {
      Object var1 = 454908859540120195L;
      return ((Icon)Ref.g(454908859540120195L, var1)).getIconWidth();
   }

   @Override
   public int getIconHeight() {
      Object var1 = 454908859540120195L;
      return ((Icon)Ref.g(454908859540120195L, var1)).getIconHeight();
   }
}





