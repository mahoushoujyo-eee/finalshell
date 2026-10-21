package com.finalshell.core;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class Yv2 extends Y_ implements Ia4 {
   public Boolean U(JPanel var1) {
      int var2 = Yp2.f();
      boolean var10000 = this.N;
      if (var2 == 0) {
         if (this.N) {
            return null;
         }

         var10000 = false;
      }

      return var10000;
   }

   public void q(Graphics2D var1, Rectangle var2, JPanel var3) {
      int var4 = Yp2.T();
      Yv2 var10000 = this;
      if (var4 != 0) {
         if (this.N && var3.isOpaque()) {
            var1.setPaint(var3.getBackground());
            var1.fillRect(var2.x, var2.y, var2.width, var2.height);
         }

         var10000 = this;
      }

      var10000.u(var1, var2, var3);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.q(var1, var2, (JPanel)var3);
   }

   @Override
   public Boolean d$Boolean(JComponent var1) {
      return this.U((JPanel)var1);
   }
}





