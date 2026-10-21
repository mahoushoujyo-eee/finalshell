package com;

public class hT_3 extends hN_3 {
   private static final String a;
   private static final long b;

   public hT_3() {
      this.O = true;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      return var3 ^ (int)b;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "*KUgYiv\u0005Q@}L".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 87;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 87;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 60;
               break;
            case 1:
               var21 = 112;
               break;
            case 2:
               var21 = 114;
               break;
            case 3:
               var21 = 88;
               break;
            case 4:
               var21 = 111;
               break;
            case 5:
               var21 = 17;
               break;
            default:
               var21 = 104;
         }
      } else {
         var13 = 87;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 5537034501856238935L;
            long var12 = 3112304706223414615L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 87;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 60;
               break;
            case 1:
               var21 = 112;
               break;
            case 2:
               var21 = 114;
               break;
            case 3:
               var21 = 88;
               break;
            case 4:
               var21 = 111;
               break;
            case 5:
               var21 = 17;
               break;
            default:
               var21 = 104;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 60;
                  break;
               case 1:
                  var21 = 112;
                  break;
               case 2:
                  var21 = 114;
                  break;
               case 3:
                  var21 = 88;
                  break;
               case 4:
                  var21 = 111;
                  break;
               case 5:
                  var21 = 17;
                  break;
               default:
                  var21 = 104;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 5537034501856238935L;
               long var11 = 3112304706223414615L ^ var0;
               var6 = -1;
               b = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 60;
                  break;
               case 1:
                  var21 = 112;
                  break;
               case 2:
                  var21 = 114;
                  break;
               case 3:
                  var21 = 88;
                  break;
               case 4:
                  var21 = 111;
                  break;
               case 5:
                  var21 = 17;
                  break;
               default:
                  var21 = 104;
            }
         }
      }
   }
}





