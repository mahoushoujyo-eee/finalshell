package com;

import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class ng_4 extends ComponentAdapter {
   final Component y;
   final com.E P;
   final Rt_2 q;
   final com.Ds_2 L;

   ng_4(com.Ds_2 var1, Component var2, com.E var3, Rt_2 var4) {
      this.L = var1;
      this.y = var2;
      this.P = var3;
      this.q = var4;
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      int[] var2 = com.Ds_2.U();
      com.Ds_2 var10000 = this.L;
      if (var2 == null) {
         if (!this.L.r) {
            return;
         }

         var10000 = this.L;
      }

      var10000.F(this.y, this.P);
      this.q.s();
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      int[] var2 = com.Ds_2.U();
      com.Ds_2 var10000 = this.L;
      if (var2 == null) {
         if (!this.L.r) {
            return;
         }

         var10000 = this.L;
      }

      var10000.F(this.y, this.P);
      this.q.s();
   }
}





