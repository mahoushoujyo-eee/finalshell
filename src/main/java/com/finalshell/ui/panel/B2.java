package com.finalshell.ui.panel;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class B2 extends SZ {
   final T Q;
   public static long a;

   B2(T var1, Component var2) {
      super(var2);
      this.Q = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var2 = super.getPreferredSize();
      String var10000 = T.v$String();
      JScrollBar var3 = this.getVerticalScrollBar();
      String var1 = var10000;
      if (var1 == null) {
         if (var3 != null && var3.isShowing()) {
            var2.width = var2.width + var3.getPreferredSize().width;
         }

         var2.height = Math.min(var2.height, (int)a);
      }

      return var2;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4507661520906158512L;
      long var10002 = 9022147962659078612L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





