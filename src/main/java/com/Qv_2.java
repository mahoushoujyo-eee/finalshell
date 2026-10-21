package com;

import java.awt.Component;

public class Qv_2 extends com.ky_4 {
   public Qv_2(Component[] var1) {
      this(0, var1);
   }

   public Qv_2(int var1, Component[] var2) {
      this(var1, var1, var2);
   }

   public Qv_2(int var1, int var2, Component[] var3) {
      int[] var10000 = com.k3_2.L();
      super(new com.Ts_2(false, var1, var2));
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





