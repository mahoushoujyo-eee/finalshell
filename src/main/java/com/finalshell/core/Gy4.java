package com.finalshell.core;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public abstract class Gy4 extends W5 {
   protected int t = a(25584, 6697158943221741684L);
   protected int P = 1;
   protected Rectangle r;
   protected Rectangle U;
   public static long[] ab;
   public static Integer[] bb;

   public void Y(int var1) {
      this.t = var1;
   }

   public int s() {
      return this.t;
   }

   public void Q(int var1) {
      this.P = var1;
   }

   public int A() {
      return this.P;
   }

   protected abstract void h(int var1, int var2, float[] var3);

   protected void T(Rectangle var1) {
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var4 = var1.getWidth();
      String[] var10000 = W5.q();
      int var5 = var1.getHeight();
      int var6 = var1.getType();
      String[] var3 = var10000;
      WritableRaster var7 = var1.getRaster();
      this.U = new Rectangle(0, 0, var4, var5);
      this.r = new Rectangle(0, 0, var4, var5);
      this.T(this.r);
      BufferedImage var33 = var2;
      if (var3 != null) {
         if (var2 == null) {
            ColorModel var8 = var1.getColorModel();
            var2 = new BufferedImage(var8, var8.createCompatibleWritableRaster(this.r.width, this.r.height), var8.isAlphaPremultiplied(), null);
         }

         var33 = var2;
      }

      WritableRaster var32 = var33.getRaster();
      int[] var9 = this.l(var1, 0, 0, var4, var5, null);
      int var34 = this.P;
      if (var3 != null) {
         if (this.P == 0) {
            return this.l(var2, var4, var5, var9, this.r);
         }

         var34 = var4;
      }

      int var10 = var34;
      int var11 = var5;
      int var12 = var4 - 1;
      int var13 = var5 - 1;
      int var14 = this.r.width;
      int var15 = this.r.height;
      boolean var18 = false;
      int[] var19 = new int[var14];
      int var16 = this.r.x;
      int var17 = this.r.y;
      float[] var20 = new float[2];
      int var21 = 0;

      label73:
      while (true) {
         int var35 = var21;

         label71:
         while (var35 < var15) {
            int var22 = 0;

            while (var22 < var14) {
               this.h(var16 + var22, var17 + var21, var20);
               int var23 = (int)Math.floor((double)var20[0]);
               int var24 = (int)Math.floor((double)var20[1]);
               float var25 = var20[0] - (float)var23;
               float var26 = var20[1] - (float)var24;
               var35 = var23;
               if (var3 == null) {
                  continue label71;
               }

               int var27;
               int var28;
               int var29;
               int var30;
               label65: {
                  label64:
                  if (var3 != null) {
                     if (var23 >= 0) {
                        var35 = var23;
                        if (var3 == null) {
                           break label64;
                        }

                        if (var23 < var12) {
                           var35 = var24;
                           if (var3 == null) {
                              break label64;
                           }

                           if (var24 >= 0) {
                              var35 = var24;
                              if (var3 == null) {
                                 break label64;
                              }

                              if (var24 < var13) {
                                 int var31 = var10 * var24 + var23;
                                 var27 = var9[var31];
                                 var28 = var9[var31 + 1];
                                 var29 = var9[var31 + var10];
                                 var30 = var9[var31 + var10 + 1];
                                 if (var3 != null) {
                                    break label65;
                                 }
                              }
                           }
                        }
                     }

                     var35 = this.A(var9, var23, var24, var10, var11);
                  }

                  var27 = var35;
                  var28 = this.A(var9, var23 + 1, var24, var10, var11);
                  var29 = this.A(var9, var23, var24 + 1, var10, var11);
                  var30 = this.A(var9, var23 + 1, var24 + 1, var10, var11);
               }

               var19[var22] = NM.O(var25, var26, var27, var28, var29, var30);
               var22++;
               if (var3 == null) {
                  break;
               }
            }

            this.E(var2, 0, var21, this.r.width, 1, var19);
            var21++;
            if (var3 == null) {
               return var2;
            }
            continue label73;
         }

         return var2;
      }
   }

   public final int A(int[] var1, int var2, int var3, int var4, int var5) {
      String[] var6;
      int var10000;
      var6 = W5.q();
      var10000 = var2;
      label38:
      if (var6 != null) {
         if (var2 >= 0) {
            var10000 = var2;
            if (var6 == null) {
               break label38;
            }

            if (var2 < var4) {
               var10000 = var3;
               if (var6 == null) {
                  break label38;
               }

               if (var3 >= 0) {
                  if (var6 == null) {
                     return var3;
                  }

                  if (var3 < var5) {
                     return var1[var3 * var4 + var2];
                  }
               }
            }
         }

         var10000 = this.t;
      }

      if (var6 != null) {
         switch (var10000) {
            case 0:
            default:
               return 0;
            case 1:
               return var1[NM.L(var3, 0, var5 - 1) * var4 + NM.L(var2, 0, var4 - 1)];
            case 2:
               return var1[NM.r(var3, var5) * var4 + NM.r(var2, var4)];
            case 3:
               var10000 = var1[NM.L(var3, 0, var5 - 1) * var4 + NM.L(var2, 0, var4 - 1)] & a(27418, 8664314053654900895L);
         }
      }

      return var10000;
   }

   protected BufferedImage l(BufferedImage var1, int var2, int var3, int[] var4, Rectangle var5) {
      int var7 = var2;
      int var8 = var3;
      int var9 = var5.width;
      int var10 = var5.height;
      String[] var10000 = W5.q();
      int[] var15 = new int[var9];
      String[] var6 = var10000;
      int var11 = var5.x;
      int var12 = var5.y;
      int[] var16 = new int[4];
      float[] var17 = new float[2];
      int var18 = 0;

      label77:
      while (true) {
         int var22 = var18;

         label75:
         while (var22 < var10) {
            int var19 = 0;

            while (var19 < var9) {
               this.h(var11 + var19, var12 + var18, var17);
               int var13 = (int)var17[0];
               int var14 = (int)var17[1];
               float var24;
               var22 = (var24 = var17[0] - 0.0F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
               if (var6 == null) {
                  continue label75;
               }

               label69: {
                  int var10001;
                  label68: {
                     label83: {
                        label66:
                        if (var6 != null) {
                           if (var22 >= 0) {
                              var22 = var13;
                              if (var6 == null) {
                                 break label66;
                              }

                              if (var13 < var7) {
                                 float var25;
                                 var22 = (var25 = var17[1] - 0.0F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
                                 if (var6 == null) {
                                    break label66;
                                 }

                                 if (var22 >= 0) {
      int var23;
                                    var23 = var14;
                                    var10001 = var8;
                                    if (var6 == null) {
                                       break label68;
                                    }

                                    if (var14 < var8) {
                                       break label83;
                                    }
                                 }
                              }
                           }

                           var22 = this.t;
                        }

                        int var20;
                        label52: {
                           if (var6 != null) {
                              switch (var22) {
                                 case 0:
                                 default:
                                    var20 = 0;
                                    if (var6 != null) {
                                       break label52;
                                    }
                                 case 2:
                                    var20 = var4[NM.r(var14, var8) * var7 + NM.r(var13, var7)];
                                    if (var6 != null) {
                                       break label52;
                                    }
                                 case 1:
                                    var20 = var4[NM.L(var14, 0, var8 - 1) * var7 + NM.L(var13, 0, var7 - 1)];
                                    if (var6 != null) {
                                       break label52;
                                    }
                                 case 3:
                                    var22 = var4[NM.L(var14, 0, var8 - 1) * var7 + NM.L(var13, 0, var7 - 1)] & a(9692, 6242484975259827802L);
                              }
                           }

                           var20 = var22;
                        }

                        var15[var19] = var20;
                        if (var6 != null) {
                           break label69;
                        }
                     }

                     var23 = var7 * var14;
                     var10001 = var13;
                  }

                  int var21 = var23 + var10001;
                  var16[0] = var4[var21];
                  var15[var19] = var4[var21];
               }

               var19++;
               if (var6 == null) {
                  break;
               }
            }

            this.E(var1, 0, var18, var5.width, 1, var15);
            var18++;
            if (var6 == null) {
               return var1;
            }
            continue label77;
         }

         return var1;
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7044;
      if (bb[var3] == null) {
         bb[var3] = (int)(ab[var3] ^ var1);
      }

      return bb[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6894852758606319829L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "\u0095\u001d\u0014&ÈUè¢D1ÁáA#\u009fµ¥©\u0081we¶Ñp";
      int var5 = "\u0095\u001d\u0014&ÈUè¢D1ÁáA#\u009fµ¥©\u0081we¶Ñp".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
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
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      ab = var6;
      bb = new Integer[3];
   }
}





