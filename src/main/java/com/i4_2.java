package com;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class i4_2 extends MouseAdapter {
   final com.oY_3 W;

   protected i4_2(com.oY_3 var1) {
      this.W = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var2 = com.oY_3.Z();
      boolean var10000 = this.W.isEnabled();
      if (!var2) {
         if (!var10000) {
            return;
         }

         var10000 = this.W.w();
      }

      if (!var2) {
         if (!var10000) {
            return;
         }

         var10000 = com.FN.B(var1);
      }

      if (var10000) {
         this.W.i = true;
         this.f(var1.getPoint());
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      boolean var2 = com.oY_3.y();
      boolean var10000 = this.W.i;
      if (var2) {
         if (!this.W.i) {
            return;
         }

         var10000 = com.FN.B(var1);
      }

      if (var10000) {
         this.f(var1.getPoint());
      }
   }

   protected void f(Point var1) {
      float var3;
      label17: {
         boolean var10000 = com.oY_3.Z();
         var3 = this.W.M(var1);
         boolean var2 = var10000;
         if (!var2) {
            switch (Sy_2.s[this.W.c.ordinal()]) {
               case 1:
                  this.W.d(Math.round(var3));
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

      this.W.d(Math.round(var3 - var3 % 1.0F));
      this.W.o(var3 % 1.0F);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      boolean var2 = com.oY_3.y();
      boolean var10000 = this.W.i;
      if (var2) {
         if (!this.W.i) {
            return;
         }

         var10000 = com.FN.B(var1);
      }

      if (var10000) {
         this.W.i = false;
      }
   }
}





