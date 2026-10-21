package com.finalshell.ui.listener;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class O2 extends ComponentAdapter {
   public final com.finalshell.ui.panel.V V;
   public final com.finalshell.core.D p;
   public static long a;

   public O2(com.finalshell.core.D var1, com.finalshell.ui.panel.V var2) {
      this.p = var1;
      this.V = var2;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      int[] var2 = com.finalshell.ui.dialog.Y2.M$arrint();
      com.finalshell.ui.panel.V var10000 = this.V;
      int var10001 = this.V.k().width;
      if (var2 != null) {
         var10001 = var10001 > this.V.getWidth() ? (int)a : 0;
      }

      var10000.setHorizontalAlignment(var10001);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4724208833045813334L;
      long var10002 = -8276562424967636900L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





