package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class SU extends MouseAdapter {
   final iY_3 c;
   final pA_3 e;

   SU(pA_3 var1, iY_3 var2) {
      this.e = var1;
      this.c = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      pA_3 var4;
      MouseEvent var10001;
      label24: {
         int var2 = _y_2.M();
         boolean var10000 = pA_3.S(this.e).t();
         if (var2 != 0) {
            if (!var10000) {
               return;
            }

            var4 = this.e;
            var10001 = var1;
            if (var2 == 0) {
               break label24;
            }

            var10000 = this.e.b(var1);
         }

         if (!var10000) {
            return;
         }

         var4 = this.e;
         var10001 = var1;
      }

      XE var3 = pA_3.x(var4, var10001.getPoint());
      this.c.u(var3.q, var3.r, new EW(var1));
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      pA_3 var4;
      MouseEvent var10001;
      label24: {
         int var2 = _y_2.M();
         boolean var10000 = pA_3.S(this.e).t();
         if (var2 != 0) {
            if (!var10000) {
               return;
            }

            var4 = this.e;
            var10001 = var1;
            if (var2 == 0) {
               break label24;
            }

            var10000 = this.e.b(var1);
         }

         if (!var10000) {
            return;
         }

         var4 = this.e;
         var10001 = var1;
      }

      XE var3 = pA_3.x(var4, var10001.getPoint());
      this.c.z(var3.q, var3.r, new EW(var1));
   }
}





