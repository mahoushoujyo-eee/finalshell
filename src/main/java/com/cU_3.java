package com;

import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.GeneralPath;

public class cU_3 implements Stroke {
   private float l = 2.0F;
   private float W = 2.0F;
   private static final long a;

   public cU_3(float var1, float var2) {
      this.l = var1;
      this.W = var2;
   }

   @Override
   public Shape createStrokedShape(Shape var1) {
      GeneralPath var3 = new GeneralPath();
      var1 = new BasicStroke(10.0F).createStrokedShape(var1);
      int var10000 = com.Lp_2.N();
      FlatteningPathIterator var4 = new FlatteningPathIterator(var1.getPathIterator(null), 1.0);
      int var2 = var10000;
      float[] var5 = new float[(int)a];
      float var6 = 0.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var13 = 0.0F;

      while (!var4.isDone()) {
         int var12 = var4.currentSegment(var5);
         if (var2 == 0) {
            label59: {
               switch (var12) {
                  case 0:
                     var6 = var8 = this.C(var5[0]);
                     var7 = var9 = this.C(var5[1]);
                     var3.moveTo(var6, var7);
                     var13 = 0.0F;
                     if (var2 == 0) {
                        break label59;
                     }
                  case 4:
                     var5[0] = var6;
                     var5[1] = var7;
                  case 1:
                     break;
                  case 2:
                  case 3:
                  default:
                     break label59;
               }

               float var11;
               label47: {
                  float var10 = this.C(var5[0]);
                  var11 = this.C(var5[1]);
                  float var14 = var10 - var8;
                  float var15 = var11 - var9;
                  float var16 = (float)Math.sqrt((double)(var14 * var14 + var15 * var15));
                  float var22 = var16;
                  float var10001 = var13;
                  if (var2 == 0) {
                     if (var16 >= var13) {
                        float var17 = 1.0F / var16;

                        while (var16 >= var13) {
                           float var18 = var8 + var13 * var14 * var17;
                           float var19 = var9 + var13 * var15 * var17;
                           var3.lineTo(this.C(var18), this.C(var19));
                           var13 += this.l;
                           if (var2 != 0) {
                              break label47;
                           }

                           if (var2 != 0) {
                              break;
                           }
                        }
                     }

                     var22 = var13;
                     var10001 = var16;
                  }

                  var13 = var22 - var10001;
                  var8 = var10;
               }

               var9 = var11;
            }

            var4.next();
         }

         if (var2 != 0) {
            break;
         }
      }

      if (com.ky_4.F() != null) {
         com.Lp_2.O(++var2);
      }

      return var3;
   }

   private float C(float var1) {
      return var1 + (float)Math.random() * this.W * 2.0F - 1.0F;
   }

   static {
      long var0 = 5434447816205473342L;
      long var10002 = 6402049638132815416L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





