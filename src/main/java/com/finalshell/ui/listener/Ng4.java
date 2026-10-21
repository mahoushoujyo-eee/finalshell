package com.finalshell.ui.listener;

import com.finalshell.core.E_2;
import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Ng4 extends ComponentAdapter {
   final Component y;
   final E_2 P;
   final Rt2 q;
   final com.finalshell.ui.dialog.Ds2 L;

   Ng4(com.finalshell.ui.dialog.Ds2 var1, Component var2, E_2 var3, Rt2 var4) {
      this.L = var1;
      this.y = var2;
      this.P = var3;
      this.q = var4;
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      int[] var2 = com.finalshell.ui.dialog.Ds2.U$arrint();
      com.finalshell.ui.dialog.Ds2 var10000 = this.L;
      if (var2 == null) {
         if (!this.L.r) {
            return;
         }

         var10000 = this.L;
      }

      var10000.F(this.y, this.P);
      this.q.s$void();
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      int[] var2 = com.finalshell.ui.dialog.Ds2.U$arrint();
      com.finalshell.ui.dialog.Ds2 var10000 = this.L;
      if (var2 == null) {
         if (!this.L.r) {
            return;
         }

         var10000 = this.L;
      }

      var10000.F(this.y, this.P);
      this.q.s$void();
   }
}





