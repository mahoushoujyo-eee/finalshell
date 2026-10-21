package com.finalshell.ui.listener;

import com.finalshell.core.Ii4;
import com.finalshell.ui.panel.CC;
import com.finalshell.ui.panel.Co2;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ol4 extends MouseAdapter {
   final CC p;

   protected Ol4(CC var1) {
      this.p = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String var10000 = Co2.U$String();
      int var3 = this.p.getUI().locationToIndex(this.p, var1.getPoint());
      String var2 = var10000;
      int var8 = var3;
      if (var2 != null) {
         if (var3 == -1) {
            return;
         }

         var8 = (this.p.isEnabled()) ? 1 : 0;
      }

      label39: {
         if (var2 != null) {
            if (var8 == 0) {
               return;
            }

            var9 = this.p;
            if (var2 == null) {
               break label39;
            }

            var8 = this.p.h;
         }

         if (var8 != 0) {
            Ii4 var4 = this.p.A$ii_4();
            com.finalshell.core.Ui2 var5 = var4.m((com.finalshell.core.Uv2)this.p.A$eR_3().A(var3));
            Rectangle var6 = this.p.B().getCellBounds(this.p, var3, var3);
            Rectangle var7 = var5.M().u$Rectangle();
            var7.x = var7.x + var6.x;
            var7.y = var7.y + var6.y;
            if (var7.contains(var1.getPoint())) {
               this.p.x(var3);
            }

            if (var2 != null) {
               return;
            }
         }

         var9 = this.p;
      }

      var9.x(var3);
   }
}





