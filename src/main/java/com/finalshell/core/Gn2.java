package com.finalshell.core;

public class Gn2 extends Go2 {
   final Yj4 E;
   public static String b;
   public static long c;

   public Gn2(Yj4 var1) {
      this.E = var1;
      this.T = (int)c;
   }

   @Override
   public String toString() {
      return b;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "ir@v\u0016\u001e>Rv".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 21;
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
         var10007 = 21;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 47;
               break;
            case 1:
               var21 = 23;
               break;
            case 2:
               var21 = 58;
               break;
            case 3:
               var21 = 23;
               break;
            case 4:
               var21 = 111;
               break;
            case 5:
               var21 = 98;
               break;
            default:
               var21 = 76;
         }
      } else {
         var13 = 21;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            b = var16;
            long var3 = 8362244159653820855L;
            long var12 = -4688888884145145420L ^ var3;
            var8 = -1;
            c = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 21;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 47;
               break;
            case 1:
               var21 = 23;
               break;
            case 2:
               var21 = 58;
               break;
            case 3:
               var21 = 23;
               break;
            case 4:
               var21 = 111;
               break;
            case 5:
               var21 = 98;
               break;
            default:
               var21 = 76;
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
                  var21 = 47;
                  break;
               case 1:
                  var21 = 23;
                  break;
               case 2:
                  var21 = 58;
                  break;
               case 3:
                  var21 = 23;
                  break;
               case 4:
                  var21 = 111;
                  break;
               case 5:
                  var21 = 98;
                  break;
               default:
                  var21 = 76;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               b = var15;
               long var0 = 8362244159653820855L;
               long var11 = -4688888884145145420L ^ var0;
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
                  var21 = 47;
                  break;
               case 1:
                  var21 = 23;
                  break;
               case 2:
                  var21 = 58;
                  break;
               case 3:
                  var21 = 23;
                  break;
               case 4:
                  var21 = 111;
                  break;
               case 5:
                  var21 = 98;
                  break;
               default:
                  var21 = 76;
            }
         }
      }
   }
}





