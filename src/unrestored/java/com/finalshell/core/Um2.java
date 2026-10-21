package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;

public class Um2 extends Ub2 {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   @Override
   public Ky2 R() {
      Kk2 var2 = Kk2.v(a(13831, 1723285674271872408L));
      Ky4[] var10000 = com.finalshell.ui.model.Yu4.c$arrky_4();
      int var3 = 0;
      Ky4[] var1 = var10000;

      while (true) {
         if (var3 < 2) {
            var2.c((byte)a(26784, 7352716196608068414L));
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9118;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "]\u001b\fj3*\u000f;=-".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 73;
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
         var10007 = 73;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 82;
               break;
            case 1:
               var37 = 59;
               break;
            case 2:
               var37 = 43;
               break;
            case 3:
               var37 = 74;
               break;
            case 4:
               var37 = 9;
               break;
            case 5:
               var37 = 11;
               break;
            default:
               var37 = 124;
         }
      } else {
         var25 = 73;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 4429740894336673907L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "\u009f\u0004ú3\fà£\u0002ËÄØ®\u0018\u008býû";
            int var13 = "\u009f\u0004ú3\fà£\u0002ËÄØ®\u0018\u008býû".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
            c = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 73;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 82;
               break;
            case 1:
               var37 = 59;
               break;
            case 2:
               var37 = 43;
               break;
            case 3:
               var37 = 74;
               break;
            case 4:
               var37 = 9;
               break;
            case 5:
               var37 = 11;
               break;
            default:
               var37 = 124;
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
                  var37 = 82;
                  break;
               case 1:
                  var37 = 59;
                  break;
               case 2:
                  var37 = 43;
                  break;
               case 3:
                  var37 = 74;
                  break;
               case 4:
                  var37 = 9;
                  break;
               case 5:
                  var37 = 11;
                  break;
               default:
                  var37 = 124;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 4429740894336673907L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "\u009f\u0004ú3\fà£\u0002ËÄØ®\u0018\u008býû";
               int var5 = "\u009f\u0004ú3\fà£\u0002ËÄØ®\u0018\u008býû".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
               c = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 82;
                  break;
               case 1:
                  var37 = 59;
                  break;
               case 2:
                  var37 = 43;
                  break;
               case 3:
                  var37 = 74;
                  break;
               case 4:
                  var37 = 9;
                  break;
               case 5:
                  var37 = 11;
                  break;
               default:
                  var37 = 124;
            }
         }
      }
   }
}





