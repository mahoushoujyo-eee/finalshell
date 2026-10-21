package com;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.Icon;

public class ez_4 implements Icon {
   final com.Fm_2 X;

   protected ez_4(com.Fm_2 var1) {
      this.X = var1;
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      this.X.i = new Rectangle(var3, var4, this.X.r, this.X.v);
      Graphics2D var5 = (Graphics2D)var2;
      Object var6 = RV.X(var5);
      this.X.r(var5, var3, var4);
      RV.X(var5, var6);
   }

   @Override
   public int getIconWidth() {
      return this.X.H();
   }

   @Override
   public int getIconHeight() {
      return this.X.R();
   }
}





