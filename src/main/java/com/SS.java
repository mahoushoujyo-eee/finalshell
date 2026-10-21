package com;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JScrollBar;

class SS extends SZ {
   final II r;
   private static final long a;

   SS(II var1, Component var2, boolean var3) {
      super(var2, var3);
      this.r = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      int var2;
      int var6;
      label22: {
         label24: {
            var2 = Math.min(II.d(this.r).size(), II.a(this.r));
            String var10000 = com.Wb_2.m();
            JScrollBar var3 = this.getHorizontalScrollBar();
            String var1 = var10000;
            JScrollBar var5 = var3;
            if (var1 != null) {
               if (var3 == null) {
                  break label24;
               }

               var5 = var3;
            }

            var6 = var5.isShowing();
            if (var1 == null) {
               break label22;
            }

            if (var6 != 0) {
               var6 = var3.getPreferredSize().height;
               break label22;
            }
         }

         var6 = 0;
      }

      int var4 = var6;
      return new Dimension((int)a * (var2 + 1) + var2 * II.i(this.r), this.r.getPreferredSize().height + var4);
   }

   static {
      long var0 = 8121665905467150390L;
      long var10002 = 1234527069980151842L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





