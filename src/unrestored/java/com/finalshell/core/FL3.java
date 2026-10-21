package com.finalshell.core;

public class FL3 implements J1 {
   @Override
   public int Z() {
      return 1;
   }

   @Override
   public long C(byte[] var1) {
      byte var10000 = (byte)((DF.M()) ? 1 : 0);
      byte var3 = 0;
      boolean var2 = ((boolean)var10000) != 0;
      int var4 = 0;

      while (true) {
         if (var4 < var1.length) {
            var10000 = (byte)(var3 + var1[var4]);
            if (!var2) {
               break;
            }

            var3 = var10000;
            var4++;
            if (var2) {
               continue;
            }
         }

         var10000 = var3;
         break;
      }

      return (long)var10000;
   }
}





