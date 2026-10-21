package com.finalshell.core;

public class Hs4 extends HN3 {
   public int F;
   public static String a;
   public static long b;

   public Hs4() {
      this((int)b);
   }

   public Hs4(int var1) {
      this.O = true;
      this.p(var1);
   }

   public void p(int var1) {
      this.F = var1;
   }

   public int e() {
      return this.F;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      return var3 & this.F;
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
      char[] var10003 = "/|Q'".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 47;
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
         var10007 = 47;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 77;
               break;
            case 1:
               var21 = 50;
               break;
            case 2:
               var21 = 13;
               break;
            case 3:
               var21 = 99;
               break;
            case 4:
               var21 = 25;
               break;
            case 5:
               var21 = 60;
               break;
            default:
               var21 = 30;
         }
      } else {
         var13 = 47;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 4638885898578708914L;
            long var12 = 2257778878013158989L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 47;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 77;
               break;
            case 1:
               var21 = 50;
               break;
            case 2:
               var21 = 13;
               break;
            case 3:
               var21 = 99;
               break;
            case 4:
               var21 = 25;
               break;
            case 5:
               var21 = 60;
               break;
            default:
               var21 = 30;
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
                  var21 = 77;
                  break;
               case 1:
                  var21 = 50;
                  break;
               case 2:
                  var21 = 13;
                  break;
               case 3:
                  var21 = 99;
                  break;
               case 4:
                  var21 = 25;
                  break;
               case 5:
                  var21 = 60;
                  break;
               default:
                  var21 = 30;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 4638885898578708914L;
               long var11 = 2257778878013158989L ^ var0;
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
                  var21 = 77;
                  break;
               case 1:
                  var21 = 50;
                  break;
               case 2:
                  var21 = 13;
                  break;
               case 3:
                  var21 = 99;
                  break;
               case 4:
                  var21 = 25;
                  break;
               case 5:
                  var21 = 60;
                  break;
               default:
                  var21 = 30;
            }
         }
      }
   }
}





