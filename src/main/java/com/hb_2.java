package com;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class Hb_2 extends MouseMotionAdapter {
   final pA_3 a;
   private static final long b;

   Hb_2(pA_3 var1) {
      this.a = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      super.mouseMoved(var1);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int var2 = _y_2.y();
      long var8;
      int var10000 = (var8 = System.currentTimeMillis() - this.a.M - b) == 0L ? 0 : (var8 < 0L ? -1 : 1);
      if (var2 == 0) {
         if (var10000 < 0) {
            return;
         }

         var10000 = this.a.A;
      }

      MouseEvent var10001;
      label63: {
         if (var2 == 0) {
            if (var10000 == 0) {
               return;
            }

            var4 = this.a;
            var10001 = var1;
            if (var2 != 0) {
               break label63;
            }

            var10000 = this.a.m(var1);
         }

         if (var10000 == 0) {
            return;
         }

         var4 = this.a;
         var10001 = var1;
      }

      XE var3 = pA_3.x(var4, var10001.getPoint());
      rU_3 var5 = pA_3.e(this.a);
      if (var2 == 0) {
         if (var5 == null) {
            pA_3 var6 = this.a;
            if (var2 == 0) {
               if (pA_3.A(this.a) == null) {
                  pA_3.f(this.a, var3);
               }

               var6 = this.a;
            }

            pA_3.t(var6, new rU_3(new XE(pA_3.A(this.a))));
         }

         this.a.repaint();
         var5 = pA_3.e(this.a);
      }

      var5.m(var3);
      if (pA_3.S(this.a).V()) {
      }

      var10000 = var1.getPoint().y;
      if (var2 == 0) {
         if (var10000 < 0) {
            pA_3.Z(this.a, (int)((double)var1.getPoint().y * pA_3.z));
         }

         var10000 = var1.getPoint().y;
      }

      if (var10000 > this.a.J()) {
         pA_3.Z(this.a, (int)((double)(var1.getPoint().y - this.a.J()) * pA_3.z));
      }
   }

   static {
      long var0 = 3575949113380697443L;
      long var10002 = 3575949113380697425L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





