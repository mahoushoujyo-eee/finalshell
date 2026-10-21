package org.l;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;

public class q extends x {
   public q(File var1, FilenameFilter var2, FilenameFilter var3) {
      super(new org.l.W(var1, var2, var3));
   }

   public static Iterator i(File[] var0, FilenameFilter var1, FilenameFilter var2) {
      boolean var10000 = F.G();
      ArrayList var4 = new ArrayList();
      File[] var5 = var0;
      int var6 = var0.length;
      int var7 = 0;
      boolean var3 = var10000;

      while (var7 < var6) {
         File var8 = var5[var7];
         var4.add(new q(var8, var1, var2));
         var7++;
         if (var3) {
            break;
         }
      }

      return new S(var4.iterator(), 2);
   }

   private static ArrayList t(Object var0) {
      ArrayList var1 = new ArrayList();
      var1.add(var0);
      return var1;
   }

   static ArrayList V(Object var0) {
      return t(var0);
   }
}





