package com.finalshell.core;

public class HA3 extends HN3 {
   public int W;
   public int U;
   public static long a;

   public HA3() {
      this(-1, (int)a);
   }

   public HA3(int var1, int var2) {
      this.O = true;
      this.W = var1;
      this.U = var2;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      String[] var4 = W5.q();
      int var10000 = var3;
      if (var4 != null) {
         if (var3 == this.W) {
            return this.U;
         }

         var10000 = var3;
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7900845767648081856L;
      long var10002 = 8774841551991863232L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





