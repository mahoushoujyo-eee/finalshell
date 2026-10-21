package com.finalshell.core;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

public class CP implements FileFilter {
   final List s;
   final boolean u;

   CP(List var1, boolean var2) {
      this.s = var1;
      this.u = var2;
   }

   @Override
   public boolean accept(File var1) {
      String var2 = FV_2.D();
      boolean var10000 = var1.isFile();
      if (var2 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.s.contains(Cz2.G(var1.getName(), this.u));
      }

      return var2 != null ? var10000 : var10000;
   }
}





