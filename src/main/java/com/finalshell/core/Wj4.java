package com.finalshell.core;

public class Wj4 {
   public final int R;
   public final int s;
   public int P;
   public final StringBuilder K;
   protected boolean o;
   public static String a;
   public static long b;

   protected Wj4(int var1, int var2) {
      this.s = var1;
      this.R = var2;
      int[] var10000 = XB.X();
      this.K = new StringBuilder();
      this.P = 0;
      int[] var3 = var10000;
      int var10001 = var2;
      if (var3 == null) {
         var10001 = var2 == 0 ? 1 : 0;
      }

      this.o = (boolean)var10001;
   }

   protected void p(String var1, int var2) {
      int var10000;
      label29: {
         int[] var3 = XB.X();
         var10000 = var2;
         int var10001 = this.s;
         if (var3 == null) {
            if (var2 < this.s) {
               return;
            }

            var10000 = var2;
            if (var3 != null) {
               break label29;
            }

            var10001 = this.s + this.R;
         }

         if (var10000 >= var10001) {
            return;
         }

         var10000 = (var1.equals(a + this.P)) ? 1 : 0;
      }

      if (var10000 == 0) {
         this.o = true;
      }

      this.K.append((char)((int)b));
      this.K.append(var1);
      this.P++;
   }

   protected String E() {
      int[] var1 = XB.X();
      StringBuilder var10000 = this.K;
      if (var1 == null) {
         if (this.K.length() == 0) {
            return "";
         }

         var10000 = this.K;
      }

      return var10000.substring(1);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0017\u00133".toCharArray();
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
               var21 = 47;
               break;
            case 1:
               var21 = 56;
               break;
            case 2:
               var21 = 13;
               break;
            case 3:
               var21 = 99;
               break;
            case 4:
               var21 = 59;
               break;
            case 5:
               var21 = 115;
               break;
            default:
               var21 = 97;
         }
      } else {
         var13 = 89;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 1398115008489105894L;
            long var12 = -3769806211489027638L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 89;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 47;
               break;
            case 1:
               var21 = 56;
               break;
            case 2:
               var21 = 13;
               break;
            case 3:
               var21 = 99;
               break;
            case 4:
               var21 = 59;
               break;
            case 5:
               var21 = 115;
               break;
            default:
               var21 = 97;
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
                  var21 = 56;
                  break;
               case 2:
                  var21 = 13;
                  break;
               case 3:
                  var21 = 99;
                  break;
               case 4:
                  var21 = 59;
                  break;
               case 5:
                  var21 = 115;
                  break;
               default:
                  var21 = 97;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 1398115008489105894L;
               long var11 = -3769806211489027638L ^ var0;
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
                  var21 = 47;
                  break;
               case 1:
                  var21 = 56;
                  break;
               case 2:
                  var21 = 13;
                  break;
               case 3:
                  var21 = 99;
                  break;
               case 4:
                  var21 = 59;
                  break;
               case 5:
                  var21 = 115;
                  break;
               default:
                  var21 = 97;
            }
         }
      }
   }
}





