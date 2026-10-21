package com.finalshell.core;

public class Gq4 extends Gj4 {
   public static String a;

   @Override
   public float q(float var1) {
      String[] var2 = W5.q();
      float var10000 = var1;
      float var10001 = 0.5F;
      if (var2 != null) {
         if (var1 > 0.5F) {
            return 2.0F * (var1 - 0.5F);
         }

         var10000 = 2.0F;
         var10001 = 0.5F - var1;
      }

      return var10000 * var10001;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "JOe%A\b0ZOe+A\u0012el".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 30;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 30;
         var10006 = var0;
      } else {
         var6 = 30;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 30;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 23;
               break;
            case 1:
               var23 = 62;
               break;
            case 2:
               var23 = 23;
               break;
            case 3:
               var23 = 84;
               break;
            case 4:
               var23 = 45;
               break;
            case 5:
               var23 = 101;
               break;
            default:
               var23 = 1;
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





