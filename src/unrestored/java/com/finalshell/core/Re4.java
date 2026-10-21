package com.finalshell.core;

public class Re4 implements X42 {
   public static long a;

   @Override
   public boolean v(int var1) {
      String var2 = UZ.h();
      int var10000 = var1;
      if (var2 == null) {
         var10000 = var1 == (int)a ? 1 : 0;
      }

      return var10000 != 0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 865877117101573664L;
      long var10002 = -7956413195550554592L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





