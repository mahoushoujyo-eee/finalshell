package com;

public class yi_4 extends com.yd_4 {
   private static final String e;

   public yi_4() {
      this.N = e;
      this.v = true;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0012\bZA\u001fwT\u001bW\u0016\u0010\u00072\u0011\u001f\u0011Vb]tY\u0014\u0016HJ\u001cgS\u0017".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 56;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 56;
         var10006 = var0;
      } else {
         var6 = 56;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            e = var9;
            return;
         }

         var10005 = var10003;
         var10 = 56;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 66;
               break;
            case 1:
               var23 = 93;
               break;
            case 2:
               var23 = 3;
               break;
            case 3:
               var23 = 26;
               break;
            case 4:
               var23 = 10;
               break;
            case 5:
               var23 = 60;
               break;
            default:
               var23 = 4;
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
               e = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





