package com.finalshell.core;

import java.awt.image.BufferedImage;

public class Gf4 extends Gy4 {
   public float V = 1.0F;
   public BufferedImage j = null;
   public int[] O;
   public int[] w;
   public int M;
   public int G;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void r(BufferedImage var1) {
      this.j = var1;
   }

   public BufferedImage T() {
      return this.j;
   }

   public void d(float var1) {
      this.V = var1;
   }

   public float A() {
      return this.V;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = W5.q();
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      String[] var3 = var10000;
      BufferedImage var25 = this.j;
      if (var3 != null) {
         var25 = this.j != null ? this.j : var1;
      }

      BufferedImage var6 = var25;
      this.M = var6.getWidth();
      this.G = var6.getHeight();
      int[] var7 = new int[this.M * this.G];
      this.l(var6, 0, 0, this.M, this.G, var7);
      this.O = new int[this.M * this.G];
      this.w = new int[this.M * this.G];
      int var8 = 0;
      int var9 = 0;

      while (true) {
         if (var9 < this.G) {
            var26 = 0;
            if (var3 == null) {
               break;
            }

            int var10 = 0;

            label60: {
               while (var10 < this.M) {
                  int var11 = var7[var8];
                  int var12 = var11 >> b(6558, 7362546283204356881L) & b(10545, 2862813268562156476L);
                  int var13 = var11 >> b(24882, 89588235312419774L) & b(8099, 209103218654948653L);
                  int var14 = var11 & b(8099, 209103218654948653L);
                  var7[var8] = (var12 + var13 + var14) / b(24956, 8283180312587654135L);
                  var8++;
                  var10++;
                  if (var3 == null) {
                     break label60;
                  }

                  if (var3 == null) {
                     break;
                  }
               }

               var9++;
            }

            if (var3 != null) {
               continue;
            }
         }

         var8 = 0;
         var26 = 0;
         break;
      }

      var9 = var26;

      while (var9 < this.G) {
         int var20 = (var9 + this.G - 1) % this.G * this.M;
         int var21 = var9 * this.M;
         int var22 = (var9 + 1) % this.G * this.M;
         int var23 = 0;

         while (true) {
            if (var23 < this.M) {
               int var24 = (var23 + this.M - 1) % this.M;
               int var16 = (var23 + 1) % this.M;
               this.O[var8] = var7[var24 + var20] + var7[var24 + var21] + var7[var24 + var22] - var7[var16 + var20] - var7[var16 + var21] - var7[var16 + var22];
               this.w[var8] = var7[var24 + var22] + var7[var23 + var22] + var7[var16 + var22] - var7[var24 + var20] - var7[var23 + var20] - var7[var16 + var20];
               var8++;
               var23++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            }

            var9++;
            break;
         }

         if (var3 == null) {
            break;
         }
      }

      var7 = null;
      var2 = super.filter(var1, var2);
      this.O = this.w = null;
      return var2;
   }

   @Override
   public void h(int var1, int var2, float[] var3) {
      float var6 = (float)var1;
      float var7 = (float)var2;
      int var8 = var2 % this.G * this.M + var1 % this.M;
      var3[0] = (float)var1 + this.V * (float)this.O[var8];
      var3[1] = (float)var2 + this.V * (float)this.w[var8];
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12943;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "by`X\u007fU\u0007\tTz_`K\u0012Eu=\u0002>".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 30;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 30;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 56;
               break;
            case 1:
               var50 = 14;
               break;
            case 2:
               var50 = 13;
               break;
            case 3:
               var50 = 50;
               break;
            case 4:
               var50 = 14;
               break;
            case 5:
               var50 = 57;
               break;
            default:
               var50 = 109;
         }
      } else {
         var34 = 30;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 2469273914123126608L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12 = "ËÈùòÄ¶,Q\u001e\u0005kP5#*\u0082ºj3²2\u009e\u009c\u0013";
            int var13 = "ËÈùòÄ¶,Q\u001e\u0005kP5#*\u0082ºj3²2\u009e\u009c\u0013".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0089à!Ðµ«TæQã´ýf9T¯";
                        var13 = "\u0089à!Ðµ«TæQã´ýf9T¯".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 30;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 56;
               break;
            case 1:
               var50 = 14;
               break;
            case 2:
               var50 = 13;
               break;
            case 3:
               var50 = 50;
               break;
            case 4:
               var50 = 14;
               break;
            case 5:
               var50 = 57;
               break;
            default:
               var50 = 109;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 56;
                  break;
               case 1:
                  var50 = 14;
                  break;
               case 2:
                  var50 = 13;
                  break;
               case 3:
                  var50 = 50;
                  break;
               case 4:
                  var50 = 14;
                  break;
               case 5:
                  var50 = 57;
                  break;
               default:
                  var50 = 109;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 2469273914123126608L;
               long[] var6 = new long[5];
               int var3 = 0;
               String var4 = "ËÈùòÄ¶,Q\u001e\u0005kP5#*\u0082ºj3²2\u009e\u009c\u0013";
               int var5 = "ËÈùòÄ¶,Q\u001e\u0005kP5#*\u0082ºj3²2\u009e\u009c\u0013".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0089à!Ðµ«TæQã´ýf9T¯";
                           var5 = "\u0089à!Ðµ«TæQã´ýf9T¯".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 56;
                  break;
               case 1:
                  var50 = 14;
                  break;
               case 2:
                  var50 = 13;
                  break;
               case 3:
                  var50 = 50;
                  break;
               case 4:
                  var50 = 14;
                  break;
               case 5:
                  var50 = 57;
                  break;
               default:
                  var50 = 109;
            }
         }
      }
   }
}





