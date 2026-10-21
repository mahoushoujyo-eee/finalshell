package com;

class Ct_2 extends com.CG {
   private static final String i;

   Ct_2() {
      this.U = i;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u000eF}$X\u0002,".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 16;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 16;
         var10006 = var0;
      } else {
         var6 = 16;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            i = var9;
            return;
         }

         var10005 = var10003;
         var10 = 16;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 109;
               break;
            case 1:
               var23 = 62;
               break;
            case 2:
               var23 = 12;
               break;
            case 3:
               var23 = 25;
               break;
            case 4:
               var23 = 122;
               break;
            case 5:
               var23 = 32;
               break;
            default:
               var23 = 8;
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





