package com.finalshell.core;

public class Z2_3 implements A_4 {
   public static boolean m;
   public final String C;
   public final boolean B;
   public final X_6 M;
   public static long a;

   public Z2_3(X_6 var1, String var2, boolean var3) {
      this.M = var1;
      this.C = var2;
      this.B = var3;
   }

   @Override
   public boolean k(@C_9 Object var1) {
      int[] var2;
      N_6 var6;
      label42: {
         int[] var10000 = F_6.h();
         N_6 var3 = (N_6)var1;
         var2 = var10000;
         if (!m) {
            var6 = var3;
            if (var2 != null) {
               break label42;
            }

            if (var3 == null) {
               throw new AssertionError();
            }
         }

         var6 = var3;
      }

      String var4 = var6.o$String();
      int var5 = this.C.length();
      byte var7 = (byte)((var4.startsWith(this.C)) ? 1 : 0);
      if (var2 == null) {
         if (var7 == 0) {
            return 0 != 0;
         }

         var7 = (byte)((this.B) ? 1 : 0);
      }

      if (var2 != null) {
         return var7 != 0;
      } else if (var7 != 0) {
         return 1 != 0;
      } else {
         int var8 = var4.indexOf((int)a, var5);
         if (var2 != null) {
            return var8 != 0;
         } else {
            return (boolean)((var8 == -1 ? 1 : 0) != 0);
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3631307813545587705L;
      long var10002 = -732812909801098282L ^ var0;
      byte var10001 = -1;
      a = var10002;
      m = !X_6.class.desiredAssertionStatus();
   }
}





