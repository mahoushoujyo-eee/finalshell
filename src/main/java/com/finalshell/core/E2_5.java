package com.finalshell.core;

import java.io.File;

public class E2_5 extends F_6 {
   public final File I;
   public static long b;

   public E2_5(File var1) {
      this.I = var1;
   }

   @Override
   protected final File r(String var1) {
      return new File(this.I, var1.replace((char)((int)b), File.separatorChar));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5009753000943441928L;
      long var10002 = 8068242574414862375L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





