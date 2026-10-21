package com;

import java.awt.Component;
import javax.swing.event.AncestorEvent;

class Fa_2 extends com.FY {
   final Component o;
   final com.E T;
   final Rt_2 l;
   final com.Ds_2 x;

   Fa_2(com.Ds_2 var1, Component var2, com.E var3, Rt_2 var4) {
      this.x = var1;
      this.o = var2;
      this.T = var3;
      this.l = var4;
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      int[] var2 = com.Ds_2.U();
      com.Ds_2 var10000 = this.x;
      if (var2 == null) {
         if (!this.x.r) {
            return;
         }

         var10000 = this.x;
      }

      var10000.F(this.o, this.T);
      this.l.s();
   }
}





