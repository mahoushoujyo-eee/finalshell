package com.finalshell.ui.listener;

import com.finalshell.core.E_2;
import java.awt.Component;
import javax.swing.event.AncestorEvent;

public class Fa2 extends FY {
   final Component o;
   final E_2 T;
   final Rt2 l;
   final com.finalshell.ui.dialog.Ds2 x;

   Fa2(com.finalshell.ui.dialog.Ds2 var1, Component var2, E_2 var3, Rt2 var4) {
      this.x = var1;
      this.o = var2;
      this.T = var3;
      this.l = var4;
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      int[] var2 = com.finalshell.ui.dialog.Ds2.U$arrint();
      com.finalshell.ui.dialog.Ds2 var10000 = this.x;
      if (var2 == null) {
         if (!this.x.r) {
            return;
         }

         var10000 = this.x;
      }

      var10000.F(this.o, this.T);
      this.l.s$void();
   }
}





