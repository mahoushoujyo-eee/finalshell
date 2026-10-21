package com;

import java.security.SecureRandom;

public class pz_4 implements i8_2 {
   private byte[] R;
   private SecureRandom b;
   private static final long a;

   public pz_4() {
      this.R = new byte[(int)a];
      this.b = null;
      this.b = new SecureRandom();
   }

   @Override
   public void Y(byte[] var1, int var2, int var3) {
      boolean var4 = com.y1_2.Q();
      if (var4) {
         if (var3 > this.R.length) {
            this.R = new byte[var3];
         }

         this.b.nextBytes(this.R);
         System.arraycopy(this.R, 0, var1, var2, var3);
      }
   }

   static {
      long var0 = 3625005918259997645L;
      long var10002 = -455083231913219107L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





