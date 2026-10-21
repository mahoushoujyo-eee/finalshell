package com.finalshell.core;

import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.GeneralPath;

public class Lp2_2 implements Stroke {
   public float E = 10.0F;
   public float I = 10.0F;
   public Stroke H;
   public static int A;
   public static long a;

   public Lp2_2(float var1, float var2) {
      this(new BasicStroke(1.0F), var1, var2);
   }

   public Lp2_2(Stroke var1, float var2, float var3) {
      this.H = var1;
      this.E = var2;
      this.I = var3;
   }

   @Override
   public Shape createStrokedShape(Shape var1) {
      int var10000 = N();
      GeneralPath var3 = new GeneralPath();
      FlatteningPathIterator var4 = new FlatteningPathIterator(var1.getPathIterator(null), 1.0);
      int var2 = var10000;
      float[] var5 = new float[(int)a];
      float var6 = 0.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var13 = 0.0F;
      int var14 = 0;

      while (!var4.isDone()) {
         int var12 = var4.currentSegment(var5);
         label64:
         if (var2 == 0) {
            switch (var12) {
               case 0:
                  var6 = var8 = var5[0];
                  var7 = var9 = var5[1];
                  var3.moveTo(var6, var7);
                  var13 = this.I / 2.0F;
                  if (var2 == 0) {
                     break;
                  }
               case 4:
                  var5[0] = var6;
                  var5[1] = var7;
               case 1:
                  float var10 = var5[0];
                  float var11 = var5[1];
                  float var15 = var10 - var8;
                  float var16 = var11 - var9;
                  float var17 = (float)Math.sqrt((double)(var15 * var15 + var16 * var16));
                  float var22;
                  var10000 = (var22 = var17 - var13) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
                  label37:
                  if (var2 == 0) {
                     if (var10000 >= 0) {
                        float var18 = 1.0F / var17;

                        while (var17 >= var13) {
                           label50: {
                              float var19;
                              float var20;
                              label49: {
                                 var19 = var8 + var13 * var15 * var18;
                                 var20 = var9 + var13 * var16 * var18;
                                 if (var2 == 0) {
                                    var10000 = var14 & 1;
                                    if (var2 != 0) {
                                       break label37;
                                    }

                                    if (var10000 != 0) {
                                       break label49;
                                    }

                                    var3.lineTo(var19 + this.E * var16 * var18, var20 - this.E * var15 * var18);
                                 }

                                 if (var2 == 0) {
                                    break label50;
                                 }
                              }

                              var3.lineTo(var19 - this.E * var16 * var18, var20 + this.E * var15 * var18);
                           }

                           var13 += this.I;
                           var14++;
                           if (var2 != 0) {
                              break;
                           }
                        }
                     }

                     var13 -= var17;
                     var8 = var10;
                     var9 = var11;
                     if (var2 != 0) {
                        break label64;
                     }

                     var10000 = var12;
                  }

                  if (var10000 == 4) {
                     var3.closePath();
                  }
               case 2:
               case 3:
            }

            var4.next();
         }

         if (var2 != 0) {
            break;
         }
      }

      return this.H.createStrokedShape(var3);
   }

   public static void O(int var0) {
      A = var0;
   }

   public static int z() {
      return A;
   }

   public static int N() {
      int var0 = z();
      return var0 == 0 ? 100 : 0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (N() != 0) {
         O(10);
      }

      long var0 = 2633997535962250468L;
      long var10002 = -8453407066318914334L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





