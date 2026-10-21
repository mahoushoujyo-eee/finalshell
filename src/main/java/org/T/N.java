package org.T;

import java.io.File;
import java.util.ArrayList;

public final class N {
   private static boolean G;

   private N() {
   }

   public static File[] H(String var0) {
      int var10000 = m();
      int var2 = 0;
      boolean var1 = (boolean)var10000;
      ArrayList var3 = new ArrayList();

      do {
         int var4;
         int var10001;
         label33: {
            var4 = var0.indexOf(File.pathSeparatorChar, var2);
            if (var4 == -1) {
               var10000 = var2;
               if (!var1) {
                  var10001 = var0.length();
                  if (var1) {
                     break label33;
                  }

                  if (var2 == var10001) {
                     break;
                  }

                  var3.add(new File(var0.substring(var2)));
               }

               if (!var1) {
                  break;
               }
            }

            var10000 = var4;
            var10001 = var2;
         }

         if (!var1) {
            if (var10000 != var10001) {
               var3.add(new File(var0.substring(var2, var4)));
            }

            var10000 = var4;
            var10001 = 1;
         }

         var2 = var10000 + var10001;
      } while (!var1);

      return var3.toArray(new File[var3.size()]);
   }

   @org.F.c
   public static File[] U(@org.F.c String var0) {
      boolean var1 = m();
      String var10000 = var0;
      if (!var1) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      return H(var10000);
   }

   public static void U(boolean var0) {
      G = var0;
   }

   public static boolean R() {
      return G;
   }

   public static boolean m() {
      boolean var0 = R();
      return !var0;
   }

   static {
      if (m()) {
         U(true);
      }
   }
}





