import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class tN_3 implements bG_3 {
   private static boolean H;

   @Override
   public double N(String var1, String var2) {
      return (this.Q(var1, var2) + this.Q(var2, var1)) / 2.0;
   }

   public List N(String var1, String var2, int var3) {
      ArrayList var5 = new ArrayList();
      boolean var10000 = z();
      char var6 = var1.charAt(var3);
      boolean var4 = var10000;
      int var7 = 0;

      while (var7 < var2.length()) {
         if (var4 && var6 == var2.charAt(var7)) {
            var5.add(var7);
         }

         var7++;
         if (!var4) {
            com.ky_4.K(new String[4]);
            break;
         }
      }

      return var5;
   }

   public int m(String var1, String var2, int var3) {
      int var10000 = Q();
      int var5 = var2.length();
      Iterator var6 = this.N(var1, var2, var3).iterator();
      boolean var4 = (boolean)var10000;

      while (true) {
         if (var6.hasNext()) {
            int var7 = (Integer)var6.next();
            int var8 = Math.abs(var7 - var3);
            var10000 = var5;
            if (var4) {
               break;
            }

            label30: {
               if (!var4) {
                  if (var5 <= var8) {
                     break label30;
                  }

                  var10000 = var8;
               }

               var5 = var10000;
            }

            if (!var4) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      if (com.ky_4.F() != null) {
         O(!var4);
      }

      return var10000;
   }

   public double H(String var1, String var2, int var3) {
      return (double)(var2.length() - this.m(var1, var2, var3)) * 1.0 / (double)var2.length();
   }

   public double Q(String var1, String var2) {
      boolean var10000 = z();
      double var4 = 0.0;
      boolean var3 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var1.length()) {
            var7 = var4 + this.H(var1, var2, var6);
            if (!var3) {
               break;
            }

            var4 = var7;
            var6++;
            if (var3) {
               continue;
            }
         }

         var7 = var4 / (double)var1.length();
         break;
      }

      return var7;
   }

   public static void O(boolean var0) {
      H = var0;
   }

   public static boolean Q() {
      return H;
   }

   public static boolean z() {
      boolean var0 = Q();
      return !var0;
   }

   static {
      if (Q()) {
         O(true);
      }
   }
}





