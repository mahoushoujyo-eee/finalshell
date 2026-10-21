package com.finalshell.core;

import java.io.File;

public class H7 extends F_6 {
   final File K;
   final W3_6 G;
   public static long b;

   H7(W3_6 var1, File var2) {
      this.G = var1;
      this.K = var2;
   }

   @Override
   protected File r(String var1) {
      return new File(this.K.getParentFile(), var1.substring(var1.lastIndexOf((int)b) + 1));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 482416634935006502L;
      long var10002 = 174998505273316617L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





