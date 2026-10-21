package com.finalshell.core;

public class CZ_2 extends CG {
   public static String i;

   CZ_2() {
      this.U = i;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "%!s{\u0003c\n".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 50;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 50;
         var10006 = var0;
      } else {
         var6 = 50;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            i = var9;
            return;
         }

         var10005 = var10003;
         var10 = 50;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 100;
               break;
            case 1:
               var23 = 123;
               break;
            case 2:
               var23 = 32;
               break;
            case 3:
               var23 = 100;
               break;
            case 4:
               var23 = 3;
               break;
            case 5:
               var23 = 100;
               break;
            default:
               var23 = 14;
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
               i = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





