package com.finalshell.core;

import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Objects;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class AF extends BasicScrollBarUI {
   final ConnectionProperty t;

   public AF(ConnectionProperty var1) {
      this.t = var1;
   }

   @Override
   protected void paintTrack(Graphics var1, JComponent var2, Rectangle var3) {
      int var10000 = ConnectionProperty.y();
      super.paintTrack(var1, var2, var3);
      int var4 = var10000;
      WZ var5 = this.t.kj.f$WZ();
      if (var5 != null) {
         int var6 = this.scrollbar.getModel().getMaximum() - this.scrollbar.getModel().getMinimum();
         int var7 = Math.max(2, var3.height / var6);
         XF3 var8 = this.t.kC.M().o(Objects.requireNonNull(this.t.kC.i().s()));
         var1.setColor(LG3.H(var8));

         for (PE3 var10 : var5.B()) {
            int var11 = var3.height * var10.s().r / var6;
            var1.fillRect(var3.x, var3.y + var11, var3.width, var7);
            if (var4 != 0) {
               break;
            }
         }
      }
   }
}





