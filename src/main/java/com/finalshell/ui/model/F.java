package com.finalshell.ui.model;

import com.finalshell.core.Cz2;
import java.io.File;
import java.util.Comparator;

public class F implements Comparator {
   public final com.finalshell.ui.panel.T c;

   public F(com.finalshell.ui.panel.T var1) {
      this.c = var1;
   }

   public int C(File var1, File var2) {
      String var3;
      byte var5;
      byte var10;
      byte var4 = (Cz2.z(var1)) ? 1 : 0;
      String var10000 = com.finalshell.ui.panel.T.v$String();
      var5 = (Cz2.z(var2)) ? 1 : 0;
      var3 = var10000;
      var10 = var4;
      label50:
      if (var3 == null) {
         if (var4 != 0) {
            var10 = var5;
            if (var3 != null) {
               break label50;
            }

            if (var5 != 0) {
               return 0;
            }
         }

         var10 = var4;
      }

      if (var3 == null) {
         if (var10 != 0) {
            return -1;
         }

         var10 = var5;
      }

      if (var3 == null) {
         if (var10 == 0) {
            long var6 = var1.length();
            long var8 = var2.length();
            long var12;
            var10 = (var12 = var6 - var8) == 0L ? 0 : (var12 < 0L ? -1 : 1);
            if (var3 == null) {
               if (var10 < 0) {
                  return -1;
               }

               long var13;
               var10 = (var13 = var6 - var8) == 0L ? 0 : (var13 < 0L ? -1 : 1);
            }

            if (var3 == null) {
               var10 = var10 > 0 ? 1 : 0;
            }

            return var10;
         }

         var10 = 1;
      }

      return var10;
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.C((File)var1, (File)var2);
   }
}





