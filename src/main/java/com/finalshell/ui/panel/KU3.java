package com.finalshell.ui.panel;

import java.awt.Component;
import java.awt.FlowLayout;

public class KU3 extends Ky4 {
   public KU3(Component[] var1) {
      this(0, var1);
   }

   public KU3(int var1, Component[] var2) {
      this(3, var1, var2);
   }

   public KU3(int var1, int var2, Component[] var3) {
      int[] var10000 = K32.L$arrint();
      super(new FlowLayout(var1, var2, 0));
      int[] var4 = var10000;
      Component[] var9 = var3;
      if (var4 != null) {
         if (var3 == null) {
            return;
         }

         var9 = var3;
      }

      Component[] var5 = var9;
      int var6 = var5.length;
      int var7 = 0;

      while (var7 < var6) {
         Component var8 = var5[var7];
         this.add(var8);
         var7++;
         if (var4 == null) {
            break;
         }
      }
   }
}





