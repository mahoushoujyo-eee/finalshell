package com.finalshell.core;

import com.finalshell.ui.frame.Xz4;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.Xl4;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

public class Ch2 {
   public static Ky4[] y;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public static void P(JComponent var0) {
      BufferedImage var2 = FN.J(var0);
      O();
      Rectangle var3 = FN.O$Rectangle(var0);
      com.finalshell.ui.panel.Qm2 var4 = OK3.P(var0);
      var4.V(var2, var3.getLocation(), a(4282, 5790514379053303831L));
      var0.setVisible(false);
      WC_2.s(a, GO.q, new com.finalshell.ui.listener.Hy2(var3, var4, var2));
      if (Ky4.F$arrString() != null) {
         S(new Ky4[3]);
      }
   }

   public static void main(String[] var0) {
      Ky4[] var10000 = O();
      A9.x();
      KD var2 = new KD("1");
      var2.addActionListener(new com.finalshell.ui.listener.R22(var2));
      KD var3 = new KD("2");
      var3.addActionListener(new com.finalshell.ui.listener.Nv2(var3));
      Ky4[] var1 = var10000;
      KD var4 = new KD("3");
      var4.addActionListener(new com.finalshell.ui.listener.Hz2(var4));
      new Xz4(new Xl4(var2, var3, var4), a(19969, 5710059448493954733L));
      if (var1 == null) {
         Ky4.K(new String[4]);
      }
   }

   public static void S(Ky4[] var0) {
      y = var0;
   }

   public static Ky4[] O() {
      return y;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6316;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (O() == null) {
         S(new Ky4[1]);
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
}





