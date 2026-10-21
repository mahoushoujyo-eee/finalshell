package com;

public class GM extends Go_2 {
   final com.yj_4 e;
   private static final String b;
   private static final long c;

   public GM(com.yj_4 var1) {
      this.e = var1;
      this.T = (int)c;
   }

   @Override
   public String toString() {
      return b;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = ";<2;M5C\u000243!".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 119;
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
         var10007 = 119;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 28;
               break;
            case 1:
               var21 = 36;
               break;
            case 2:
               var21 = 44;
               break;
            case 3:
               var21 = 34;
               break;
            case 4:
               var21 = 78;
               break;
            case 5:
               var21 = 98;
               break;
            default:
               var21 = 120;
         }
      } else {
         var13 = 119;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            b = var16;
            long var3 = 2154672695739265886L;
            long var12 = 5796707089032524636L ^ var3;
            var8 = -1;
            c = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 119;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 28;
               break;
            case 1:
               var21 = 36;
               break;
            case 2:
               var21 = 44;
               break;
            case 3:
               var21 = 34;
               break;
            case 4:
               var21 = 78;
               break;
            case 5:
               var21 = 98;
               break;
            default:
               var21 = 120;
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
                  var21 = 28;
                  break;
               case 1:
                  var21 = 36;
                  break;
               case 2:
                  var21 = 44;
                  break;
               case 3:
                  var21 = 34;
                  break;
               case 4:
                  var21 = 78;
                  break;
               case 5:
                  var21 = 98;
                  break;
               default:
                  var21 = 120;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               b = var15;
               long var0 = 2154672695739265886L;
               long var11 = 5796707089032524636L ^ var0;
               var6 = -1;
               c = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 28;
                  break;
               case 1:
                  var21 = 36;
                  break;
               case 2:
                  var21 = 44;
                  break;
               case 3:
                  var21 = 34;
                  break;
               case 4:
                  var21 = 78;
                  break;
               case 5:
                  var21 = 98;
                  break;
               default:
                  var21 = 120;
            }
         }
      }
   }
}





