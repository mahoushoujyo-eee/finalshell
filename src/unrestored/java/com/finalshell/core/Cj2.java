package com.finalshell.core;

public class Cj2 extends SshEcdhKeyExchange {
   public static String j;
   public static long p;

   public Cj2() {
      this.Y = j;
      this.N = (int)p;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0000aA<$\u0003s".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 89;
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
         var10007 = 89;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 42;
               break;
            case 1:
               var21 = 80;
               break;
            case 2:
               var21 = 121;
               break;
            case 3:
               var21 = 72;
               break;
            case 4:
               var21 = 79;
               break;
            case 5:
               var21 = 111;
               break;
            default:
               var21 = 28;
         }
      } else {
         var13 = 89;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            j = var16;
            long var3 = 4215870886376137905L;
            long var12 = 88552360260691377L ^ var3;
            var8 = -1;
            p = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 89;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 42;
               break;
            case 1:
               var21 = 80;
               break;
            case 2:
               var21 = 121;
               break;
            case 3:
               var21 = 72;
               break;
            case 4:
               var21 = 79;
               break;
            case 5:
               var21 = 111;
               break;
            default:
               var21 = 28;
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
                  var21 = 42;
                  break;
               case 1:
                  var21 = 80;
                  break;
               case 2:
                  var21 = 121;
                  break;
               case 3:
                  var21 = 72;
                  break;
               case 4:
                  var21 = 79;
                  break;
               case 5:
                  var21 = 111;
                  break;
               default:
                  var21 = 28;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               j = var15;
               long var0 = 4215870886376137905L;
               long var11 = 88552360260691377L ^ var0;
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
                  var21 = 42;
                  break;
               case 1:
                  var21 = 80;
                  break;
               case 2:
                  var21 = 121;
                  break;
               case 3:
                  var21 = 72;
                  break;
               case 4:
                  var21 = 79;
                  break;
               case 5:
                  var21 = 111;
                  break;
               default:
                  var21 = 28;
            }
         }
      }
   }
}





