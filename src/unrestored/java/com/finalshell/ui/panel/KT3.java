package com.finalshell.ui.panel;

import java.awt.Component;
import java.awt.GridLayout;

public class KT3 extends Ky4 {
   public KT3(Component[] var1) {
      this(1, 0, var1);
   }

   public KT3(int var1, int var2, Component[] var3) {
      this(var1, var2, 0, var3);
   }

   public KT3(int var1, Component[] var2) {
      this(1, 0, var1, var2);
   }

   public KT3(int var1, int var2, int var3, Component[] var4) {
      this(var1, var2, var3, var3, var4);
   }

   public KT3(int var1, int var2, int var3, int var4, Component[] var5) {
      this.setOpaque(false);
      this.setLayout(new GridLayout(var1, var2, var3, var4));
      int[] var10000 = K32.L$arrint();
      Component[] var7 = var5;
      int var8 = var5.length;
      int[] var6 = var10000;
      int var9 = 0;

      while (var9 < var8) {
         Component var10 = var7[var9];
         this.add(var10);
         var9++;
         if (var6 == null) {
            break;
         }
      }
   }
}





