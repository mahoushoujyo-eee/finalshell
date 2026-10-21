package com.finalshell.ui.panel;

import com.finalshell.core.Ts2_2;
import java.awt.Component;

public class Qv2 extends Ky4 {
   public Qv2(Component[] var1) {
      this(0, var1);
   }

   public Qv2(int var1, Component[] var2) {
      this(var1, var1, var2);
   }

   public Qv2(int var1, int var2, Component[] var3) {
   super(new Ts2_2(false, var1, var2));
      int[] var10000 = K32.L$arrint();
      int[] var4 = var10000;
      this.setOpaque(false);

      for (Component var8 : var3) {
         this.add(var8);
         if (var4 == null) {
            break;
         }
      }
   }
}





