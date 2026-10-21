package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.core.Sy2;
import com.finalshell.ui.panel.OY3;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class I42 extends MouseAdapter {
   public final OY3 W;

   public I42(OY3 var1) {
      this.W = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var2 = OY3.Z();
      boolean var10000 = this.W.isEnabled();
      if (!var2) {
         if (!var10000) {
            return;
         }

         var10000 = this.W.w$boolean();
      }

      if (!var2) {
         if (!var10000) {
            return;
         }

         var10000 = FN.B(var1);
      }

      if (var10000) {
         this.W.i = true;
         this.f(var1.getPoint());
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      boolean var2 = OY3.y$boolean();
      boolean var10000 = this.W.i;
      if (var2) {
         if (!this.W.i) {
            return;
         }

         var10000 = FN.B(var1);
      }

      if (var10000) {
         this.f(var1.getPoint());
      }
   }

   public void f(Point var1) {
      float var3;
      label17: {
         boolean var10000 = OY3.Z();
         var3 = this.W.M(var1);
         boolean var2 = var10000;
         if (!var2) {
            switch (Sy2.s[this.W.c.ordinal()]) {
               case 1:
                  this.W.d$void(Math.round(var3));
                  break;
               case 2:
                  break label17;
               default:
                  return;
            }
         }

         if (!var2) {
            return;
         }
      }

      this.W.d$void(Math.round(var3 - var3 % 1.0F));
      this.W.o(var3 % 1.0F);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      boolean var2 = OY3.y$boolean();
      boolean var10000 = this.W.i;
      if (var2) {
         if (!this.W.i) {
            return;
         }

         var10000 = FN.B(var1);
      }

      if (var10000) {
         this.W.i = false;
      }
   }
}





