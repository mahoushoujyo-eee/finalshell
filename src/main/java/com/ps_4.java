package com;

import java.awt.Font;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

public class ps_4 implements Stroke {
   private String W;
   private Font l;
   private boolean F = false;
   private boolean q = false;
   private AffineTransform o = new AffineTransform();
   private static final long[] a;
   private static final Integer[] b;

   public ps_4(String var1, Font var2) {
      this(var1, var2, true, false);
   }

   public ps_4(String var1, Font var2, boolean var3, boolean var4) {
      this.W = var1;
      this.l = var2;
      this.F = var3;
      this.q = var4;
   }

   @Override
   public Shape createStrokedShape(Shape var1) {
      int var2;
      GlyphVector var4;
      GeneralPath var5;
      FlatteningPathIterator var6;
      float[] var7;
      float var8;
      float var9;
      float var10;
      float var11;
      float var15;
      int var16;
      int var17;
      float var34;
      label104: {
         label107: {
            FontRenderContext var3 = new FontRenderContext(null, true, true);
            var4 = this.l.createGlyphVector(var3, this.W);
            var5 = new GeneralPath();
            int var10000 = com.Lp_2.z();
            var6 = new FlatteningPathIterator(var1.getPathIterator(null), 1.0);
            var7 = new float[a(26202, 3798645033542414022L)];
            var8 = 0.0F;
            var9 = 0.0F;
            var10 = 0.0F;
            var11 = 0.0F;
            var2 = var10000;
            var15 = 0.0F;
            var16 = 0;
            var17 = var4.getNumGlyphs();
            int var32 = var17;
            if (var2 != 0) {
               if (var17 == 0) {
                  return var5;
               }

               var33 = this;
               if (var2 == 0) {
                  break label107;
               }

               var32 = this.F;
            }

            if (var32 == 0) {
               var34 = 1.0F;
               break label104;
            }

            var33 = this;
         }

         var34 = var33.H(var1) / (float)var4.getLogicalBounds().getWidth();
      }

      float var18 = var34;
      float var19 = 0.0F;

      label92:
      while (true) {
         int var35 = var16;

         label90:
         while (var35 < var17) {
            int var36 = var6.isDone();
            if (var2 != 0) {
               if (var36 != 0) {
                  return var5;
               }

               var36 = var6.currentSegment(var7);
            }

            int var14 = var36;
            if (var2 != 0) {
               label110: {
                  switch (var14) {
                     case 0:
                        var8 = var10 = var7[0];
                        var9 = var11 = var7[1];
                        var5.moveTo(var8, var9);
                        var19 = var4.getGlyphMetrics(var16).getAdvance() * 0.5F;
                        var15 = var19;
                        if (var2 != 0) {
                           break label110;
                        }

                        com.ky_4.K(new String[2]);
                     case 4:
                        var7[0] = var8;
                        var7[1] = var9;
                     case 1:
                        break;
                     case 2:
                     case 3:
                     default:
                        break label110;
                  }

                  float var12;
                  float var13;
                  float var10001;
                  var12 = var7[0];
                  var13 = var7[1];
                  float var20 = var12 - var10;
                  float var21 = var13 - var11;
                  float var22 = (float)Math.sqrt((double)(var20 * var20 + var21 * var21));
                  var34 = var22;
                  var10001 = var15;
                  label83:
                  if (var2 != 0) {
                     if (var22 >= var15) {
                        float var23 = 1.0F / var22;
                        float var24 = (float)Math.atan2((double)var21, (double)var20);

                        while (var16 < var17) {
                           var34 = var22;
                           var10001 = var15;
                           if (var2 == 0) {
                              break label83;
                           }

                           float var39;
                           var35 = (var39 = var22 - var15) == 0.0F ? 0 : (var39 < 0.0F ? -1 : 1);
                           if (var2 == 0) {
                              continue label90;
                           }

                           if (var35 < 0) {
                              break;
                           }

                           label76: {
                              Shape var25 = var4.getGlyphOutline(var16);
                              Point2D var26 = var4.getGlyphPosition(var16);
                              float var27 = (float)var26.getX();
                              float var28 = (float)var26.getY();
                              float var29 = var10 + var15 * var20 * var23;
                              float var30 = var11 + var15 * var21 * var23;
                              float var31 = var19;
                              var19 = var16 < var17 - 1 ? var4.getGlyphMetrics(var16 + 1).getAdvance() * 0.5F : 0.0F;
                              this.o.setToTranslation((double)var29, (double)var30);
                              this.o.rotate((double)var24);
                              this.o.translate((double)(-var27 - var31), (double)(-var28));
                              var5.append(this.o.createTransformedShape(var25), false);
                              var15 += (var31 + var19) * var18;
                              var16++;
                              int var38 = this.q;
                              if (var2 != 0) {
                                 if (!this.q) {
                                    break label76;
                                 }

                                 var38 = var16 % var17;
                              }

                              var16 = var38;
                           }

                           if (var2 == 0) {
                              break;
                           }
                        }
                     }

                     var34 = var15;
                     var10001 = var22;
                  }

                  var15 = var34 - var10001;
                  var10 = var12;
                  var11 = var13;
               }

               var6.next();
            }

            if (var2 == 0) {
               return var5;
            }
            continue label92;
         }

         return var5;
      }
   }

   public float H(Shape var1) {
      FlatteningPathIterator var3 = new FlatteningPathIterator(var1.getPathIterator(null), 1.0);
      float[] var4 = new float[a(5603, 1565897720011529598L)];
      float var5 = 0.0F;
      int var10000 = com.Lp_2.z();
      float var6 = 0.0F;
      float var7 = 0.0F;
      int var2 = var10000;
      float var8 = 0.0F;
      float var12 = 0.0F;

      while (!var3.isDone()) {
         int var11 = var3.currentSegment(var4);
         if (var2 != 0) {
            switch (var11) {
               case 0:
                  var5 = var7 = var4[0];
                  var6 = var8 = var4[1];
                  if (var2 != 0) {
                     break;
                  }
               case 4:
                  var4[0] = var5;
                  var4[1] = var6;
               case 1:
                  float var9 = var4[0];
                  float var10 = var4[1];
                  float var13 = var9 - var7;
                  float var14 = var10 - var8;
                  var12 += (float)Math.sqrt((double)(var13 * var13 + var14 * var14));
                  var7 = var9;
                  var8 = var10;
               case 2:
               case 3:
            }

            var3.next();
         }

         if (var2 == 0) {
            break;
         }
      }

      return var12;
   }

   static {
      long var0 = 8935990644132187010L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0092ý,«w®eBìF\u008e9PW\u0016ú";
      int var5 = "\u0092ý,«w®eBìF\u008e9PW\u0016ú".length();
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

      a = var6;
      b = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2204;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





