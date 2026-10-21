package com.finalshell.task;

import com.finalshell.core.PK;

public class RD implements Runnable {
   final String A;
   public static String a;

   RD(String var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      try {
         PK.Z(a + this.A);
      } catch (Throwable var2) {
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0002k\u0013kx!N\u001eh\u000eo6k\u0013D|\bvmg\u000f\u001ez\tomz\u0016\u000fz\u0013$6k\u0019\u001e\"".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 43;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 43;
         var10006 = var0;
      } else {
         var6 = 43;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 43;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 65;
               break;
            case 1:
               var23 = 52;
               break;
            case 2:
               var23 = 76;
               break;
            case 3:
               var23 = 48;
               break;
            case 4:
               var23 = 105;
               break;
            case 5:
               var23 = 37;
               break;
            default:
               var23 = 74;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





