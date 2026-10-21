package com.finalshell.core;

public class Kk2_2 extends K4 {
   public static String a;

   public Kk2_2() {
      this.Z = a;
      this.i = true;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "hL\u0000x-(]pD\f\u007f1l\u0004-D\u0015v@5DeO\u0012hhtWoL".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 32;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 32;
         var10006 = var0;
      } else {
         var6 = 32;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 32;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 32;
               break;
            case 1:
               var23 = 1;
               break;
            case 2:
               var23 = 65;
               break;
            case 3:
               var23 = 59;
               break;
            case 4:
               var23 = 32;
               break;
            case 5:
               var23 = 122;
               break;
            default:
               var23 = 20;
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





