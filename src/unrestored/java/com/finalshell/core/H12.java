package com.finalshell.core;

import java.awt.image.BufferedImage;

public class H12 extends W5 {
   public float h = 0.0F;
   public float o = 0.0F;
   public boolean u;
   public BufferedImage A;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void l(float var1) {
      this.h = var1;
   }

   public float T() {
      return this.h;
   }

   public void u(float var1) {
      this.o = var1;
   }

   public float I() {
      return this.o;
   }

   public void n(BufferedImage var1) {
      this.A = var1;
   }

   public BufferedImage P() {
      return this.A;
   }

   public void W(boolean var1) {
      this.u = var1;
   }

   public boolean h() {
      return this.u;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = W5.q();
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      String[] var3 = var10000;
      BufferedImage var20 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var20 = this.A;
      }

      if (var3 != null) {
         if (var20 == null) {
            return var2;
         }

         var20 = this.A;
      }

      int var6 = var20.getWidth();
      int var7 = this.A.getHeight();
      float var8 = this.h * (1.0F + this.o);
      float var9 = 255.0F * (var8 - this.o);
      float var10 = 255.0F * var8;
      int[] var11 = new int[var4];
      int[] var12 = new int[var6];
      int var13 = 0;

      label53:
      while (true) {
         int var21 = var13;

         label51:
         while (var21 < var5) {
            this.l(var1, 0, var13, var4, 1, var11);
            this.l(this.A, 0, var13 % var7, var6, 1, var12);
            int var14 = 0;

            while (var14 < var4) {
               int var15 = var12[var14 % var6];
               int var16 = var11[var14];
               int var17 = Iw4.g(var15);
               float var18 = NM.k(var9, var10, (float)var17);
               int var19 = (int)(255.0F * var18);
               if (var3 != null) {
                  var21 = (this.u) ? 1 : 0;
                  if (var3 == null) {
                     continue label51;
                  }

                  if (this.u) {
                     var19 = a(2403, 6318691238013243380L) - var19;
                  }

                  var11[var14] = var19 << a(22932, 2413232373991595776L) | var16 & a(18328, 4787953961670263054L);
                  var14++;
               }

               if (var3 == null) {
                  break;
               }
            }

            this.E(var2, 0, var13, var4, 1, var11);
            var13++;
            if (var3 == null) {
               return var2;
            }
            continue label53;
         }

         return var2;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1686;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "3:1gABd\u000e'>z\u001dlb\u0006,9l\\_00! l\u001c\u0005>".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 95;
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
         var10007 = 95;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 56;
               break;
            case 1:
               var37 = 23;
               break;
            case 2:
               var37 = 15;
               break;
            case 3:
               var37 = 86;
               break;
            case 4:
               var37 = 109;
               break;
            case 5:
               var37 = 116;
               break;
            default:
               var37 = 79;
         }
      } else {
         var25 = 95;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 8345881065097258281L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "Î\u0093:G\u0090\u007fÛØ\u0097î(gÁàê\"ØWµ\bÒú:1";
            int var13 = "Î\u0093:G\u0090\u007fÛØ\u0097î(gÁàê\"ØWµ\bÒú:1".length();
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
         var10007 = 95;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 56;
               break;
            case 1:
               var37 = 23;
               break;
            case 2:
               var37 = 15;
               break;
            case 3:
               var37 = 86;
               break;
            case 4:
               var37 = 109;
               break;
            case 5:
               var37 = 116;
               break;
            default:
               var37 = 79;
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
                  var37 = 56;
                  break;
               case 1:
                  var37 = 23;
                  break;
               case 2:
                  var37 = 15;
                  break;
               case 3:
                  var37 = 86;
                  break;
               case 4:
                  var37 = 109;
                  break;
               case 5:
                  var37 = 116;
                  break;
               default:
                  var37 = 79;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 8345881065097258281L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "Î\u0093:G\u0090\u007fÛØ\u0097î(gÁàê\"ØWµ\bÒú:1";
               int var5 = "Î\u0093:G\u0090\u007fÛØ\u0097î(gÁàê\"ØWµ\bÒú:1".length();
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
                  var37 = 56;
                  break;
               case 1:
                  var37 = 23;
                  break;
               case 2:
                  var37 = 15;
                  break;
               case 3:
                  var37 = 86;
                  break;
               case 4:
                  var37 = 109;
                  break;
               case 5:
                  var37 = 116;
                  break;
               default:
                  var37 = 79;
            }
         }
      }
   }
}





