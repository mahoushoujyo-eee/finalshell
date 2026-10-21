package com.finalshell.core;

import java.awt.Component;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class O42 {
   public static Map C;

   public static Shape k(Component var0, String var1, E_2 var2, Object[] var3) {
      IO3 var7;
      String var5 = z(var3);
      String var10000 = FV_2.D();
      Map var6 = (Map)C.get(var0);
      String var4 = var10000;
      var10000 = (String)(var6);
      if (var4 == null) {
         if (var6 == null) {
            Shape var10 = (Shape)var2.J();
            HashMap var9 = new HashMap(1);
            var9.put(var1, new IO3(var5, var10));
            C.put(var0, var9);
            return var10;
         }

         var10000 = (String)var6.get(var1);
      }

      var7 = (IO3)var10000;
      var10000 = (String)(var7);
      if (var4 == null) {
         label28:
         if (var7 != null) {
            IO3 var13 = var7;
            if (var4 == null) {
               if (!IO3.l(var7).equals(var5)) {
                  break label28;
               }

               var13 = var7;
            }

            return IO3.N(var13);
         }

         var10000 = (String)var2.J();
      }

      Shape var8 = (Shape)var10000;
      var6.put(var1, new IO3(var5, var8));
      return var8;
   }

   public static String z(Object[] var0) {
      StringBuilder var7;
      String var10000 = FV_2.D();
      StringBuilder var2 = new StringBuilder();
      Object[] var3 = var0;
      int var4 = var0.length;
      String var1 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            Object var6 = var3[var5];
            var7 = var2;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               if (var2.length() > 0) {
                  var2.append(";");
               }

               var2.append(D(var6));
            }

            var5++;
            if (var1 == null) {
               continue;
            }
         }

         var7 = var2;
         break;
      }

      return var7.toString();
   }

   public static String D(Object var0) {
      String var1 = FV_2.D();
      boolean var10000 = var0 instanceof Insets;
      if (var1 == null) {
         if (var10000) {
            Insets var4 = (Insets)var0;
            return var4.top + "," + var4.left + "," + var4.bottom + "," + var4.right;
         }

         var10000 = var0 instanceof Rectangle;
      }

      if (var1 == null) {
         if (var10000) {
            Rectangle var3 = (Rectangle)var0;
            return var3.x + "," + var3.y + "," + var3.width + "," + var3.height;
         }

         if (var1 != null) {
            return var0.toString();
         }

         var10000 = var0 instanceof Point;
      }

      if (var10000) {
         Point var2 = (Point)var0;
         return var2.x + "," + var2.y;
      } else {
         return var0.toString();
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      C = new WeakHashMap();
   }
}





