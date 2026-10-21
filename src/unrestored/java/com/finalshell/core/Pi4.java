package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.awt.Insets;
import java.util.StringTokenizer;

public class Pi4 extends AbstractSingleValueConverter {
   @Override
   public boolean canConvert(java.lang.Class var1) {
      return var1.equals(Insets.class);
   }

   @Override
   public Object fromString(String var1) {
      try {
         StringTokenizer var2 = new StringTokenizer(var1, ",", false);
         int var9 = Integer.parseInt(var2.nextToken().trim());
         int var4 = Integer.parseInt(var2.nextToken().trim());
         int var5 = Integer.parseInt(var2.nextToken().trim());
         int var6 = Integer.parseInt(var2.nextToken().trim());
         return new Insets(var9, var4, var5, var6);
      } catch (Throwable var8) {
         try {
            int var3 = Integer.parseInt(var1);
            return new Insets(var3, var3, var3, var3);
         } catch (Throwable var7) {
            return new Insets(0, 0, 0, 0);
         }
      }
   }

   @Override
   public String toString(Object var1) {
      int[] var10000 = com.finalshell.ui.model.F2.T();
      Insets var3 = (Insets)var1;
      int[] var2 = var10000;
      String var4 = var3.top + "," + var3.left + "," + var3.bottom + "," + var3.right;
      if (var2 == null) {
         Ky4.K(new String[1]);
      }

      return var4;
   }
}





