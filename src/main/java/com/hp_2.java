package com;

import java.awt.Font;
import java.util.Map;

public class Hp_2 {
   private static final Map o = new com.lZ_3();

   public static void c() {
      String var0 = com.FV.D();
      Map var10000 = o;
      if (var0 == null) {
         if (o == null) {
            return;
         }

         var10000 = o;
      }

      var10000.clear();
   }

   public static Font v(Font var0, int var1, int var2) {
      String var10000 = com.FV.D();
      pU_3 var4 = D(var0, var1, var2);
      String var3 = var10000;
      Font var5 = (Font)o.get(var4);
      Font var6 = var5;
      if (var3 == null) {
         if (var5 == null) {
            var5 = var0.deriveFont(var1, (float)var2);
            o.put(var4, var5);
         }

         var6 = var5;
      }

      return var6;
   }

   protected static pU_3 D(Font var0, int var1, int var2) {
      return new pU_3(var0, var1, (float)var2);
   }
}





