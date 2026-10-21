package com.finalshell.core;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class G72 extends W5 {
   public int E;
   public int c;
   public static String a;
   public static long[] b;
   public static Integer[] d;

   public G72() {
      this(a(20983, 3007134835169026756L), a(32655, 7105656701496052925L));
   }

   public G72(int var1, int var2) {
      this.E = var1;
      this.c = var2;
   }

   public void P(int var1) {
      this.E = var1;
   }

   public int Q() {
      return this.E;
   }

   public void Y(int var1) {
      this.c = var1;
   }

   public int r() {
      return this.c;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = W5.q();
      int var4 = var1.getWidth();
      String[] var3 = var10000;
      int var5 = var1.getHeight();
      BufferedImage var10 = var2;
      if (var3 != null) {
         if (var2 == null) {
            ColorModel var6 = var1.getColorModel();
            var2 = new BufferedImage(var6, var6.createCompatibleWritableRaster(this.E, this.c), var6.isAlphaPremultiplied(), null);
         }

         var10 = var2;
      }

      Graphics2D var9 = var10.createGraphics();
      int var7 = 0;

      while (true) {
         if (var7 < this.c) {
            if (var3 == null) {
               break;
            }

            int var8 = 0;

            label35: {
               while (var8 < this.E) {
                  var9.drawImage(var1, null, var8, var7);
                  var8 += var4;
                  if (var3 == null) {
                     break label35;
                  }

                  if (var3 == null) {
                     break;
                  }
               }

               var7 += var5;
            }

            if (var3 != null) {
               continue;
            }
         }

         var9.dispose();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13107;
      if (d[var3] == null) {
         d[var3] = (int)(b[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "+\u001aft".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 124;
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
         var10007 = 124;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 3;
               break;
            case 1:
               var37 = 15;
               break;
            case 2:
               var37 = 118;
               break;
            case 3:
               var37 = 109;
               break;
            case 4:
               var37 = 43;
               break;
            case 5:
               var37 = 59;
               break;
            default:
               var37 = 118;
         }
      } else {
         var25 = 124;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 5242703475794634724L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "%Ê\u0018Lø\u0082\u0005\u0000b\u0081ü¦¥ú+y";
            int var13 = "%Ê\u0018Lø\u0082\u0005\u0000b\u0081ü¦¥ú+y".length();
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
            d = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 124;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 3;
               break;
            case 1:
               var37 = 15;
               break;
            case 2:
               var37 = 118;
               break;
            case 3:
               var37 = 109;
               break;
            case 4:
               var37 = 43;
               break;
            case 5:
               var37 = 59;
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
                  var37 = 3;
                  break;
               case 1:
                  var37 = 15;
                  break;
               case 2:
                  var37 = 118;
                  break;
               case 3:
                  var37 = 109;
                  break;
               case 4:
                  var37 = 43;
                  break;
               case 5:
                  var37 = 59;
                  break;
               default:
                  var37 = 118;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 5242703475794634724L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "%Ê\u0018Lø\u0082\u0005\u0000b\u0081ü¦¥ú+y";
               int var5 = "%Ê\u0018Lø\u0082\u0005\u0000b\u0081ü¦¥ú+y".length();
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
               d = new Integer[2];
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
                  var37 = 15;
                  break;
               case 2:
                  var37 = 118;
                  break;
               case 3:
                  var37 = 109;
                  break;
               case 4:
                  var37 = 43;
                  break;
               case 5:
                  var37 = 59;
                  break;
               default:
                  var37 = 118;
            }
         }
      }
   }
}





