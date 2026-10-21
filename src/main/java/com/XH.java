package com;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class XH extends MouseMotionAdapter {
   final pA_3 i;
   private static final long a;

   XH(pA_3 var1) {
      this.i = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      pA_3.f(this.i, var1.getPoint(), var1.isControlDown());
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int var2 = _y_2.y();
      long var8;
      int var10000 = (var8 = System.currentTimeMillis() - this.i.M - a) == 0L ? 0 : (var8 < 0L ? -1 : 1);
      if (var2 == 0) {
         if (var10000 < 0) {
            return;
         }

         var10000 = this.i.A;
      }

      if (var2 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.i.m(var1);
      }

      MouseEvent var10001;
      label71: {
         if (var2 == 0) {
            if (var10000 == 0) {
               return;
            }

            var4 = this.i;
            var10001 = var1;
            if (var2 != 0) {
               break label71;
            }

            var10000 = this.i.m(var1);
         }

         if (var10000 == 0) {
            return;
         }

         var4 = this.i;
         var10001 = var1;
      }

      XE var3 = pA_3.x(var4, var10001.getPoint());
      rU_3 var5 = pA_3.e(this.i);
      if (var2 == 0) {
         if (var5 == null) {
            pA_3 var6 = this.i;
            if (var2 == 0) {
               if (pA_3.A(this.i) == null) {
                  pA_3.f(this.i, var3);
               }

               var6 = this.i;
            }

            pA_3.t(var6, new rU_3(new XE(pA_3.A(this.i))));
         }

         this.i.repaint();
         var5 = pA_3.e(this.i);
      }

      var5.m(var3);
      if (pA_3.S(this.i).V()) {
      }

      var10000 = var1.getPoint().y;
      if (var2 == 0) {
         if (var10000 < 0) {
            pA_3.Z(this.i, (int)((double)var1.getPoint().y * pA_3.z));
         }

         var10000 = var1.getPoint().y;
      }

      if (var10000 > this.i.J()) {
         pA_3.Z(this.i, (int)((double)(var1.getPoint().y - this.i.J()) * pA_3.z));
      }
   }

   static {
      long var0 = 1307081537624475081L;
      long var10002 = 1307081537624475131L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





