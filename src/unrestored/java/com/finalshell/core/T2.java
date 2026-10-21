package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

public class T2 implements Icon {
   public final Icon V;

   public T2(Icon var1) {
      this.V = var1;
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      Object var5 = 128150346220784577L;
      ((Icon)Ref.g(128150346220784577L, var5)).paintIcon(var1, var2, var3, var4);
      ((Icon)Ref.g(177860219788792196L, null)).paintIcon(var1, var2, var3, var4);
   }

   @Override
   public int getIconWidth() {
      Object var1 = 128150346220784577L;
      return ((Icon)Ref.g(128150346220784577L, var1)).getIconWidth();
   }

   @Override
   public int getIconHeight() {
      Object var1 = 128150346220784577L;
      return ((Icon)Ref.g(128150346220784577L, var1)).getIconHeight();
   }
}





