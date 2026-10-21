package com.finalshell.ui.panel;

import com.finalshell.core.TO;
import java.awt.Component;

public class KO3 extends Ky4 {
   public KO3(Component[] var1) {
      this(true, var1);
   }

   public KO3(int var1, Component[] var2) {
      this(var1, true, var2);
   }

   public KO3(boolean var1, Component[] var2) {
      this(0, var1, var2);
   }

   public KO3(int var1, boolean var2, Component[] var3) {
   super(new TO(0, var1, var1, var2, false));
      int[] var10000 = K32.L$arrint();
      int[] var4 = var10000;

      for (Component var8 : var3) {
         this.add(var8);
         if (var4 == null) {
            break;
         }
      }
   }
}





