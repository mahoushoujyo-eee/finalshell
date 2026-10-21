package com;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class hj_4 extends com.W5 {
   private float H = 2.0F;
   private float o = (float)Math.toRadians(108.0);
   private float i = (float)Math.toRadians(162.0);
   private float T = (float)Math.toRadians(90.0);
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public void h(float var1) {
      this.H = var1;
   }

   public float u() {
      return this.H;
   }

   public float r() {
      return this.o;
   }

   public void m(float var1) {
      this.o = var1;
   }

   public float H() {
      return this.i;
   }

   public void N(float var1) {
      this.i = var1;
   }

   public float T() {
      return this.T;
   }

   public void W(float var1) {
      this.T = var1;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label84: {
         String[] var10000 = com.W5.q();
         var4 = var1.getWidth();
         var3 = var10000;
         var5 = var1.getHeight();
         int var6 = var1.getType();
         WritableRaster var7 = var1.getRaster();
         BufferedImage var51 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label84;
            }

            var51 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var51;
      }

      float var8 = 2.0F * this.H * 1.414F;
      float[] var9 = new float[]{this.o, this.i, this.T};
      float[] var10 = new float[]{0.0F, -1.0F, 1.0F, 0.0F, 0.0F};
      float[] var11 = new float[]{0.0F, 0.0F, 0.0F, -1.0F, 1.0F};
      float var12 = var8 / 2.0F;
      int[] var13 = new int[var4];
      int[] var14 = this.l(var1, 0, 0, var4, var5, null);
      int var15 = 0;

      label77:
      while (true) {
         int var52 = var15;

         label75:
         while (var52 < var5) {
            int var16 = 0;
            int var17 = var15 * var4;

            while (true) {
               if (var16 < var4) {
                  var13[var16] = var14[var17] & a(18595, 6958353787693511217L) | a(560, 4685628046255126691L);
                  var16++;
                  var17++;
                  if (var3 == null) {
                     break;
                  }

                  if (var3 != null) {
                     continue;
                  }
               }

               var16 = 0;
               break;
            }

            label64:
            while (true) {
               var52 = var16;

               label62:
               while (true) {
                  if (var52 >= 3) {
                     break label64;
                  }

                  var17 = a(16538, 4219483431474903562L) - a(32526, 6439501515653350811L) * var16;
                  int var18 = a(9162, 8937331381710936414L) << var17;
                  float var19 = var9[var16];
                  float var20 = (float)Math.sin((double)var19);
                  float var21 = (float)Math.cos((double)var19);
                  var52 = 0;
                  if (var3 == null) {
                     continue label75;
                  }

                  int var22 = 0;

                  while (var22 < var4) {
                     float var23 = (float)var22 * var21 + (float)var15 * var20;
                     float var24 = (float)(-var22) * var20 + (float)var15 * var21;
                     var23 = var23 - NM.i(var23 - var12, var8) + var12;
                     var24 = var24 - NM.i(var24 - var12, var8) + var12;
                     float var25 = 1.0F;
                     var52 = 0;
                     if (var3 == null) {
                        continue label62;
                     }

                     int var26 = 0;

                     while (true) {
                        if (var26 < 5) {
                           float var27 = var23 + var10[var26] * var8;
                           float var28 = var24 + var11[var26] * var8;
                           float var29 = var27 * var21 - var28 * var20;
                           float var30 = var27 * var20 + var28 * var21;
                           int var31 = NM.L((int)var29, 0, var4 - 1);
                           int var32 = NM.L((int)var30, 0, var5 - 1);
                           int var33 = var14[var32 * var4 + var31];
                           int var34 = var33 >> var17 & a(12174, 1172769696302257439L);
                           float var35 = (float)var34 / 255.0F;
                           var35 = 1.0F - var35 * var35;
                           var35 = (float)((double)var35 * (double)var12 * 1.414);
                           float var36 = (float)var22 - var29;
                           float var37 = (float)var15 - var30;
                           float var38 = var36 * var36;
                           float var39 = var37 * var37;
                           float var40 = (float)Math.sqrt((double)(var38 + var39));
                           float var41 = 1.0F - NM.k(var40, var40 + 1.0F, var35);
                           var25 = Math.min(var25, var41);
                           var26++;
                           if (var3 == null) {
                              break;
                           }

                           if (var3 != null) {
                              continue;
                           }
                        }

                        var26 = (int)(255.0F * var25);
                        var26 <<= var17;
                        var26 ^= ~var18;
                        var26 |= a(17364, 3506722014742526275L);
                        var13[var22] &= var26;
                        var22++;
                        break;
                     }

                     if (var3 == null) {
                        break;
                     }
                  }

                  var16++;
                  if (var3 == null) {
                     break label64;
                  }
                  break;
               }
            }

            this.E(var2, 0, var15, var4, 1, var13);
            var15++;
            if (var3 == null) {
               return var2;
            }
            continue label77;
         }

         return var2;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "`\u0010qUzM%D\u001c&syM+BYAQzG0_\u0017l\u001e8\u000f".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 76;
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
         var10007 = 76;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 124;
               break;
            case 1:
               var50 = 53;
               break;
            case 2:
               var50 = 69;
               break;
            case 3:
               var50 = 124;
               break;
            case 4:
               var50 = 90;
               break;
            case 5:
               var50 = 109;
               break;
            default:
               var50 = 8;
         }
      } else {
         var34 = 76;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 5239867199143746088L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "´®(\u0006\u009c_OÈÞý\u0092c\u009f\u009a 2bîü7Mt\u001dt|Yê\u000etØ(\u0019vi\u0002I\u00104\u009f»";
            int var13 = "´®(\u0006\u009c_OÈÞý\u0092c\u009f\u009a 2bîü7Mt\u001dt|Yê\u000etØ(\u0019vi\u0002I\u00104\u009f»".length();
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
                           c = new Integer[7];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0004k\u0017X\u0085ûÃ\u0089·\u007f\u0084³\u0092ê#k";
                        var13 = "\u0004k\u0017X\u0085ûÃ\u0089·\u007f\u0084³\u0092ê#k".length();
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
         var10007 = 76;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 124;
               break;
            case 1:
               var50 = 53;
               break;
            case 2:
               var50 = 69;
               break;
            case 3:
               var50 = 124;
               break;
            case 4:
               var50 = 90;
               break;
            case 5:
               var50 = 109;
               break;
            default:
               var50 = 8;
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
                  var50 = 124;
                  break;
               case 1:
                  var50 = 53;
                  break;
               case 2:
                  var50 = 69;
                  break;
               case 3:
                  var50 = 124;
                  break;
               case 4:
                  var50 = 90;
                  break;
               case 5:
                  var50 = 109;
                  break;
               default:
                  var50 = 8;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 5239867199143746088L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "´®(\u0006\u009c_OÈÞý\u0092c\u009f\u009a 2bîü7Mt\u001dt|Yê\u000etØ(\u0019vi\u0002I\u00104\u009f»";
               int var5 = "´®(\u0006\u009c_OÈÞý\u0092c\u009f\u009a 2bîü7Mt\u001dt|Yê\u000etØ(\u0019vi\u0002I\u00104\u009f»".length();
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
                              c = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0004k\u0017X\u0085ûÃ\u0089·\u007f\u0084³\u0092ê#k";
                           var5 = "\u0004k\u0017X\u0085ûÃ\u0089·\u007f\u0084³\u0092ê#k".length();
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
                  var50 = 124;
                  break;
               case 1:
                  var50 = 53;
                  break;
               case 2:
                  var50 = 69;
                  break;
               case 3:
                  var50 = 124;
                  break;
               case 4:
                  var50 = 90;
                  break;
               case 5:
                  var50 = 109;
                  break;
               default:
                  var50 = 8;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31377;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





