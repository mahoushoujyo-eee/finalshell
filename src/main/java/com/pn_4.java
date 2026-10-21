package com;

import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D.Float;

public class pn_4 implements Stroke {
   private Shape[] W;
   private float G;
   private boolean x = true;
   private AffineTransform k = new AffineTransform();
   private static final long a;

   public pn_4() {
      this(new Shape[]{new Float(0.0F, 0.0F, 4.0F, 4.0F)}, 8.0F);
   }

   public pn_4(Shape var1, float var2) {
      this(new Shape[]{var1}, var2);
   }

   public pn_4(Shape[] var1, float var2) {
      int var10000 = com.Lp_2.N();
      this.G = var2;
      this.W = new Shape[var1.length];
      int var3 = var10000;
      int var4 = 0;

      while (var4 < this.W.length) {
         Rectangle2D var5 = var1[var4].getBounds2D();
         this.k.setToTranslation(-var5.getCenterX(), -var5.getCenterY());
         this.W[var4] = this.k.createTransformedShape(var1[var4]);
         var4++;
         if (var3 != 0) {
            break;
         }
      }
   }

   @Override
   public Shape createStrokedShape(Shape var1) {
      GeneralPath var3 = new GeneralPath();
      FlatteningPathIterator var4 = new FlatteningPathIterator(var1.getPathIterator(null), 1.0);
      float[] var5 = new float[(int)a];
      float var6 = 0.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      int var10000 = com.Lp_2.N();
      float var13 = 0.0F;
      int var14 = 0;
      int var2 = var10000;
      int var15 = this.W.length;

      label75:
      while (true) {
         var10000 = var14;

         label73:
         while (var10000 < var15) {
            var10000 = var4.isDone();
            if (var2 == 0) {
               if (var10000 != 0) {
                  return var3;
               }

               var10000 = var4.currentSegment(var5);
            }

            int var12 = var10000;
            if (var2 == 0) {
               label80: {
                  switch (var12) {
                     case 0:
                        var6 = var8 = var5[0];
                        var7 = var9 = var5[1];
                        var3.moveTo(var6, var7);
                        var13 = 0.0F;
                        if (var2 == 0) {
                           break label80;
                        }
                     case 4:
                        var5[0] = var6;
                        var5[1] = var7;
                     case 1:
                        break;
                     case 2:
                     case 3:
                     default:
                        break label80;
                  }

                  float var10;
                  float var11;
                  float var10001;
                  var10 = var5[0];
                  var11 = var5[1];
                  float var16 = var10 - var8;
                  float var17 = var11 - var9;
                  float var18 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17));
                  var25 = var18;
                  var10001 = var13;
                  label66:
                  if (var2 == 0) {
                     if (var18 >= var13) {
                        float var19 = 1.0F / var18;
                        float var20 = (float)Math.atan2((double)var17, (double)var16);

                        while (var14 < var15) {
                           var25 = var18;
                           var10001 = var13;
                           if (var2 != 0) {
                              break label66;
                           }

                           float var27;
                           var10000 = (var27 = var18 - var13) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
                           if (var2 != 0) {
                              continue label73;
                           }

                           if (var10000 < 0) {
                              break;
                           }

                           label59: {
                              float var21 = var8 + var13 * var16 * var19;
                              float var22 = var9 + var13 * var17 * var19;
                              this.k.setToTranslation((double)var21, (double)var22);
                              this.k.rotate((double)var20);
                              var3.append(this.k.createTransformedShape(this.W[var14]), false);
                              var13 += this.G;
                              var14++;
                              var10000 = this.x;
                              if (var2 == 0) {
                                 if (!this.x) {
                                    break label59;
                                 }

                                 var10000 = var14 % var15;
                              }

                              var14 = var10000;
                           }

                           if (var2 != 0) {
                              break;
                           }
                        }
                     }

                     var25 = var13;
                     var10001 = var18;
                  }

                  var13 = var25 - var10001;
                  var8 = var10;
                  var9 = var11;
               }

               var4.next();
            }

            if (var2 != 0) {
               return var3;
            }
            continue label75;
         }

         return var3;
      }
   }

   static {
      long var0 = 1888088032160027147L;
      long var10002 = -1487772991393590771L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





