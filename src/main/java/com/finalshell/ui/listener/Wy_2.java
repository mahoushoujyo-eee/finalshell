package com.finalshell.ui.listener;

import com.finalshell.core.E_2;
import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Wy_2 extends ComponentAdapter {
   public final Component B;
   public final E_2 G;
   public final Rt2 t;
   public final com.finalshell.ui.dialog.Ds2 m;

   public Wy_2(com.finalshell.ui.dialog.Ds2 var1, Component var2, E_2 var3, Rt2 var4) {
      this.m = var1;
      this.B = var2;
      this.G = var3;
      this.t = var4;
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      int[] var2 = com.finalshell.ui.dialog.Ds2.U$arrint();
      com.finalshell.ui.dialog.Ds2 var10000 = this.m;
      if (var2 == null) {
         if (!this.m.r) {
            return;
         }

         var10000 = this.m;
      }

      var10000.F(this.B, this.G);
      this.t.s$void();
   }
}





