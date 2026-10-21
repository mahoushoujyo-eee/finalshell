package com.finalshell.ui.model;

import com.finalshell.core.F3_3;
import com.finalshell.core.W3_5;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;

public class Q_3 extends X {
   public Q_3(File var1, FilenameFilter var2, FilenameFilter var3) {
      super(new W3_5(var1, var2, var3));
   }

   public static Iterator i(File[] var0, FilenameFilter var1, FilenameFilter var2) {
      boolean var10000 = F3_3.G();
      ArrayList var4 = new ArrayList();
      File[] var5 = var0;
      int var6 = var0.length;
      int var7 = 0;
      boolean var3 = var10000;

      while (var7 < var6) {
         File var8 = var5[var7];
         var4.add(new Q_3(var8, var1, var2));
         var7++;
         if (var3) {
            break;
         }
      }

      return new S_2(var4.iterator(), 2);
   }

   public static ArrayList t(Object var0) {
      ArrayList var1 = new ArrayList();
      var1.add(var0);
      return var1;
   }

   static ArrayList V(Object var0) {
      return t(var0);
   }
}





