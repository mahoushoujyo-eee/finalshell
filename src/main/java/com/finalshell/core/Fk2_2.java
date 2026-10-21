package com.finalshell.core;

public class Fk2_2 {
   public static String a;

   Fk2_2() {
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
      char[] var10003 = "n.MoHX|y>U}PLwr4MwRVec".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 77;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 77;
         var10006 = var0;
      } else {
         var6 = 77;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 77;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 96;
               break;
            case 1:
               var23 = 44;
               break;
            case 2:
               var23 = 78;
               break;
            case 3:
               var23 = 113;
               break;
            case 4:
               var23 = 81;
               break;
            case 5:
               var23 = 84;
               break;
            default:
               var23 = 127;
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





