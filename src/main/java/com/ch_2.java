package com;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

public class Ch_2 {
   private static com.ky_4[] y;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public static void P(JComponent var0) {
      BufferedImage var2 = com.FN.J(var0);
      O();
      Rectangle var3 = com.FN.O(var0);
      com.Qm_2 var4 = com.oK_3.P(var0);
      var4.V(var2, var3.getLocation(), a(4282, 5790514379053303831L));
      var0.setVisible(false);
      com.WC.s(a, GO.q, new Hy_2(var3, var4, var2));
      if (com.ky_4.F() != null) {
         S(new com.ky_4[3]);
      }
   }

   public static void main(String[] var0) {
      com.ky_4[] var10000 = O();
      com.a9.x();
      com.KD var2 = new com.KD("1");
      var2.addActionListener(new com.r_2(var2));
      com.KD var3 = new com.KD("2");
      var3.addActionListener(new Nv_2(var3));
      com.ky_4[] var1 = var10000;
      com.KD var4 = new com.KD("3");
      var4.addActionListener(new Hz_2(var4));
      new xz_4(new xl_4(var2, var3, var4), a(19969, 5710059448493954733L));
      if (var1 == null) {
         com.ky_4.K(new String[4]);
      }
   }

   public static void S(com.ky_4[] var0) {
      y = var0;
   }

   public static com.ky_4[] O() {
      return y;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      if (O() == null) {
         S(new com.ky_4[1]);
      }

      char[] var10003 = "@(gs>@.H/ow:Q/+(`r8{(q".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 6;
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
         var10007 = 6;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 3;
               break;
            case 1:
               var37 = 72;
               break;
            case 2:
               var37 = 7;
               break;
            case 3:
               var37 = 16;
               break;
            case 4:
               var37 = 91;
               break;
            case 5:
               var37 = 50;
               break;
            default:
               var37 = 91;
         }
      } else {
         var25 = 6;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 2458824564853328118L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "\u0012·¯\u0017 Î\u001eið£\u0083|çUÀ\u0085";
            int var13 = "\u0012·¯\u0017 Î\u001eið£\u0083|çUÀ\u0085".length();
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
            c = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 6;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 3;
               break;
            case 1:
               var37 = 72;
               break;
            case 2:
               var37 = 7;
               break;
            case 3:
               var37 = 16;
               break;
            case 4:
               var37 = 91;
               break;
            case 5:
               var37 = 50;
               break;
            default:
               var37 = 91;
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
                  var37 = 3;
                  break;
               case 1:
                  var37 = 72;
                  break;
               case 2:
                  var37 = 7;
                  break;
               case 3:
                  var37 = 16;
                  break;
               case 4:
                  var37 = 91;
                  break;
               case 5:
                  var37 = 50;
                  break;
               default:
                  var37 = 91;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 2458824564853328118L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "\u0012·¯\u0017 Î\u001eið£\u0083|çUÀ\u0085";
               int var5 = "\u0012·¯\u0017 Î\u001eið£\u0083|çUÀ\u0085".length();
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
                  var37 = 3;
                  break;
               case 1:
                  var37 = 72;
                  break;
               case 2:
                  var37 = 7;
                  break;
               case 3:
                  var37 = 16;
                  break;
               case 4:
                  var37 = 91;
                  break;
               case 5:
                  var37 = 50;
                  break;
               default:
                  var37 = 91;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6316;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





