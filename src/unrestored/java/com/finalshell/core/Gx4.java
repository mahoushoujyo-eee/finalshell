package com.finalshell.core;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Gx4 extends W5 {
   public int I;
   public int L;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Gx4() {
      this(a(19878, 202536531292673529L), a(22510, 7587775295191338930L));
   }

   public Gx4(int var1, int var2) {
      this.I = var1;
      this.L = var2;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3 = W5.q();
      Object var10000 = var2;
      if (var3 != null) {
         if (var2 == null) {
            ColorModel var4 = var1.getColorModel();
            var2 = new BufferedImage(var4, var4.createCompatibleWritableRaster(this.I, this.L), var4.isAlphaPremultiplied(), null);
         }

         var10000 = var1.getScaledInstance(this.I, this.L, a(4659, 537349642251962989L));
      }

      Object var6 = var10000;
      Graphics2D var5 = var2.createGraphics();
      var5.drawImage((Image)var6, 0, 0, this.I, this.L, null);
      var5.dispose();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6238;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "NlE\u0015\u0006\\\"%VU\u0000\u0005K".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 127;
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
         var10007 = 127;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 117;
               break;
            case 1:
               var37 = 122;
               break;
            case 2:
               var37 = 73;
               break;
            case 3:
               var37 = 30;
               break;
            case 4:
               var37 = 22;
               break;
            case 5:
               var37 = 81;
               break;
            default:
               var37 = 41;
         }
      } else {
         var25 = 127;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 1626609472003773652L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "Ï:\u0096;E\u008e\u009e©wEH¾¦¯A\r½\u0018ú\\¶O[F";
            int var13 = "Ï:\u0096;E\u008e\u009e©wEH¾¦¯A\r½\u0018ú\\¶O[F".length();
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
            c = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 127;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 117;
               break;
            case 1:
               var37 = 122;
               break;
            case 2:
               var37 = 73;
               break;
            case 3:
               var37 = 30;
               break;
            case 4:
               var37 = 22;
               break;
            case 5:
               var37 = 81;
               break;
            default:
               var37 = 41;
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
                  var37 = 117;
                  break;
               case 1:
                  var37 = 122;
                  break;
               case 2:
                  var37 = 73;
                  break;
               case 3:
                  var37 = 30;
                  break;
               case 4:
                  var37 = 22;
                  break;
               case 5:
                  var37 = 81;
                  break;
               default:
                  var37 = 41;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 1626609472003773652L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "Ï:\u0096;E\u008e\u009e©wEH¾¦¯A\r½\u0018ú\\¶O[F";
               int var5 = "Ï:\u0096;E\u008e\u009e©wEH¾¦¯A\r½\u0018ú\\¶O[F".length();
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
                  var37 = 117;
                  break;
               case 1:
                  var37 = 122;
                  break;
               case 2:
                  var37 = 73;
                  break;
               case 3:
                  var37 = 30;
                  break;
               case 4:
                  var37 = 22;
                  break;
               case 5:
                  var37 = 81;
                  break;
               default:
                  var37 = 41;
            }
         }
      }
   }
}





