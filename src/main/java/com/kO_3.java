package com;

import java.awt.Component;

public class kO_3 extends com.ky_4 {
   public kO_3(Component[] var1) {
      this(true, var1);
   }

   public kO_3(int var1, Component[] var2) {
      this(var1, true, var2);
   }

   public kO_3(boolean var1, Component[] var2) {
      this(0, var1, var2);
   }

   public kO_3(int var1, boolean var2, Component[] var3) {
      int[] var10000 = com.k3_2.L();
      super(new com.TO(0, var1, var1, var2, false));
      int[] var4 = var10000;

      for (Component var8 : var3) {
         this.add(var8);
         if (var4 == null) {
            break;
         }
      }
   }
}





