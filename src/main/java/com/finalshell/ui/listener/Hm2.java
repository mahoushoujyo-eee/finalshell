package com.finalshell.ui.listener;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class Hm2 extends HG {
   final com.finalshell.ui.dialog.Ds2 l;

   Hm2(com.finalshell.ui.dialog.Ds2 var1) {
      this.l = var1;
   }

   @Override
   protected Rectangle V(MouseEvent var1) {
      int[] var2 = com.finalshell.ui.dialog.Ds2.U$arrint();
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
      Hm2 var10000;
      int[] var2 = com.finalshell.ui.dialog.Ds2.U$arrint();
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
               this.l.e(com.finalshell.ui.model.M.simple);
               this.l.r$void();
            }
         }

         var10000 = this;
      }

      var10000.mouseDragged(var1);
   }
}





