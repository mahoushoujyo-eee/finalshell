package com.finalshell.core;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class LR extends Lz2_2 {
   final com.finalshell.ui.listener.YM P;

   LR(com.finalshell.ui.listener.YM var1) {
      this.P = var1;
   }

   public Insets D(com.finalshell.ui.panel.O var1) {
      return new Insets(0, 2, 2, 2);
   }

   public void g(Graphics2D var1, Rectangle var2, com.finalshell.ui.panel.O var3) {
      var1.setPaint(Color.BLACK);
      var1.drawRect(var2.x, var2.y - 1, var2.width - 1, var2.height);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.D((com.finalshell.ui.panel.O)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.g(var1, var2, (com.finalshell.ui.panel.O)var3);
   }
}





