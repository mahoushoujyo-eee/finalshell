package com;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

class LR extends com.Lz_2 {
   final com.YM P;

   LR(com.YM var1) {
      this.P = var1;
   }

   public Insets D(com.O_ var1) {
      return new Insets(0, 2, 2, 2);
   }

   public void g(Graphics2D var1, Rectangle var2, com.O_ var3) {
      var1.setPaint(Color.BLACK);
      var1.drawRect(var2.x, var2.y - 1, var2.width - 1, var2.height);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.D((com.O_)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.g(var1, var2, (com.O_)var3);
   }
}





