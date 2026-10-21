package com;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;

class Hm_2 extends HG {
   final com.Ds_2 l;

   Hm_2(com.Ds_2 var1) {
      this.l = var1;
   }

   @Override
   protected Rectangle V(MouseEvent var1) {
      int[] var2 = com.Ds_2.U();
      int var10000 = this.l.v;
      if (var2 == null) {
         if (!this.l.v) {
            return null;
         }

         var10000 = this.l.G();
      }

      int var3 = var10000;
      return new Rectangle(var3, var3, this.l.o.getWidth() - var3 * 2, this.l.o.getHeight() - var3 * 2);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      Hm_2 var10000;
      int[] var2 = com.Ds_2.U();
      var10000 = this;
      label17:
      if (var2 == null) {
         if (this.B) {
            var10000 = this;
            if (var2 != null) {
               break label17;
            }

            if (this.l.r) {
               this.l.r = false;
               this.l.G = null;
               this.l.e(com.C.M.simple);
               this.l.r();
            }
         }

         var10000 = this;
      }

      var10000.mouseDragged(var1);
   }
}





