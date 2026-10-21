package com.finalshell.core;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class GU3 extends W5 {
   public int K = 1;
   public int v = 1;
   public int t = 1;
   public BufferedImage d;
   public boolean U = true;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void e(boolean var1) {
      this.U = var1;
   }

   public boolean A$boolean() {
      return this.U;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label43: {
         var4 = var1.getWidth();
         String[] var10000 = W5.q();
         var5 = var1.getHeight();
         var3 = var10000;
         BufferedImage var9 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label43;
            }

            var9 = new BufferedImage(var4, var5, 2);
         }

         var2 = var9;
      }

      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      this.l(var1, 0, 0, var4, var5, var6);
      byte var10 = (this.U) ? 1 : 0;
      if (var3 != null) {
         if (this.U) {
            NM.g(var6, 0, var6.length);
         }

         var10 = 0;
      }

      int var8 = var10;

      while (true) {
         if (var8 < this.t) {
            this.R(var6, var7, var4, var5, this.K, 1);
            this.R(var7, var6, var5, var4, this.v, 2);
            var8++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         GU3 var11 = this;
         if (var3 != null) {
            if (this.U) {
               NM.L(var6, 0, var6.length);
            }

            var11 = this;
         }

         var11.E(var2, 0, 0, var4, var5, var6);
         break;
      }

      return var2;
   }

   @Override
   public BufferedImage createCompatibleDestImage(BufferedImage var1, ColorModel var2) {
      String[] var3 = W5.q();
      ColorModel var10000 = var2;
      if (var3 != null) {
         if (var2 != null) {
            return new BufferedImage(var2, var2.createCompatibleWritableRaster(var1.getWidth(), var1.getHeight()), var2.isAlphaPremultiplied(), null);
         }

         var10000 = var1.getColorModel();
      }

      var2 = var10000;
      return new BufferedImage(var2, var2.createCompatibleWritableRaster(var1.getWidth(), var1.getHeight()), var2.isAlphaPremultiplied(), null);
   }

   @Override
   public Rectangle2D getBounds2D(BufferedImage var1) {
      return new Rectangle(0, 0, var1.getWidth(), var1.getHeight());
   }

   @Override
   public Point2D getPoint2D(Point2D var1, Point2D var2) {
      String[] var3 = W5.q();
      Object var10000 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = new Double();
         }

         var2.setLocation(var1.getX(), var1.getY());
         var10000 = var2;
      }

      return (Point2D)var10000;
   }

   @Override
   public RenderingHints getRenderingHints() {
      return null;
   }

   public void R(int[] var1, int[] var2, int var3, int var4, int var5, int var6) {
      int var8 = var3 - 1;
      int[] var9 = new int[var3];
      int[] var10 = new int[var3];
      String[] var10000 = W5.q();
      int[] var11 = new int[var3];
      int[] var12 = new int[var3];
      int[] var13 = new int[var3];
      String[] var7 = var10000;
      int var14 = 0;
      int var15 = 0;

      while (var15 < var4) {
         int var16 = var15;
         BufferedImage var34 = this.d;

         label102:
         while (true) {
            label100:
            if (var34 != null) {
               if (var6 == 1) {
                  this.l(this.d, 0, var15, var3, 1, var13);
                  if (var7 != null) {
                     break label100;
                  }
               }

               this.l(this.d, var15, 0, 1, var3, var13);
            }

            int var17 = 0;

            while (true) {
               if (var17 < var3) {
                  int var18 = var1[var14 + var17];
                  var12[var17] = var18 >> a(809, 2599659608606802642L) & a(13178, 5627020562749928069L);
                  var9[var17] = var18 >> a(9686, 2672784213075764271L) & a(1226, 8354698696482981172L);
                  var10[var17] = var18 >> a(9470, 4241176921147254019L) & a(1226, 8354698696482981172L);
                  var11[var17] = var18 & a(1226, 8354698696482981172L);
                  if (var7 != null) {
      int var35;
                     var35 = var17;
                     if (var7 == null) {
                        break;
                     }

                     if (var17 != 0) {
                        var12[var17] += var12[var17 - 1];
                        var9[var17] += var9[var17 - 1];
                        var10[var17] += var10[var17 - 1];
                        var11[var17] += var11[var17 - 1];
                     }

                     var17++;
                  }

                  if (var7 != null) {
                     continue;
                  }
               }

               var35 = 0;
               break;
            }

            var17 = var35;

            while (var17 < var3) {
               var34 = this.d;
               if (var7 == null) {
                  continue label102;
               }

               int var28;
               label112: {
                  if (this.d != null) {
                     int var36 = var6;
                     int var10001 = 1;
                     if (var7 != null) {
                        if (var6 == 1) {
                           var28 = (int)((float)((var13[var17] & a(1226, 8354698696482981172L)) * this.K) / 255.0F);
                           if (var7 != null) {
                              break label112;
                           }
                        }

                        var36 = var13[var17] & a(1226, 8354698696482981172L);
                        var10001 = this.v;
                     }

                     var28 = (int)((float)(var36 * var10001) / 255.0F);
                     if (var7 != null) {
                        break label112;
                     }
                  }

                  int var37 = var6;
                  if (var7 != null) {
                     if (var6 == 1) {
                        var28 = (int)(this.v(var17, var15, var3, var4) * (float)this.K);
                        if (var7 != null) {
                           break label112;
                        }
                     }

                     var37 = (int)(this.v(var15, var17, var4, var3) * (float)this.v);
                  }

                  var28 = var37;
               }

               int var19 = 2 * var28 + 1;
               int var20 = 0;
               int var21 = 0;
               int var22 = 0;
               int var23 = 0;
               int var24 = var17 + var28;
               int var38 = var24;
               int var40 = var8;
               if (var7 != null) {
                  if (var24 > var8) {
                     int var25 = var24 - var8;
                     var20 += (var12[var8] - var12[var8 - 1]) * var25;
                     var21 += (var9[var8] - var9[var8 - 1]) * var25;
                     var22 += (var10[var8] - var10[var8 - 1]) * var25;
                     var23 += (var11[var8] - var11[var8 - 1]) * var25;
                     var24 = var8;
                  }

                  var38 = var17 - var28;
                  var40 = 1;
               }

               int var33 = var38 - var40;
               int var39 = var33;
               if (var7 != null) {
                  if (var33 < 0) {
                     var20 -= var12[0] * var33;
                     var21 -= var9[0] * var33;
                     var22 -= var10[0] * var33;
                     var23 -= var11[0] * var33;
                     var33 = 0;
                  }

                  var20 += var12[var24] - var12[var33];
                  var21 += var9[var24] - var9[var33];
                  var22 += var10[var24] - var10[var33];
                  var23 += var11[var24] - var11[var33];
                  var2[var16] = var20 / var19 << a(5244, 7709163281894118788L)
                     | var21 / var19 << a(27006, 2378830329643690116L)
                     | var22 / var19 << a(26904, 6658203400421370084L)
                     | var23 / var19;
                  var39 = var16 + var4;
               }

               var16 = var39;
               var17++;
               if (var7 == null) {
                  break;
               }
            }

            var14 += var3;
            var15++;
            if (var7 == null) {
               return;
            }
            break;
         }
      }
   }

   protected float v(int var1, int var2, int var3, int var4) {
      return (float)var1 / (float)var3;
   }

   public void V(int var1) {
      this.K = var1;
   }

   public int A$int() {
      return this.K;
   }

   public void c(int var1) {
      this.v = var1;
   }

   public int Z() {
      return this.v;
   }

   public void a(int var1) {
      this.K = this.v = var1;
   }

   public int g() {
      return this.K;
   }

   public void U(int var1) {
      this.t = var1;
   }

   public int e() {
      return this.t;
   }

   public void G(BufferedImage var1) {
      this.d = var1;
   }

   public BufferedImage R() {
      return this.d;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 509;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "eI\u00114\u0001r9UL\u0005$BAxeI\u00114\u0000\nv".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 72;
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
         var10007 = 72;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 111;
               break;
            case 1:
               var50 = 109;
               break;
            case 2:
               var50 = 44;
               break;
            case 3:
               var50 = 14;
               break;
            case 4:
               var50 = 102;
               break;
            case 5:
               var50 = 108;
               break;
            default:
               var50 = 16;
         }
      } else {
         var34 = 72;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3874481496640463265L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "í?òòÖ\u0085\u0004ª\u001b\u0087HCü}ÉMñ\u008d\u009acÊ\u0093\u0013ÛýÃz©¹]¤j!2W=\u001d³\u0005\u009e\u00adhÇ~DÜ´=";
            int var13 = "í?òòÖ\u0085\u0004ª\u001b\u0087HCü}ÉMñ\u008d\u009acÊ\u0093\u0013ÛýÃz©¹]¤j!2W=\u001d³\u0005\u009e\u00adhÇ~DÜ´=".length();
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
                           c = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "FÛà\u0098Cä£kCÜrÔ{BI5";
                        var13 = "FÛà\u0098Cä£kCÜrÔ{BI5".length();
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
         var10007 = 72;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 111;
               break;
            case 1:
               var50 = 109;
               break;
            case 2:
               var50 = 44;
               break;
            case 3:
               var50 = 14;
               break;
            case 4:
               var50 = 102;
               break;
            case 5:
               var50 = 108;
               break;
            default:
               var50 = 16;
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
                  var50 = 111;
                  break;
               case 1:
                  var50 = 109;
                  break;
               case 2:
                  var50 = 44;
                  break;
               case 3:
                  var50 = 14;
                  break;
               case 4:
                  var50 = 102;
                  break;
               case 5:
                  var50 = 108;
                  break;
               default:
                  var50 = 16;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3874481496640463265L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "í?òòÖ\u0085\u0004ª\u001b\u0087HCü}ÉMñ\u008d\u009acÊ\u0093\u0013ÛýÃz©¹]¤j!2W=\u001d³\u0005\u009e\u00adhÇ~DÜ´=";
               int var5 = "í?òòÖ\u0085\u0004ª\u001b\u0087HCü}ÉMñ\u008d\u009acÊ\u0093\u0013ÛýÃz©¹]¤j!2W=\u001d³\u0005\u009e\u00adhÇ~DÜ´=".length();
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
                              c = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "FÛà\u0098Cä£kCÜrÔ{BI5";
                           var5 = "FÛà\u0098Cä£kCÜrÔ{BI5".length();
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
                  var50 = 111;
                  break;
               case 1:
                  var50 = 109;
                  break;
               case 2:
                  var50 = 44;
                  break;
               case 3:
                  var50 = 14;
                  break;
               case 4:
                  var50 = 102;
                  break;
               case 5:
                  var50 = 108;
                  break;
               default:
                  var50 = 16;
            }
         }
      }
   }
}





