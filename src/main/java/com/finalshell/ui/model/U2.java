package com.finalshell.ui.model;

import java.io.File;
import java.util.Comparator;

public class U2 implements Comparator {
   final com.finalshell.ui.panel.T k;

   U2(com.finalshell.ui.panel.T var1) {
      this.k = var1;
   }

   public int v(File var1, File var2) {
      long var4 = var1.lastModified();
      String var10000 = com.finalshell.ui.panel.T.v$String();
      long var6 = var2.lastModified();
      String var3 = var10000;
      long var9;
      int var8 = (var9 = var4 - var6) == 0L ? 0 : (var9 < 0L ? -1 : 1);
      if (var3 == null) {
         if (var8 < 0) {
            return -1;
         }

         long var10;
         var8 = (var10 = var4 - var6) == 0L ? 0 : (var10 < 0L ? -1 : 1);
      }

      if (var3 == null) {
         var8 = var8 > 0 ? 1 : 0;
      }

      return var8;
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.v((File)var1, (File)var2);
   }
}





