package com;

import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Wy_2 extends ComponentAdapter {
   final Component B;
   final com.E G;
   final Rt_2 t;
   final com.Ds_2 m;

   Wy_2(com.Ds_2 var1, Component var2, com.E var3, Rt_2 var4) {
      this.m = var1;
      this.B = var2;
      this.G = var3;
      this.t = var4;
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      int[] var2 = com.Ds_2.U();
      com.Ds_2 var10000 = this.m;
      if (var2 == null) {
         if (!this.m.r) {
            return;
         }

         var10000 = this.m;
      }

      var10000.F(this.B, this.G);
      this.t.s();
   }
}





