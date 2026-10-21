package com.finalshell.core;

import java.awt.Color;
import java.awt.CompositeContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class Di4 implements CompositeContext {
   public int Z;
   public float r;
   public ColorModel p;
   public ColorModel N;
   public static long[] a;
   public static Integer[] b;

   public Di4(int var1, float var2, ColorModel var3, ColorModel var4) {
      this.Z = var1;
      this.r = var2;
      this.p = var3;
      this.N = var4;
   }

   @Override
   public void dispose() {
   }

   public static int N(int var0, int var1) {
      int var2 = var0 * var1 + a(31172, 2028901699679707892L);
      return (var2 >> a(6724, 227922682202980732L)) + var2 >> a(14759, 7758752785333953169L);
   }

   public static int F(int var0) {
      String[] var1 = ZH.U();
      int var10000 = var0;
      if (var1 == null) {
         if (var0 < 0) {
            return 0;
         }

         var10000 = var0;
      }

      if (var1 == null) {
         var10000 = var10000 > a(12984, 7134358132718119297L) ? a(12984, 7134358132718119297L) : var0;
      }

      return var10000;
   }

   @Override
   public void compose(Raster var1, Raster var2, WritableRaster var3) {
      String[] var4;
      float var7;
      float[] var9;
      float[] var10;
      float[] var11;
      label454: {
         String[] var10000 = ZH.U();
         var7 = this.r;
         var9 = null;
         var4 = var10000;
         var10 = null;
         var11 = null;
         int var47 = this.Z;
         if (var4 == null) {
            switch (this.Z) {
               case 12:
               case 13:
               case 14:
               case 15:
                  var47 = 3;
                  break;
               default:
                  break label454;
            }
         }

         var9 = new float[var47];
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

      label447:
      while (true) {
         int var48 = var18;

         label445:
         while (var48 < var17) {
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
               var48 = this.Z;
               if (var4 != null) {
                  continue label445;
               }

               int var29;
               int var30;
               int var31;
               label439: {
                  if (var4 == null) {
                     label436: {
                        label459: {
                           label460: {
                              label433: {
                                 label461: {
                                    label431: {
                                       label462: {
                                          label463: {
                                             label479: {
                                                label427: {
                                                   label465: {
                                                      switch (this.Z) {
                                                         case 1:
                                                         default:
                                                            var29 = var22 + var21;
                                                            var48 = var29;
                                                            int var10001 = a(29437, 997071911514270156L);
                                                            if (var4 == null) {
                                                               if (var29 > var10001) {
                                                                  var29 = a(12984, 7134358132718119297L);
                                                               }

                                                               var48 = var24;
                                                               var10001 = var23;
                                                            }

                                                            var30 = var48 + var10001;
                                                            var48 = var30;
                                                            var10001 = a(12984, 7134358132718119297L);
                                                            if (var4 == null) {
                                                               if (var30 > var10001) {
                                                                  var30 = a(12984, 7134358132718119297L);
                                                               }

                                                               var48 = var26;
                                                               var10001 = var25;
                                                            }

                                                            var31 = var48 + var10001;
                                                            var48 = var31;
                                                            if (var4 == null) {
                                                               if (var31 <= a(12984, 7134358132718119297L)) {
                                                                  break label439;
                                                               }

                                                               var48 = a(12984, 7134358132718119297L);
                                                            }

                                                            var31 = var48;
                                                            if (var4 == null) {
                                                               break label439;
                                                            }
                                                         case 2:
                                                            var29 = var22 - var21;
                                                            var48 = var29;
                                                            if (var4 == null) {
                                                               if (var29 < 0) {
                                                                  var29 = 0;
                                                               }

                                                               var48 = var24 - var23;
                                                            }

                                                            var30 = var48;
                                                            var48 = var30;
                                                            if (var4 == null) {
                                                               if (var30 < 0) {
                                                                  var30 = 0;
                                                               }

                                                               var48 = var26 - var25;
                                                            }

                                                            var31 = var48;
                                                            var48 = var31;
                                                            if (var4 == null) {
                                                               if (var31 >= 0) {
                                                                  break label439;
                                                               }

                                                               var48 = 0;
                                                            }

                                                            var31 = var48;
                                                            if (var4 == null) {
                                                               break label439;
                                                            }
                                                         case 3:
                                                            var29 = var22 - var21;
                                                            var48 = var29;
                                                            if (var4 == null) {
                                                               if (var29 < 0) {
                                                                  var29 = -var29;
                                                               }

                                                               var48 = var24 - var23;
                                                            }

                                                            var30 = var48;
                                                            var48 = var30;
                                                            if (var4 == null) {
                                                               if (var30 < 0) {
                                                                  var30 = -var30;
                                                               }

                                                               var48 = var26 - var25;
                                                            }

                                                            var31 = var48;
                                                            var48 = var31;
                                                            if (var4 == null) {
                                                               if (var31 >= 0) {
                                                                  break label439;
                                                               }

                                                               var48 = -var31;
                                                            }

                                                            var31 = var48;
                                                            if (var4 == null) {
                                                               break label439;
                                                            }
                                                         case 4:
                                                            int var8 = var22 * var21 + a(4396, 3356426276852861465L);
                                                            var29 = (var8 >> a(14759, 7758752785333953169L)) + var8 >> a(14759, 7758752785333953169L);
                                                            var8 = var24 * var23 + a(4396, 3356426276852861465L);
                                                            var30 = (var8 >> a(14759, 7758752785333953169L)) + var8 >> a(14759, 7758752785333953169L);
                                                            var8 = var26 * var25 + a(4396, 3356426276852861465L);
                                                            var31 = (var8 >> a(14759, 7758752785333953169L)) + var8 >> a(14759, 7758752785333953169L);
                                                            if (var4 == null) {
                                                               break label439;
                                                            }
                                                         case 8:
                                                            int var36 = (a(12984, 7134358132718119297L) - var22) * (a(12984, 7134358132718119297L) - var21)
                                                               + a(4396, 3356426276852861465L);
                                                            var29 = a(12984, 7134358132718119297L)
                                                               - ((var36 >> a(14759, 7758752785333953169L)) + var36 >> a(14759, 7758752785333953169L));
                                                            var36 = (a(12984, 7134358132718119297L) - var24) * (a(12984, 7134358132718119297L) - var23)
                                                               + a(4396, 3356426276852861465L);
                                                            var30 = a(12984, 7134358132718119297L)
                                                               - ((var36 >> a(14759, 7758752785333953169L)) + var36 >> a(14759, 7758752785333953169L));
                                                            var36 = (a(12984, 7134358132718119297L) - var26) * (a(12984, 7134358132718119297L) - var25)
                                                               + a(4396, 3356426276852861465L);
                                                            var31 = a(12984, 7134358132718119297L)
                                                               - ((var36 >> a(14759, 7758752785333953169L)) + var36 >> a(14759, 7758752785333953169L));
                                                            if (var4 == null) {
                                                               break label439;
                                                            }
                                                         case 16:
                                                            label411: {
                                                               var48 = var22;
                                                               int var87 = a(4396, 3356426276852861465L);
                                                               if (var4 == null) {
                                                                  if (var22 < var87) {
                                                                     int var39 = var22 * var21 + a(4396, 3356426276852861465L);
                                                                     var29 = 2
                                                                        * ((var39 >> a(14759, 7758752785333953169L)) + var39 >> a(14759, 7758752785333953169L));
                                                                     if (var4 == null) {
                                                                        break label411;
                                                                     }
                                                                  }

                                                                  var48 = (a(12984, 7134358132718119297L) - var22) * (a(12984, 7134358132718119297L) - var21);
                                                                  var87 = a(4396, 3356426276852861465L);
                                                               }

                                                               int var40 = var48 + var87;
                                                               var29 = 2
                                                                  * (
                                                                     a(12984, 7134358132718119297L)
                                                                        - ((var40 >> a(14759, 7758752785333953169L)) + var40 >> a(14759, 7758752785333953169L))
                                                                  );
                                                            }

                                                            label404: {
                                                               var48 = var24;
                                                               int var88 = a(4396, 3356426276852861465L);
                                                               if (var4 == null) {
                                                                  if (var24 < var88) {
                                                                     int var41 = var24 * var23 + a(4396, 3356426276852861465L);
                                                                     var30 = 2
                                                                        * ((var41 >> a(14759, 7758752785333953169L)) + var41 >> a(14759, 7758752785333953169L));
                                                                     if (var4 == null) {
                                                                        break label404;
                                                                     }
                                                                  }

                                                                  int var42 = (a(12984, 7134358132718119297L) - var24)
                                                                        * (a(12984, 7134358132718119297L) - var23)
                                                                     + a(4396, 3356426276852861465L);
                                                                  var48 = 2;
                                                                  var88 = a(12984, 7134358132718119297L)
                                                                     - ((var42 >> a(14759, 7758752785333953169L)) + var42 >> a(14759, 7758752785333953169L));
                                                               }

                                                               var30 = var48 * var88;
                                                            }

                                                            var48 = var26;
                                                            int var89 = a(4396, 3356426276852861465L);
                                                            if (var4 == null) {
                                                               if (var26 < var89) {
                                                                  int var43 = var26 * var25 + a(4396, 3356426276852861465L);
                                                                  var31 = 2
                                                                     * ((var43 >> a(14759, 7758752785333953169L)) + var43 >> a(14759, 7758752785333953169L));
                                                                  if (var4 == null) {
                                                                     break label439;
                                                                  }
                                                               }

                                                               int var44 = (a(12984, 7134358132718119297L) - var26) * (a(12984, 7134358132718119297L) - var25)
                                                                  + a(4396, 3356426276852861465L);
                                                               var48 = 2;
                                                               var89 = a(12984, 7134358132718119297L)
                                                                  - ((var44 >> a(14759, 7758752785333953169L)) + var44 >> a(14759, 7758752785333953169L));
                                                            }

                                                            var31 = var48 * var89;
                                                            if (var4 == null) {
                                                               break label439;
                                                            }
                                                         case 5:
                                                            var48 = var22;
                                                            if (var4 == null) {
                                                               var48 = var22 < var21 ? var22 : var21;
                                                            }

                                                            var29 = var48;
                                                            var48 = var24;
                                                            if (var4 == null) {
                                                               var48 = var24 < var23 ? var24 : var23;
                                                            }

                                                            var30 = var48;
                                                            var48 = var26;
                                                            if (var4 == null) {
                                                               var48 = var26 < var25 ? var26 : var25;
                                                            }

                                                            var31 = var48;
                                                            if (var4 == null) {
                                                               break label439;
                                                            }
                                                            break;
                                                         case 6:
                                                            break label479;
                                                         case 7:
                                                            break label463;
                                                         case 9:
                                                            break;
                                                         case 10:
                                                            break label462;
                                                         case 11:
                                                            break label431;
                                                         case 12:
                                                         case 13:
                                                         case 14:
                                                         case 15:
                                                            break label427;
                                                         case 17:
                                                            break label461;
                                                         case 18:
                                                            break label433;
                                                         case 19:
                                                            break label460;
                                                         case 20:
                                                            break label459;
                                                         case 21:
                                                            break label436;
                                                         case 22:
                                                            break label465;
                                                      }

                                                      var48 = var22;
                                                      if (var4 == null) {
                                                         var48 = var22 > var21 ? var22 : var21;
                                                      }

                                                      var29 = var48;
                                                      var48 = var24;
                                                      if (var4 == null) {
                                                         var48 = var24 > var23 ? var24 : var23;
                                                      }

                                                      var30 = var48;
                                                      var48 = var26;
                                                      if (var4 == null) {
                                                         var48 = var26 > var25 ? var26 : var25;
                                                      }

                                                      var31 = var48;
                                                      if (var4 == null) {
                                                         break label439;
                                                      }
                                                   }

                                                   var29 = (var22 + var21) / 2;
                                                   var30 = (var24 + var23) / 2;
                                                   var31 = (var26 + var25) / 2;
                                                   if (var4 == null) {
                                                      break label439;
                                                   }
                                                }

                                                Color.RGBtoHSB(var21, var23, var25, var9);
                                                Color.RGBtoHSB(var22, var24, var26, var10);
                                                var48 = this.Z;
                                                if (var4 == null) {
                                                   switch (this.Z) {
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

                                                   var48 = Color.HSBtoRGB(var11[0], var11[1], var11[2]);
                                                }

                                                int var32 = var48;
                                                var29 = (var32 & a(22376, 4277891706952240210L)) >> a(15578, 2293525694340671464L);
                                                var30 = (var32 & a(7115, 5540741876664041719L)) >> a(14759, 7758752785333953169L);
                                                var31 = var32 & a(12984, 7134358132718119297L);
                                                if (var4 == null) {
                                                   break label439;
                                                }
                                             }

                                             label381: {
                                                var48 = var22;
                                                if (var4 == null) {
                                                   if (var22 != a(12984, 7134358132718119297L)) {
                                                      var29 = F(
                                                         a(12984, 7134358132718119297L)
                                                            - (a(12984, 7134358132718119297L) - var21 << a(14759, 7758752785333953169L)) / (var22 + 1)
                                                      );
                                                      if (var4 == null) {
                                                         break label381;
                                                      }
                                                   }

                                                   var48 = var21;
                                                }

                                                var29 = var48;
                                             }

                                             label374: {
                                                var48 = var24;
                                                if (var4 == null) {
                                                   if (var24 != a(12984, 7134358132718119297L)) {
                                                      var30 = F(
                                                         a(12984, 7134358132718119297L)
                                                            - (a(12984, 7134358132718119297L) - var23 << a(14759, 7758752785333953169L)) / (var24 + 1)
                                                      );
                                                      if (var4 == null) {
                                                         break label374;
                                                      }
                                                   }

                                                   var48 = var23;
                                                }

                                                var30 = var48;
                                             }

                                             var48 = var26;
                                             if (var4 == null) {
                                                if (var26 != a(12984, 7134358132718119297L)) {
                                                   var31 = F(
                                                      a(12984, 7134358132718119297L)
                                                         - (a(12984, 7134358132718119297L) - var25 << a(14759, 7758752785333953169L)) / (var26 + 1)
                                                   );
                                                   if (var4 == null) {
                                                      break label439;
                                                   }
                                                }

                                                var48 = var25;
                                             }

                                             var31 = var48;
                                             if (var4 == null) {
                                                break label439;
                                             }
                                          }

                                          label366: {
                                             var48 = var21;
                                             if (var4 == null) {
                                                if (var21 != 0) {
                                                   var29 = Math.max(
                                                      a(12984, 7134358132718119297L)
                                                         - (a(12984, 7134358132718119297L) - var22 << a(14759, 7758752785333953169L)) / var21,
                                                      0
                                                   );
                                                   if (var4 == null) {
                                                      break label366;
                                                   }
                                                }

                                                var48 = var21;
                                             }

                                             var29 = var48;
                                          }

                                          label359: {
                                             var48 = var23;
                                             if (var4 == null) {
                                                if (var23 != 0) {
                                                   var30 = Math.max(
                                                      a(12984, 7134358132718119297L)
                                                         - (a(12984, 7134358132718119297L) - var24 << a(14759, 7758752785333953169L)) / var23,
                                                      0
                                                   );
                                                   if (var4 == null) {
                                                      break label359;
                                                   }
                                                }

                                                var48 = var23;
                                             }

                                             var30 = var48;
                                          }

                                          var48 = var25;
                                          if (var4 == null) {
                                             if (var25 != 0) {
                                                var31 = Math.max(
                                                   a(12984, 7134358132718119297L)
                                                      - (a(12984, 7134358132718119297L) - var26 << a(14759, 7758752785333953169L)) / var25,
                                                   0
                                                );
                                                if (var4 == null) {
                                                   break label439;
                                                }
                                             }

                                             var48 = var25;
                                          }

                                          var31 = var48;
                                          if (var4 == null) {
                                             break label439;
                                          }
                                       }

                                       var29 = F((var21 << a(14759, 7758752785333953169L)) / (a(23090, 8017619252607500550L) - var22));
                                       var30 = F((var23 << a(14759, 7758752785333953169L)) / (a(13378, 1490625129416535921L) - var24));
                                       var31 = F((var25 << a(14759, 7758752785333953169L)) / (a(13378, 1490625129416535921L) - var26));
                                       if (var4 == null) {
                                          break label439;
                                       }
                                    }

                                    label350: {
                                       var48 = var21;
                                       if (var4 == null) {
                                          if (var21 != a(12984, 7134358132718119297L)) {
                                             var29 = Math.min(
                                                (var22 << a(14759, 7758752785333953169L)) / (a(12984, 7134358132718119297L) - var21),
                                                a(12984, 7134358132718119297L)
                                             );
                                             if (var4 == null) {
                                                break label350;
                                             }
                                          }

                                          var48 = var21;
                                       }

                                       var29 = var48;
                                    }

                                    label343: {
                                       var48 = var23;
                                       if (var4 == null) {
                                          if (var23 != a(12984, 7134358132718119297L)) {
                                             var30 = Math.min(
                                                (var24 << a(14759, 7758752785333953169L)) / (a(12984, 7134358132718119297L) - var23),
                                                a(12984, 7134358132718119297L)
                                             );
                                             if (var4 == null) {
                                                break label343;
                                             }
                                          }

                                          var48 = var23;
                                       }

                                       var30 = var48;
                                    }

                                    var48 = var25;
                                    if (var4 == null) {
                                       if (var25 != a(12984, 7134358132718119297L)) {
                                          var31 = Math.min(
                                             (var26 << a(14759, 7758752785333953169L)) / (a(12984, 7134358132718119297L) - var25),
                                             a(12984, 7134358132718119297L)
                                          );
                                          if (var4 == null) {
                                             break label439;
                                          }
                                       }

                                       var48 = var25;
                                    }

                                    var31 = var48;
                                    if (var4 == null) {
                                       break label439;
                                    }
                                 }

                                 int var33 = N(var21, var22);
                                 var29 = var33
                                    + N(
                                       var22,
                                       a(12984, 7134358132718119297L)
                                          - N(a(12984, 7134358132718119297L) - var22, a(12984, 7134358132718119297L) - var21)
                                          - var33
                                    );
                                 var33 = N(var23, var24);
                                 var30 = var33
                                    + N(
                                       var24,
                                       a(12984, 7134358132718119297L)
                                          - N(a(12984, 7134358132718119297L) - var24, a(12984, 7134358132718119297L) - var23)
                                          - var33
                                    );
                                 var33 = N(var25, var26);
                                 var31 = var33
                                    + N(
                                       var26,
                                       a(12984, 7134358132718119297L)
                                          - N(a(12984, 7134358132718119297L) - var26, a(12984, 7134358132718119297L) - var25)
                                          - var33
                                    );
                                 if (var4 == null) {
                                    break label439;
                                 }
                              }

                              label334: {
                                 var48 = var21;
                                 int var90 = a(10393, 751541795149951906L);
                                 if (var4 == null) {
                                    if (var21 > var90) {
                                       var29 = a(12984, 7134358132718119297L)
                                          - 2 * N(a(12984, 7134358132718119297L) - var21, a(12984, 7134358132718119297L) - var22);
                                       if (var4 == null) {
                                          break label334;
                                       }
                                    }

                                    var48 = 2;
                                    var90 = N(var21, var22);
                                 }

                                 var29 = var48 * var90;
                              }

                              label327: {
                                 var48 = var23;
                                 int var91 = a(3883, 5284251878967120924L);
                                 if (var4 == null) {
                                    if (var23 > var91) {
                                       var30 = a(12984, 7134358132718119297L)
                                          - 2 * N(a(12984, 7134358132718119297L) - var23, a(12984, 7134358132718119297L) - var24);
                                       if (var4 == null) {
                                          break label327;
                                       }
                                    }

                                    var48 = 2;
                                    var91 = N(var23, var24);
                                 }

                                 var30 = var48 * var91;
                              }

                              var48 = var25;
                              int var92 = a(3883, 5284251878967120924L);
                              if (var4 == null) {
                                 if (var25 > var92) {
                                    var31 = a(12984, 7134358132718119297L)
                                       - 2 * N(a(12984, 7134358132718119297L) - var25, a(12984, 7134358132718119297L) - var26);
                                    if (var4 == null) {
                                       break label439;
                                    }
                                 }

                                 var48 = 2;
                                 var92 = N(var25, var26);
                              }

                              var31 = var48 * var92;
                              if (var4 == null) {
                                 break label439;
                              }
                           }

                           label319: {
                              var48 = var21;
                              int var93 = a(3883, 5284251878967120924L);
                              if (var4 == null) {
                                 if (var21 > var93) {
                                    var48 = Math.max(var21, var22);
                                    break label319;
                                 }

                                 var48 = var21;
                                 var93 = var22;
                              }

                              var48 = Math.min(var48, var93);
                           }

                           label313: {
                              var29 = var48;
                              var48 = var23;
                              int var94 = a(3883, 5284251878967120924L);
                              if (var4 == null) {
                                 if (var23 > var94) {
                                    var48 = Math.max(var23, var24);
                                    break label313;
                                 }

                                 var48 = var23;
                                 var94 = var24;
                              }

                              var48 = Math.min(var48, var94);
                           }

                           label307: {
                              var30 = var48;
                              var48 = var25;
                              int var95 = a(3883, 5284251878967120924L);
                              if (var4 == null) {
                                 if (var25 > var95) {
                                    var48 = Math.max(var25, var26);
                                    break label307;
                                 }

                                 var48 = var25;
                                 var95 = var26;
                              }

                              var48 = Math.min(var48, var95);
                           }

                           var31 = var48;
                           if (var4 == null) {
                              break label439;
                           }
                        }

                        var29 = var22 + N(var21, a(12984, 7134358132718119297L) - var22 - var22);
                        var30 = var24 + N(var23, a(12984, 7134358132718119297L) - var24 - var24);
                        var31 = var26 + N(var25, a(12984, 7134358132718119297L) - var26 - var26);
                        if (var4 == null) {
                           break label439;
                        }
                     }

                     var48 = a(12984, 7134358132718119297L) - Math.abs(a(12984, 7134358132718119297L) - var21 - var22);
                  }

                  var29 = var48;
                  var30 = a(12984, 7134358132718119297L) - Math.abs(a(12984, 7134358132718119297L) - var23 - var24);
                  var31 = a(12984, 7134358132718119297L) - Math.abs(a(12984, 7134358132718119297L) - var25 - var26);
               }

               float var5 = var7 * (float)var27 / 255.0F;
               float var6 = 1.0F - var5;
               var13[var19] = (int)(var5 * (float)var29 + var6 * (float)var22);
               var13[var19 + 1] = (int)(var5 * (float)var30 + var6 * (float)var24);
               var13[var19 + 2] = (int)(var5 * (float)var31 + var6 * (float)var26);
               var13[var19 + 3] = (int)((float)var27 * var7 + (float)var28 * var6);
               var19 += 4;
               if (var4 != null) {
                  break;
               }
            }

            var3.setPixels(var14, var18, var15, 1, var13);
            var18++;
            if (var4 != null) {
               return;
            }
            continue label447;
         }

         return;
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6960;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5308245096215264302L;
      long[] var6 = new long[13];
      int var3 = 0;
      String var4 = "¼oÖ¶É\u0006ÞZÓ\u0093\bê\u0081ÍU\u001d\u001a\t\u008dôÊö\u009bÖªb\u001dG8º\u0012_Záy[D\u009e|(ÊÁjb\u0006\u0004¶·\u000f\u001aÛ0\u0099y\u009e·\u0001ãLtY\u0018(M|4;¾ h=Z\u0001ªÐ\u0092u\u008b\u0095P§ÔÄtð\u001bð|";
      int var5 = "¼oÖ¶É\u0006ÞZÓ\u0093\bê\u0081ÍU\u001d\u001a\t\u008dôÊö\u009bÖªb\u001dG8º\u0012_Záy[D\u009e|(ÊÁjb\u0006\u0004¶·\u000f\u001aÛ0\u0099y\u009e·\u0001ãLtY\u0018(M|4;¾ h=Z\u0001ªÐ\u0092u\u008b\u0095P§ÔÄtð\u001bð|"
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

                  var4 = "áEK\f\u0089[\u000fóÁIî\u008c\u001a/CÙ";
                  var5 = "áEK\f\u0089[\u000fóÁIî\u008c\u001a/CÙ".length();
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
}





