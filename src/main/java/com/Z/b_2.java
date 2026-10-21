package com.Z;

import com.SZ;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JScrollBar;

class b_2 extends SZ {
   final com.Z.T Q;
   private static final long a;

   b_2(com.Z.T var1, Component var2) {
      super(var2);
      this.Q = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var2 = super.getPreferredSize();
      String var10000 = com.Z.T.v();
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
      long var0 = 4507661520906158512L;
      long var10002 = 9022147962659078612L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





