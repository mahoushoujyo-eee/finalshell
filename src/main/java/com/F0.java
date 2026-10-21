package com;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

class F0 extends JComponent {
   final xD_3 h;

   private F0(xD_3 var1) {
      this.h = var1;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      var1.setColor(GO.R);
      var1.fillRect(0, 0, this.getWidth(), this.getHeight() - 1);
      var1.setColor(GO.Ff);
      var1.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(0, 4);
   }

   F0(xD_3 var1, com.Y2 var2) {
      this(var1);
   }
}





