package com.finalshell.core;

import com.finalshell.ui.model.KD3;
import com.finalshell.ui.panel.Ky4;

public class Ut2 extends Ub2 {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   @Override
   public Ky2 R() {
      Ky4[] var10000 = com.finalshell.ui.model.Yu4.c$arrky_4();
      Kk2 var2 = Kk2.v(a(20808, 6414432192428781762L));
      int var3 = 0;
      Ky4[] var1 = var10000;

      while (true) {
         if (var3 < a(18055, 8009640008883808012L)) {
            var2.c(KD3.CAN.m$byte());
            var3++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         var3 = 0;
         break;
      }

      while (true) {
         if (var3 < a(30019, 2621284142345000139L)) {
            var2.c(KD3.BS.m$byte());
            var3++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         var2.a();
         break;
      }

      return var2;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24970;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "m\u0019uT_v\u0007\u000e;Zy\u001a0\u001d\u0016X0\u0017xI\u001d\u0004X#".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 75;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 75;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 101;
               break;
            case 1:
               var37 = 51;
               break;
            case 2:
               var37 = 80;
               break;
            case 3:
               var37 = 124;
               break;
            case 4:
               var37 = 113;
               break;
            case 5:
               var37 = 81;
               break;
            default:
               var37 = 118;
         }
      } else {
         var25 = 75;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 2849888110560918954L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "¥\u0099ø*\u0016\u001b\u008dx\tµZÞ«Ñ\u001a®²¼\"O\u0010A)i";
            int var13 = "¥\u0099ø*\u0016\u001b\u008dx\tµZÞ«Ñ\u001a®²¼\"O\u0010A)i".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            b = var14;
            c = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 75;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 101;
               break;
            case 1:
               var37 = 51;
               break;
            case 2:
               var37 = 80;
               break;
            case 3:
               var37 = 124;
               break;
            case 4:
               var37 = 113;
               break;
            case 5:
               var37 = 81;
               break;
            default:
               var37 = 118;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 101;
                  break;
               case 1:
                  var37 = 51;
                  break;
               case 2:
                  var37 = 80;
                  break;
               case 3:
                  var37 = 124;
                  break;
               case 4:
                  var37 = 113;
                  break;
               case 5:
                  var37 = 81;
                  break;
               default:
                  var37 = 118;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 2849888110560918954L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "¥\u0099ø*\u0016\u001b\u008dx\tµZÞ«Ñ\u001a®²¼\"O\u0010A)i";
               int var5 = "¥\u0099ø*\u0016\u001b\u008dx\tµZÞ«Ñ\u001a®²¼\"O\u0010A)i".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var0;
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               b = var6;
               c = new Integer[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 101;
                  break;
               case 1:
                  var37 = 51;
                  break;
               case 2:
                  var37 = 80;
                  break;
               case 3:
                  var37 = 124;
                  break;
               case 4:
                  var37 = 113;
                  break;
               case 5:
                  var37 = 81;
                  break;
               default:
                  var37 = 118;
            }
         }
      }
   }
}





