package com.finalshell.core;

public class Cp2 extends CL {
   public static String j;
   public static long p;

   public Cp2() {
      this.Y = j;
      this.N = (int)p;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "!u<\u0003\u0011@\u001e".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 83;
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
         var10007 = 83;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 1;
               break;
            case 1:
               var21 = 78;
               break;
            case 2:
               var21 = 14;
               break;
            case 3:
               var21 = 125;
               break;
            case 4:
               var21 = 113;
               break;
            case 5:
               var21 = 43;
               break;
            default:
               var21 = 121;
         }
      } else {
         var13 = 83;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            j = var16;
            long var3 = 310656207216853613L;
            long var12 = 5085094788645929965L ^ var3;
            var8 = -1;
            p = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 83;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 1;
               break;
            case 1:
               var21 = 78;
               break;
            case 2:
               var21 = 14;
               break;
            case 3:
               var21 = 125;
               break;
            case 4:
               var21 = 113;
               break;
            case 5:
               var21 = 43;
               break;
            default:
               var21 = 121;
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
                  var21 = 1;
                  break;
               case 1:
                  var21 = 78;
                  break;
               case 2:
                  var21 = 14;
                  break;
               case 3:
                  var21 = 125;
                  break;
               case 4:
                  var21 = 113;
                  break;
               case 5:
                  var21 = 43;
                  break;
               default:
                  var21 = 121;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               j = var15;
               long var0 = 310656207216853613L;
               long var11 = 5085094788645929965L ^ var0;
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
                  var21 = 1;
                  break;
               case 1:
                  var21 = 78;
                  break;
               case 2:
                  var21 = 14;
                  break;
               case 3:
                  var21 = 125;
                  break;
               case 4:
                  var21 = 113;
                  break;
               case 5:
                  var21 = 43;
                  break;
               default:
                  var21 = 121;
            }
         }
      }
   }
}





