package com;

import java.awt.Color;
import java.awt.CompositeContext;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class B0 implements CompositeContext {
   private int U;
   private float C;
   private ColorModel f;
   private ColorModel Z;
   private ColorSpace B;
   private ColorSpace h;
   private static final long[] a;
   private static final Integer[] b;

   public B0(int var1, float var2, ColorModel var3, ColorModel var4) {
      this.U = var1;
      this.C = var2;
      this.f = var3;
      this.Z = var4;
      this.B = var3.getColorSpace();
      this.h = var4.getColorSpace();
      ColorModel var5 = ColorModel.getRGBdefault();
   }

   @Override
   public void dispose() {
   }

   static int w(int var0, int var1) {
      int var2 = var0 * var1 + a(4594, 9184578496501369578L);
      return (var2 >> a(3469, 6500804454187882132L)) + var2 >> a(3469, 6500804454187882132L);
   }

   static int w(int var0) {
      String var1 = rA_3.c();
      int var10000 = var0;
      if (var1 == null) {
         if (var0 < 0) {
            return 0;
         }

         var10000 = var0;
      }

      if (var1 == null) {
         var10000 = var10000 > a(1920, 4693531603399236758L) ? a(1920, 4693531603399236758L) : var0;
      }

      return var10000;
   }

   @Override
   public void compose(Raster var1, Raster var2, WritableRaster var3) {
      String var4;
      float var7;
      float[] var9;
      float[] var10;
      float[] var11;
      label456: {
         float var5 = 0.0F;
         float var6 = 0.0F;
         String var10000 = rA_3.c();
         var7 = this.C;
         var9 = null;
         var10 = null;
         var11 = null;
         var4 = var10000;
         int var50 = this.U;
         if (var4 == null) {
            switch (this.U) {
               case 12:
               case 13:
               case 14:
               case 15:
                  var50 = 3;
                  break;
               default:
                  break label456;
            }
         }

         var9 = new float[var50];
         var10 = new float[3];
         var11 = new float[3];
      }

      int[] var12 = null;
      int[] var13 = null;
      int var14 = var3.getMinX();
      int var15 = var3.getWidth();
      int var16 = var3.getMinY();
      int var17 = var16 + var3.getHeight();
      int var18 = var16;

      label449:
      while (true) {
         int var51 = var18;

         label447:
         while (var51 < var17) {
            var12 = var1.getPixels(var14, var18, var15, 1, var12);
            var13 = var2.getPixels(var14, var18, var15, 1, var13);
            byte var19 = 0;
            int var20 = var15 * 4;

            while (var19 < var20) {
               int var21 = var12[var19];
               int var22 = var13[var19];
               int var23 = var12[var19 + 1];
               int var24 = var13[var19 + 1];
               int var25 = var12[var19 + 2];
               int var26 = var13[var19 + 2];
               int var27 = var12[var19 + 3];
               int var28 = var13[var19 + 3];
               var51 = this.U;
               if (var4 != null) {
                  continue label447;
               }

               label441: {
                  int var29;
                  int var30;
                  int var31;
                  label440: {
                     if (var4 == null) {
                        label437: {
                           label461: {
                              label462: {
                                 label434: {
                                    label463: {
                                       label432: {
                                          label464: {
                                             label465: {
                                                label481: {
                                                   label428: {
                                                      label467: {
                                                         switch (this.U) {
                                                            case 1:
                                                            default:
                                                               var29 = var22 + var21;
                                                               var51 = var29;
                                                               int var10001 = a(883, 5993752115107846248L);
                                                               if (var4 == null) {
                                                                  if (var29 > var10001) {
                                                                     var29 = a(1920, 4693531603399236758L);
                                                                  }

                                                                  var51 = var24;
                                                                  var10001 = var23;
                                                               }

                                                               var30 = var51 + var10001;
                                                               var51 = var30;
                                                               var10001 = a(1920, 4693531603399236758L);
                                                               if (var4 == null) {
                                                                  if (var30 > var10001) {
                                                                     var30 = a(1920, 4693531603399236758L);
                                                                  }

                                                                  var51 = var26;
                                                                  var10001 = var25;
                                                               }

                                                               var31 = var51 + var10001;
                                                               if (var4 != null) {
                                                                  break label441;
                                                               }

                                                               if (var31 <= a(1920, 4693531603399236758L)) {
                                                                  break label440;
                                                               }

                                                               var31 = a(1920, 4693531603399236758L);
                                                               if (var4 == null) {
                                                                  break label440;
                                                               }

                                                               com.ky_4.K(new String[5]);
                                                            case 2:
                                                               var29 = var22 - var21;
                                                               var51 = var29;
                                                               if (var4 == null) {
                                                                  if (var29 < 0) {
                                                                     var29 = 0;
                                                                  }

                                                                  var51 = var24 - var23;
                                                               }

                                                               var30 = var51;
                                                               var51 = var30;
                                                               if (var4 == null) {
                                                                  if (var30 < 0) {
                                                                     var30 = 0;
                                                                  }

                                                                  var51 = var26 - var25;
                                                               }

                                                               var31 = var51;
                                                               if (var4 != null) {
                                                                  break label441;
                                                               }

                                                               if (var31 >= 0) {
                                                                  break label440;
                                                               }

                                                               var31 = 0;
                                                               if (var4 == null) {
                                                                  break label440;
                                                               }
                                                            case 3:
                                                               var29 = var22 - var21;
                                                               var51 = var29;
                                                               if (var4 == null) {
                                                                  if (var29 < 0) {
                                                                     var29 = -var29;
                                                                  }

                                                                  var51 = var24 - var23;
                                                               }

                                                               var30 = var51;
                                                               var51 = var30;
                                                               if (var4 == null) {
                                                                  if (var30 < 0) {
                                                                     var30 = -var30;
                                                                  }

                                                                  var51 = var26 - var25;
                                                               }

                                                               var31 = var51;
                                                               if (var4 != null) {
                                                                  break label441;
                                                               }

                                                               if (var31 >= 0) {
                                                                  break label440;
                                                               }

                                                               var31 = -var31;
                                                               if (var4 == null) {
                                                                  break label440;
                                                               }
                                                            case 4:
                                                               int var8 = var22 * var21 + a(28687, 8852175052652194581L);
                                                               var29 = (var8 >> a(12818, 5673437579610843394L)) + var8 >> a(3469, 6500804454187882132L);
                                                               var8 = var24 * var23 + a(4594, 9184578496501369578L);
                                                               var30 = (var8 >> a(3469, 6500804454187882132L)) + var8 >> a(3469, 6500804454187882132L);
                                                               var8 = var26 * var25 + a(4594, 9184578496501369578L);
                                                               var31 = (var8 >> a(3469, 6500804454187882132L)) + var8 >> a(3469, 6500804454187882132L);
                                                               if (var4 == null) {
                                                                  break label440;
                                                               }
                                                            case 8:
                                                               int var39 = (a(1920, 4693531603399236758L) - var22) * (a(1920, 4693531603399236758L) - var21)
                                                                  + a(4594, 9184578496501369578L);
                                                               var29 = a(1920, 4693531603399236758L)
                                                                  - ((var39 >> a(3469, 6500804454187882132L)) + var39 >> a(3469, 6500804454187882132L));
                                                               var39 = (a(1920, 4693531603399236758L) - var24) * (a(1920, 4693531603399236758L) - var23)
                                                                  + a(4594, 9184578496501369578L);
                                                               var30 = a(1920, 4693531603399236758L)
                                                                  - ((var39 >> a(3469, 6500804454187882132L)) + var39 >> a(3469, 6500804454187882132L));
                                                               var39 = (a(1920, 4693531603399236758L) - var26) * (a(1920, 4693531603399236758L) - var25)
                                                                  + a(4594, 9184578496501369578L);
                                                               var31 = a(1920, 4693531603399236758L)
                                                                  - ((var39 >> a(3469, 6500804454187882132L)) + var39 >> a(3469, 6500804454187882132L));
                                                               if (var4 == null) {
                                                                  break label440;
                                                               }
                                                            case 16:
                                                               label412: {
                                                                  var51 = var22;
                                                                  int var87 = a(4594, 9184578496501369578L);
                                                                  if (var4 == null) {
                                                                     if (var22 < var87) {
                                                                        int var42 = var22 * var21 + a(4594, 9184578496501369578L);
                                                                        var29 = 2
                                                                           * ((var42 >> a(3469, 6500804454187882132L)) + var42 >> a(3469, 6500804454187882132L));
                                                                        if (var4 == null) {
                                                                           break label412;
                                                                        }
                                                                     }

                                                                     var51 = (a(1920, 4693531603399236758L) - var22) * (a(1920, 4693531603399236758L) - var21);
                                                                     var87 = a(4594, 9184578496501369578L);
                                                                  }

                                                                  int var43 = var51 + var87;
                                                                  var29 = 2
                                                                     * (
                                                                        a(1920, 4693531603399236758L)
                                                                           - ((var43 >> a(3469, 6500804454187882132L)) + var43 >> a(3469, 6500804454187882132L))
                                                                     );
                                                               }

                                                               label405: {
                                                                  var51 = var24;
                                                                  int var88 = a(4594, 9184578496501369578L);
                                                                  if (var4 == null) {
                                                                     if (var24 < var88) {
                                                                        int var44 = var24 * var23 + a(4594, 9184578496501369578L);
                                                                        var30 = 2
                                                                           * ((var44 >> a(3469, 6500804454187882132L)) + var44 >> a(3469, 6500804454187882132L));
                                                                        if (var4 == null) {
                                                                           break label405;
                                                                        }
                                                                     }

                                                                     int var45 = (a(1920, 4693531603399236758L) - var24)
                                                                           * (a(1920, 4693531603399236758L) - var23)
                                                                        + a(4594, 9184578496501369578L);
                                                                     var51 = 2;
                                                                     var88 = a(1920, 4693531603399236758L)
                                                                        - ((var45 >> a(3469, 6500804454187882132L)) + var45 >> a(3469, 6500804454187882132L));
                                                                  }

                                                                  var30 = var51 * var88;
                                                               }

                                                               var51 = var26;
                                                               int var89 = a(4594, 9184578496501369578L);
                                                               if (var4 == null) {
                                                                  if (var26 < var89) {
                                                                     int var46 = var26 * var25 + a(4594, 9184578496501369578L);
                                                                     var31 = 2
                                                                        * ((var46 >> a(3469, 6500804454187882132L)) + var46 >> a(3469, 6500804454187882132L));
                                                                     if (var4 == null) {
                                                                        break label440;
                                                                     }
                                                                  }

                                                                  int var47 = (a(1920, 4693531603399236758L) - var26) * (a(1920, 4693531603399236758L) - var25)
                                                                     + a(4594, 9184578496501369578L);
                                                                  var51 = 2;
                                                                  var89 = a(1920, 4693531603399236758L)
                                                                     - ((var47 >> a(3469, 6500804454187882132L)) + var47 >> a(3469, 6500804454187882132L));
                                                               }

                                                               var31 = var51 * var89;
                                                               if (var4 == null) {
                                                                  break label440;
                                                               }
                                                            case 5:
                                                               var51 = var22;
                                                               if (var4 == null) {
                                                                  var51 = var22 < var21 ? var22 : var21;
                                                               }

                                                               var29 = var51;
                                                               var51 = var24;
                                                               if (var4 == null) {
                                                                  var51 = var24 < var23 ? var24 : var23;
                                                               }

                                                               var30 = var51;
                                                               var51 = var26;
                                                               if (var4 == null) {
                                                                  var51 = var26 < var25 ? var26 : var25;
                                                               }

                                                               var31 = var51;
                                                               if (var4 == null) {
                                                                  break label440;
                                                               }
                                                               break;
                                                            case 6:
                                                               break label481;
                                                            case 7:
                                                               break label465;
                                                            case 9:
                                                               break;
                                                            case 10:
                                                               break label464;
                                                            case 11:
                                                               break label432;
                                                            case 12:
                                                            case 13:
                                                            case 14:
                                                            case 15:
                                                               break label428;
                                                            case 17:
                                                               break label463;
                                                            case 18:
                                                               break label434;
                                                            case 19:
                                                               break label462;
                                                            case 20:
                                                               break label461;
                                                            case 21:
                                                               break label437;
                                                            case 22:
                                                               break label467;
                                                         }

                                                         var51 = var22;
                                                         if (var4 == null) {
                                                            var51 = var22 > var21 ? var22 : var21;
                                                         }

                                                         var29 = var51;
                                                         var51 = var24;
                                                         if (var4 == null) {
                                                            var51 = var24 > var23 ? var24 : var23;
                                                         }

                                                         var30 = var51;
                                                         var51 = var26;
                                                         if (var4 == null) {
                                                            var51 = var26 > var25 ? var26 : var25;
                                                         }

                                                         var31 = var51;
                                                         if (var4 == null) {
                                                            break label440;
                                                         }
                                                      }

                                                      var29 = (var22 + var21) / 2;
                                                      var30 = (var24 + var23) / 2;
                                                      var31 = (var26 + var25) / 2;
                                                      if (var4 == null) {
                                                         break label440;
                                                      }
                                                   }

                                                   Color.RGBtoHSB(var21, var23, var25, var9);
                                                   Color.RGBtoHSB(var22, var24, var26, var10);
                                                   var51 = this.U;
                                                   if (var4 == null) {
                                                      switch (this.U) {
                                                         case 12:
                                                            var11[0] = var9[0];
                                                            var11[1] = var10[1];
                                                            var11[2] = var10[2];
                                                            if (var4 == null) {
                                                               break;
                                                            }
                                                         case 13:
                                                            var11[0] = var10[0];
                                                            var11[1] = var9[1];
                                                            var11[2] = var10[2];
                                                            if (var4 == null) {
                                                               break;
                                                            }
                                                         case 14:
                                                            var11[0] = var10[0];
                                                            var11[1] = var10[1];
                                                            var11[2] = var9[2];
                                                            if (var4 == null) {
                                                               break;
                                                            }
                                                         case 15:
                                                            var11[0] = var9[0];
                                                            var11[1] = var9[1];
                                                            var11[2] = var10[2];
                                                      }

                                                      var51 = Color.HSBtoRGB(var11[0], var11[1], var11[2]);
                                                   }

                                                   int var33 = var51;
                                                   var29 = (var33 & a(26831, 8739112672724890590L)) >> a(20157, 580916132055979434L);
                                                   var30 = (var33 & a(32097, 6522089274815227517L)) >> a(3469, 6500804454187882132L);
                                                   var31 = var33 & a(1920, 4693531603399236758L);
                                                   if (var4 == null) {
                                                      break label440;
                                                   }
                                                }

                                                label382: {
                                                   var51 = var22;
                                                   if (var4 == null) {
                                                      if (var22 != a(1920, 4693531603399236758L)) {
                                                         var29 = w(
                                                            a(1920, 4693531603399236758L)
                                                               - (a(1920, 4693531603399236758L) - var21 << a(3469, 6500804454187882132L)) / (var22 + 1)
                                                         );
                                                         if (var4 == null) {
                                                            break label382;
                                                         }
                                                      }

                                                      var51 = var21;
                                                   }

                                                   var29 = var51;
                                                }

                                                label375: {
                                                   var51 = var24;
                                                   if (var4 == null) {
                                                      if (var24 != a(1920, 4693531603399236758L)) {
                                                         var30 = w(
                                                            a(1920, 4693531603399236758L)
                                                               - (a(1920, 4693531603399236758L) - var23 << a(3469, 6500804454187882132L)) / (var24 + 1)
                                                         );
                                                         if (var4 == null) {
                                                            break label375;
                                                         }
                                                      }

                                                      var51 = var23;
                                                   }

                                                   var30 = var51;
                                                }

                                                var51 = var26;
                                                if (var4 == null) {
                                                   if (var26 != a(1920, 4693531603399236758L)) {
                                                      var31 = w(
                                                         a(1920, 4693531603399236758L)
                                                            - (a(1920, 4693531603399236758L) - var25 << a(3469, 6500804454187882132L)) / (var26 + 1)
                                                      );
                                                      if (var4 == null) {
                                                         break label440;
                                                      }
                                                   }

                                                   var51 = var25;
                                                }

                                                var31 = var51;
                                                if (var4 == null) {
                                                   break label440;
                                                }
                                             }

                                             label367: {
                                                var51 = var21;
                                                if (var4 == null) {
                                                   if (var21 != 0) {
                                                      var29 = Math.max(
                                                         a(1920, 4693531603399236758L)
                                                            - (a(1920, 4693531603399236758L) - var22 << a(3469, 6500804454187882132L)) / var21,
                                                         0
                                                      );
                                                      if (var4 == null) {
                                                         break label367;
                                                      }
                                                   }

                                                   var51 = var21;
                                                }

                                                var29 = var51;
                                             }

                                             label360: {
                                                var51 = var23;
                                                if (var4 == null) {
                                                   if (var23 != 0) {
                                                      var30 = Math.max(
                                                         a(1920, 4693531603399236758L)
                                                            - (a(1920, 4693531603399236758L) - var24 << a(3469, 6500804454187882132L)) / var23,
                                                         0
                                                      );
                                                      if (var4 == null) {
                                                         break label360;
                                                      }
                                                   }

                                                   var51 = var23;
                                                }

                                                var30 = var51;
                                             }

                                             var51 = var25;
                                             if (var4 == null) {
                                                if (var25 != 0) {
                                                   var31 = Math.max(
                                                      a(1920, 4693531603399236758L)
                                                         - (a(1920, 4693531603399236758L) - var26 << a(3469, 6500804454187882132L)) / var25,
                                                      0
                                                   );
                                                   if (var4 == null) {
                                                      break label440;
                                                   }
                                                }

                                                var51 = var25;
                                             }

                                             var31 = var51;
                                             if (var4 == null) {
                                                break label440;
                                             }
                                          }

                                          var29 = w((var21 << a(3469, 6500804454187882132L)) / (a(29608, 3831650615169951933L) - var22));
                                          var30 = w((var23 << a(3469, 6500804454187882132L)) / (a(3979, 3586955812319417496L) - var24));
                                          var31 = w((var25 << a(3469, 6500804454187882132L)) / (a(3979, 3586955812319417496L) - var26));
                                          if (var4 == null) {
                                             break label440;
                                          }
                                       }

                                       label351: {
                                          var51 = var21;
                                          if (var4 == null) {
                                             if (var21 != a(1920, 4693531603399236758L)) {
                                                var29 = Math.min(
                                                   (var22 << a(3469, 6500804454187882132L)) / (a(1920, 4693531603399236758L) - var21),
                                                   a(1920, 4693531603399236758L)
                                                );
                                                if (var4 == null) {
                                                   break label351;
                                                }
                                             }

                                             var51 = var21;
                                          }

                                          var29 = var51;
                                       }

                                       label344: {
                                          var51 = var23;
                                          if (var4 == null) {
                                             if (var23 != a(1920, 4693531603399236758L)) {
                                                var30 = Math.min(
                                                   (var24 << a(3469, 6500804454187882132L)) / (a(1920, 4693531603399236758L) - var23),
                                                   a(1920, 4693531603399236758L)
                                                );
                                                if (var4 == null) {
                                                   break label344;
                                                }
                                             }

                                             var51 = var23;
                                          }

                                          var30 = var51;
                                       }

                                       var51 = var25;
                                       if (var4 == null) {
                                          if (var25 != a(1920, 4693531603399236758L)) {
                                             var31 = Math.min(
                                                (var26 << a(3469, 6500804454187882132L)) / (a(1920, 4693531603399236758L) - var25),
                                                a(1920, 4693531603399236758L)
                                             );
                                             if (var4 == null) {
                                                break label440;
                                             }
                                          }

                                          var51 = var25;
                                       }

                                       var31 = var51;
                                       if (var4 == null) {
                                          break label440;
                                       }
                                    }

                                    int var34 = w(var21, var22);
                                    var29 = var34
                                       + w(
                                          var22,
                                          a(1920, 4693531603399236758L)
                                             - w(a(1920, 4693531603399236758L) - var22, a(1920, 4693531603399236758L) - var21)
                                             - var34
                                       );
                                    var34 = w(var23, var24);
                                    var30 = var34
                                       + w(
                                          var24,
                                          a(1920, 4693531603399236758L)
                                             - w(a(1920, 4693531603399236758L) - var24, a(1920, 4693531603399236758L) - var23)
                                             - var34
                                       );
                                    var34 = w(var25, var26);
                                    var31 = var34
                                       + w(
                                          var26,
                                          a(1920, 4693531603399236758L)
                                             - w(a(1920, 4693531603399236758L) - var26, a(1920, 4693531603399236758L) - var25)
                                             - var34
                                       );
                                    if (var4 == null) {
                                       break label440;
                                    }
                                 }

                                 label335: {
                                    var51 = var21;
                                    int var90 = a(8372, 5217043393041431456L);
                                    if (var4 == null) {
                                       if (var21 > var90) {
                                          var29 = a(1920, 4693531603399236758L)
                                             - 2 * w(a(1920, 4693531603399236758L) - var21, a(1920, 4693531603399236758L) - var22);
                                          if (var4 == null) {
                                             break label335;
                                          }
                                       }

                                       var51 = 2;
                                       var90 = w(var21, var22);
                                    }

                                    var29 = var51 * var90;
                                 }

                                 label328: {
                                    var51 = var23;
                                    int var91 = a(23102, 8787479600625680684L);
                                    if (var4 == null) {
                                       if (var23 > var91) {
                                          var30 = a(1920, 4693531603399236758L)
                                             - 2 * w(a(1920, 4693531603399236758L) - var23, a(1920, 4693531603399236758L) - var24);
                                          if (var4 == null) {
                                             break label328;
                                          }
                                       }

                                       var51 = 2;
                                       var91 = w(var23, var24);
                                    }

                                    var30 = var51 * var91;
                                 }

                                 var51 = var25;
                                 int var92 = a(23102, 8787479600625680684L);
                                 if (var4 == null) {
                                    if (var25 > var92) {
                                       var31 = a(1920, 4693531603399236758L)
                                          - 2 * w(a(1920, 4693531603399236758L) - var25, a(1920, 4693531603399236758L) - var26);
                                       if (var4 == null) {
                                          break label440;
                                       }
                                    }

                                    var51 = 2;
                                    var92 = w(var25, var26);
                                 }

                                 var31 = var51 * var92;
                                 if (var4 == null) {
                                    break label440;
                                 }
                              }

                              label320: {
                                 var51 = var21;
                                 int var93 = a(23102, 8787479600625680684L);
                                 if (var4 == null) {
                                    if (var21 > var93) {
                                       var51 = Math.max(var21, var22);
                                       break label320;
                                    }

                                    var51 = var21;
                                    var93 = var22;
                                 }

                                 var51 = Math.min(var51, var93);
                              }

                              label314: {
                                 var29 = var51;
                                 var51 = var23;
                                 int var94 = a(23102, 8787479600625680684L);
                                 if (var4 == null) {
                                    if (var23 > var94) {
                                       var51 = Math.max(var23, var24);
                                       break label314;
                                    }

                                    var51 = var23;
                                    var94 = var24;
                                 }

                                 var51 = Math.min(var51, var94);
                              }

                              label308: {
                                 var30 = var51;
                                 var51 = var25;
                                 int var95 = a(23102, 8787479600625680684L);
                                 if (var4 == null) {
                                    if (var25 > var95) {
                                       var51 = Math.max(var25, var26);
                                       break label308;
                                    }

                                    var51 = var25;
                                    var95 = var26;
                                 }

                                 var51 = Math.min(var51, var95);
                              }

                              var31 = var51;
                              if (var4 == null) {
                                 break label440;
                              }
                           }

                           var29 = var22 + w(var21, a(1920, 4693531603399236758L) - var22 - var22);
                           var30 = var24 + w(var23, a(1920, 4693531603399236758L) - var24 - var24);
                           var31 = var26 + w(var25, a(1920, 4693531603399236758L) - var26 - var26);
                           if (var4 == null) {
                              break label440;
                           }
                        }

                        var51 = a(1920, 4693531603399236758L) - Math.abs(a(1920, 4693531603399236758L) - var21 - var22);
                     }

                     var29 = var51;
                     var30 = a(1920, 4693531603399236758L) - Math.abs(a(1920, 4693531603399236758L) - var23 - var24);
                     var31 = a(1920, 4693531603399236758L) - Math.abs(a(1920, 4693531603399236758L) - var25 - var26);
                  }

                  float var35 = var7 * (float)var27 / 255.0F;
                  float var36 = 1.0F - var35;
                  var13[var19] = (int)(var35 * (float)var29 + var36 * (float)var22);
                  var13[var19 + 1] = (int)(var35 * (float)var30 + var36 * (float)var24);
                  var13[var19 + 2] = (int)(var35 * (float)var31 + var36 * (float)var26);
                  var13[var19 + 3] = (int)((float)var27 * var7 + (float)var28 * var36);
                  var19 += 4;
               }

               if (var4 != null) {
                  break;
               }
            }

            var3.setPixels(var14, var18, var15, 1, var13);
            var18++;
            if (var4 != null) {
               return;
            }
            continue label449;
         }

         return;
      }
   }

   static {
      long var0 = 767567692299049190L;
      long[] var6 = new long[13];
      int var3 = 0;
      String var4 = "¹Vc!¼\u0083qì|´\\*U\u0093«8³²P\u008fZÄ\u0019µt\u008bïÔRßM~\u001bDß\u0002ô\u0085c9ní¡ä$\u0011±[¬³:Ûâ#D\u008fîvûº7ð\u008d\\\u0088N÷¬ß*Ò\u008c´å5·\u008e¨Nzl\u0017Ù\u009cæe³s";
      int var5 = "¹Vc!¼\u0083qì|´\\*U\u0093«8³²P\u008fZÄ\u0019µt\u008bïÔRßM~\u001bDß\u0002ô\u0085c9ní¡ä$\u0011±[¬³:Ûâ#D\u008fîvûº7ð\u008d\\\u0088N÷¬ß*Ò\u008c´å5·\u008e¨Nzl\u0017Ù\u009cæe³s"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[13];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "m*\u008fr\u00042Àq\u00ad±É{\n2Á\u009b";
                  var5 = "m*\u008fr\u00042Àq\u00ad±É{\n2Á\u009b".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23312;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





