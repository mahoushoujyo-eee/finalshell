package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.ArrayList;
import java.util.List;

public class Xg2_2 implements BG3 {
   public double M;
   public double V;
   public static String G;

   public Xg2_2() {
   super();
      r();
      this.M = 0.6;
      this.V = 0.4;
      if (Ky4.F$arrString() != null) {
         w("Un1KOc");
      }
   }

   @Override
   public double N(String var1, String var2) {
      String var3;
      boolean var10000;
      var3 = r();
      var10000 = this.L(var1);
      label65:
      if (var3 != null) {
         if (var10000) {
            var10000 = this.L(var2);
            if (var3 == null) {
               break label65;
            }

            if (var10000) {
               return 1.0;
            }
         }

         var10000 = this.L(var1);
      }

      if (var3 != null) {
         if (var10000) {
            return 0.0;
         }

         var10000 = this.L(var2);
      }

      if (!var10000) {
         ArrayList var4 = new ArrayList();
         String var14 = var1;
         if (var3 != null) {
            var14 = var1.length() >= var2.length() ? var1 : var2;
         }

         String var5 = var14;
         String var15 = var1;
         if (var3 != null) {
            var15 = var1.length() < var2.length() ? var1 : var2;
         }

         String var6 = var15;
         int var7 = 0;

         while (var7 < var5.length()) {
            Character var8 = var5.charAt(var7);
            if (var3 != null) {
               if (var6.contains(var8.toString())) {
                  var4.add(var8);
               }

               var7++;
            }

            if (var3 == null) {
               Ky4.K(new String[1]);
               break;
            }
         }

         double var13 = Math.min(1.0 * (double)var1.length() / (double)var2.length(), 1.0 * (double)var2.length() / (double)var1.length());
         double var9 = this.M * (1.0 * (double)var4.size() / (double)var1.length() + 1.0 * (double)var4.size() / (double)var2.length()) / 2.0;
         double var11 = this.V * var13 * (this.y(var1, var4) + this.y(var2, var4)) / 2.0;
         return var9 + var11;
      } else {
         return 0.0;
      }
   }

   public double y(String var1, List var2) {
      double var4 = 0.0;
      String var10000 = r();
      double var6 = 0.0;
      String var3 = var10000;
      int var8 = 0;

      while (var8 < var1.length()) {
         if (var2.contains(var1.charAt(var8))) {
            var4 += (double)(var8 + 1);
         }

         var6 += (double)(var8 + 1);
         var8++;
         if (var3 == null) {
            break;
         }
      }

      return 1.0 * var4 / var6;
   }

   public boolean L(String var1) {
      String var2 = r();
      String var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return true;
         }

         var10000 = var1.trim();
      }

      boolean var3 = var10000.equals("");
      return var2 == null ? var3 : var3;
   }

   public static void w(String var0) {
      G = var0;
   }

   public static String r() {
      return G;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (r() == null) {
         w("hNsx4");
      }
   }
}





