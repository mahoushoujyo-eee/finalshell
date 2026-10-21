package com;

import java.awt.Component;
import java.awt.Container;
import java.io.Serializable;
import java.util.Comparator;

public class Rv_2 implements Comparator, Serializable {
   public int O(Component var1, Component var2) {
      int[] var10000 = com.WC.V();
      Container var4 = var1.getParent();
      Container var5 = var2.getParent();
      int[] var3 = var10000;
      int var6 = var4.getComponentZOrder(var1);
      int var7 = var5.getComponentZOrder(var2);
      int var8 = var6;
      int var10001 = var7;
      if (var3 == null) {
         if (var6 < var7) {
            return -1;
         }

         var8 = var6;
         if (var3 != null) {
            return var6;
         }

         var10001 = var7;
      }

      return var8 == var10001 ? 0 : 1;
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.O((Component)var1, (Component)var2);
   }
}





