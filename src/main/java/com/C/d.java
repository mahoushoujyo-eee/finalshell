package com.C;

import com.ia_4;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class d extends com.C.O implements ia_4 {
   public Boolean y(JPanel var1) {
      int[] var2 = com.C.W.B();
      boolean var10000 = this.F;
      if (var2 == null) {
         if (this.F) {
            return null;
         }

         var10000 = false;
      }

      return var10000;
   }

   public void h(Graphics2D var1, Rectangle var2, JPanel var3) {
      int[] var4 = com.C.W.B();
      com.C.d var10000 = this;
      if (var4 == null) {
         if (this.F && var3.isOpaque()) {
            var1.setPaint(var3.getBackground());
            var1.fillRect(var2.x, var2.y, var2.width, var2.height);
         }

         var10000 = this;
      }

      var10000.u(var1, var2, var3);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.h(var1, var2, (JPanel)var3);
   }

   @Override
   public Boolean d(JComponent var1) {
      return this.y((JPanel)var1);
   }
}





