package com.finalshell.core;

public class C6 extends SshEcdhKeyExchange {
   public static String j;
   public static long p;

   public C6() {
      this.Y = j;
      this.N = (int)p;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001d?]!q\u0014w".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 15;
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
         var10007 = 15;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 97;
               break;
            case 1:
               var21 = 88;
               break;
            case 2:
               var21 = 51;
               break;
            case 3:
               var21 = 3;
               break;
            case 4:
               var21 = 75;
               break;
            case 5:
               var21 = 42;
               break;
            default:
               var21 = 74;
         }
      } else {
         var13 = 15;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            j = var16;
            long var3 = 5061801109463021812L;
            long var12 = -8002506166695838979L ^ var3;
            var8 = -1;
            p = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 15;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 97;
               break;
            case 1:
               var21 = 88;
               break;
            case 2:
               var21 = 51;
               break;
            case 3:
               var21 = 3;
               break;
            case 4:
               var21 = 75;
               break;
            case 5:
               var21 = 42;
               break;
            default:
               var21 = 74;
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
                  var21 = 97;
                  break;
               case 1:
                  var21 = 88;
                  break;
               case 2:
                  var21 = 51;
                  break;
               case 3:
                  var21 = 3;
                  break;
               case 4:
                  var21 = 75;
                  break;
               case 5:
                  var21 = 42;
                  break;
               default:
                  var21 = 74;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               j = var15;
               long var0 = 5061801109463021812L;
               long var11 = -8002506166695838979L ^ var0;
               var6 = -1;
               p = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 97;
                  break;
               case 1:
                  var21 = 88;
                  break;
               case 2:
                  var21 = 51;
                  break;
               case 3:
                  var21 = 3;
                  break;
               case 4:
                  var21 = 75;
                  break;
               case 5:
                  var21 = 42;
                  break;
               default:
                  var21 = 74;
            }
         }
      }
   }
}





