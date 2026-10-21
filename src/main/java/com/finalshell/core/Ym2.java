package com.finalshell.core;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ym2 extends Y2 {
   final ConnectionProperty s;

   Ym2(ConnectionProperty var1) {
      this.s = var1;
   }

   @Override
   protected void v(Graphics2D var1, Rectangle var2) {
      int var10000 = ConnectionProperty.M$int();
      WZ var4 = this.s.kj.f$WZ();
      int var3 = var10000;
      if (var4 != null) {
         int var5 = this.s.e.getModel().getMaximum() - this.s.e.getModel().getMinimum();
         int var6 = Math.max(2, this.v.height / var5);
         Color var7 = (Color)Registry.lookupField(267150274335408220L).get(null);
         var1.setColor(var7);

         for (PE3 var9 : var4.B()) {
            int var10 = this.v.height * var9.s().r / var5;
            var1.fillRect(this.v.x, this.v.y + var10, this.v.width, var6);
            if (var3 == 0) {
               break;
            }
         }
      }
   }
}





