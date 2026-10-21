package com.finalshell.ui.model;

import com.finalshell.core.XP;

public final class PB3 extends PG3 {
   public static long c;

   public PB3(String var1, int var2, int[] var3) {
      super(var1, var2, var3, null);
   }

   @Override
   public int Q(int var1) {
      int[] var2 = XP.j();
      int var10000 = var1;
      if (var2 == null) {
         if (var1 == 3) {
            return (int)c;
         }

         var10000 = -1;
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4538810696659260940L;
      long var10002 = 3753590426118805167L ^ var0;
      byte var10001 = -1;
      c = var10002;
   }
}





