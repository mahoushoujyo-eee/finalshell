package com;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class RB extends JComponent {
   private boolean Y;

   public RB(boolean var1) {
      this.Y = var1;
      com.FN.Y(this);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Graphics2D var3 = (Graphics2D)var1;
      boolean var10000 = PQ.p();
      var3.setPaint(com.WK.Q);
      boolean var2 = var10000;
      var3.drawLine(0, 0, this.getWidth() - 1, 0);
      var3.setColor(com.WK.G);
      var3.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
      if (!var2) {
         if (this.Y) {
            var3.setColor(Sm_2.h);
            var3.drawLine(0, 2, 0, this.getHeight() - 4);
            if (!var2) {
               return;
            }
         }

         var3.setColor(Sm_2.h);
      }

      var3.drawLine(this.getWidth() - 1, 2, this.getWidth() - 1, this.getHeight() - 4);
   }
}





