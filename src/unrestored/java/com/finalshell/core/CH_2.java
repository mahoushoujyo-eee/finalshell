package com.finalshell.core;

public class CH_2 extends Cx2_2 {
   public static String j;

   @Override
   public String i() {
      return j;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "aN\u0010\\Jj1".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 112;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 112;
         var10006 = var0;
      } else {
         var6 = 112;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            j = var9;
            return;
         }

         var10005 = var10003;
         var10 = 112;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 98;
               break;
            case 1:
               var23 = 86;
               break;
            case 2:
               var23 = 1;
               break;
            case 3:
               var23 = 1;
               break;
            case 4:
               var23 = 9;
               break;
            case 5:
               var23 = 34;
               break;
            default:
               var23 = 117;
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
               j = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





