package com.finalshell.core;

import com.finalshell.util.LZ3;
import java.awt.Font;
import java.util.Map;

public class Hp2 {
   public static Map o;

   public static void c() {
      String var0 = FV_2.D();
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
      String var10000 = FV_2.D();
      PU3 var4 = D(var0, var1, var2);
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

   protected static PU3 D(Font var0, int var1, int var2) {
      return new PU3(var0, var1, (float)var2);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      o = new LZ3();
   }
}





