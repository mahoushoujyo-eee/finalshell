package com;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class SB extends MouseMotionAdapter {
   final iY_3 F;
   final pA_3 d;

   SB(pA_3 var1, iY_3 var2) {
      this.d = var1;
      this.F = var2;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      pA_3 var4;
      MouseEvent var10001;
      label24: {
         int var2 = _y_2.M();
         boolean var10000 = pA_3.S(this.d).t();
         if (var2 != 0) {
            if (!var10000) {
               return;
            }

            var4 = this.d;
            var10001 = var1;
            if (var2 == 0) {
               break label24;
            }

            var10000 = this.d.b(var1);
         }

         if (!var10000) {
            return;
         }

         var4 = this.d;
         var10001 = var1;
      }

      XE var3 = pA_3.x(var4, var10001.getPoint());
      this.F.R(var3.q, var3.r, new EW(var1));
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      pA_3 var4;
      MouseEvent var10001;
      label24: {
         int var2 = _y_2.y();
         boolean var10000 = pA_3.S(this.d).t();
         if (var2 == 0) {
            if (!var10000) {
               return;
            }

            var4 = this.d;
            var10001 = var1;
            if (var2 != 0) {
               break label24;
            }

            var10000 = this.d.b(var1);
         }

         if (!var10000) {
            return;
         }

         var4 = this.d;
         var10001 = var1;
      }

      XE var3 = pA_3.x(var4, var10001.getPoint());
      this.F.G(var3.q, var3.r, new EW(var1));
   }
}





