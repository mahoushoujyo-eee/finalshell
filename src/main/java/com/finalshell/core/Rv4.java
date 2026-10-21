package com.finalshell.core;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;

public final class Rv4 {
   public static Rectangle Q(List var0) {
      String var1 = FV_2.D();
      List var10000 = var0;
      if (var1 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      if (var1 != null) {
         return t(var10000.toArray(new Point[var0.size()]));
      } else {
         return var10000.size() > 0 ? t(var0.toArray(new Point[var0.size()])) : null;
      }
   }

   public static Rectangle t(Point[] var0) {
      String var1 = FV_2.D();
      Point[] var10000 = var0;
      if (var1 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      if (var10000.length > 0) {
         Rectangle var2 = new Rectangle(var0[0], new Dimension(0, 0));
         int var3 = 1;

         while (true) {
            if (var3 < var0.length) {
               Point var4 = var0[var3];
               var7 = var4.x;
               if (var1 != null) {
                  break;
               }

               int var10001;
               label75: {
                  label92: {
                     var10001 = var2.x;
                     if (var1 == null) {
                        if (var4.x < var2.x) {
                           int var5 = var2.x - var4.x;
                           var2.x = var4.x;
                           var2.width += var5;
                           if (var1 == null) {
                              break label92;
                           }
                        }

                        var7 = var2.x + var2.width;
                        var10001 = var4.x;
                     }

                     if (var1 != null) {
                        break label75;
                     }

                     if (var7 < var10001) {
                        var2.width = var4.x - var2.x;
                     }
                  }

                  var7 = var4.y;
                  var10001 = var2.y;
               }

               label64: {
                  label93: {
                     if (var1 == null) {
                        if (var7 < var10001) {
                           int var6 = var2.y - var4.y;
                           var2.y = var4.y;
                           var2.height += var6;
                           if (var1 == null) {
      Rectangle var8;
      Rectangle var8;
                              break label64;
                           }
                        }

                        var8 = var2;
                        if (var1 != null) {
                           break label93;
                        }

                        var7 = var2.y + var2.height;
                        var10001 = var4.y;
                     }

                     if (var7 >= var10001) {
                        break label64;
                     }

                     var8 = var2;
                  }

                  var8.height = var4.y - var2.y;
               }

               var3++;
               if (var1 == null) {
                  continue;
               }
            }

            var7 = var2.width;
            break;
         }

         if (var1 == null) {
            if (var7 == 0) {
               var2.width = 1;
            }

            if (var1 != null) {
               return var2;
            }

            var7 = var2.height;
         }

         if (var7 == 0) {
            var2.height = 1;
         }

         return var2;
      } else {
         return null;
      }
   }

   public static Rectangle E(Rectangle[] var0) {
      String var1 = FV_2.D();
      Rectangle var10000 = var0;
      if (var1 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      if (var1 == null) {
         if (((Object[])var10000).length <= 0) {
            return null;
         }

         var10000 = var0;
      }

      Rectangle var2 = ((Object[])var10000)[0];
      int var3 = 1;

      while (true) {
         if (var3 < var0.length) {
            var10000 = B(var2, var0[var3]);
            if (var1 != null) {
               break;
            }

            var2 = var10000;
            var3++;
            if (var1 == null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   public static Rectangle B(Rectangle var0, Rectangle var1) {
      String var2;
      Rectangle var10000;
      var2 = FV_2.D();
      var10000 = var0;
      label45:
      if (var2 == null) {
         if (var0 == null) {
            var10000 = var1;
            if (var2 != null) {
               break label45;
            }

            if (var1 != null) {
               return var1;
            }
         }

         var10000 = var1;
      }

      label38:
      if (var2 == null) {
         if (var10000 == null) {
            var10000 = var0;
            if (var2 != null) {
               break label38;
            }

            if (var0 != null) {
               return var0;
            }
         }

         var10000 = var0;
      }

      label31:
      if (var2 == null) {
         if (var10000 == null) {
            var10000 = var1;
            if (var2 != null) {
               break label31;
            }

            if (var1 == null) {
               return null;
            }
         }

         var10000 = var0;
      }

      int var3 = Math.min(var10000.x, var1.x);
      int var4 = Math.min(var0.y, var1.y);
      int var5 = Math.max(var0.x + var0.width, var1.x + var1.width);
      int var6 = Math.max(var0.y + var0.height, var1.y + var1.height);
      return new Rectangle(var3, var4, var5 - var3, var6 - var4);
   }

   public static Rectangle q(Rectangle var0) {
      String var1;
      int var10000;
      var1 = FV_2.D();
      var10000 = var0.width;
      label33:
      if (var1 == null) {
         if (var0.width >= 0) {
            var10000 = var0.height;
            if (var1 != null) {
               break label33;
            }

            if (var0.height >= 0) {
               return var0;
            }
         }

         var10000 = var0.x;
      }

      int var2 = var10000;
      int var3 = Math.abs(var0.width);
      var10000 = var0.width;
      if (var1 == null) {
         if (var0.width < 0) {
            var2 -= var3;
         }

         var10000 = var0.y;
      }

      int var4 = var10000;
      int var5 = Math.abs(var0.height);
      Rectangle var7 = var0;
      if (var1 == null) {
         if (var0.height < 0) {
            var4 -= var5;
         }

         var7 = new Rectangle(var2, var4, var3, var5);
      }

      return var7;
   }

   public static Point s(Rectangle var0) {
      return new Point(var0.x + var0.width / 2, var0.y + var0.height / 2);
   }

   public static Point x(Point var0, Point var1) {
      return new Point((var0.x + var1.x) / 2, (var0.y + var1.y) / 2);
   }

   public static Point p(int var0, int var1, int var2, int var3) {
      return new Point((var0 + var2) / 2, (var1 + var3) / 2);
   }

   public static Rectangle u(Rectangle var0, int var1) {
      return i(var0, var1, var1, var1, var1);
   }

   public static Rectangle i(Rectangle var0, int var1, int var2, int var3, int var4) {
      return new Rectangle(var0.x - var2, var0.y - var1, var0.width + var2 + var4, var0.height + var1 + var3);
   }

   public static Point n(Point var0, int var1, int var2) {
      return new Point(var0.x + var1, var0.y + var2);
   }

   public static double i(Point var0, Point var1) {
      return U(var0.x, var0.y, var1.x, var1.y);
   }

   public static double U(int var0, int var1, int var2, int var3) {
      double var4 = Math.asin((double)(var3 - var1) / Math.sqrt((double)(Gw2.t(var2 - var0) + Gw2.t(var3 - var1))));
      return var0 > var2 ? -var4 - Math.PI : var4;
   }

   public static Point N(Rectangle var0, Point var1) {
      String var2;
      Point var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var16;
      int var10001;
      label91: {
         label94: {
            var3 = s(var0);
            var4 = var3.x;
            String var10000 = FV_2.D();
            var5 = var3.y;
            var2 = var10000;
            var6 = var1.x;
            var7 = var1.y;
            var16 = var6;
            var10001 = var0.x;
            if (var2 == null) {
               if (var6 < var0.x) {
                  label85: {
                     int var8 = var0.x;
                     int var9 = (var4 * (var7 - var5) - var5 * (var6 - var4) - var8 * (var7 - var5)) / (var4 - var6);
                     var16 = var9;
                     var10001 = var0.y;
                     if (var2 == null) {
                        if (var9 < var0.y) {
                           break label85;
                        }

                        var16 = var9;
                        var10001 = var0.y + var0.height;
                     }

                     if (var16 <= var10001) {
                        return new Point(var8, var9);
                     }
                  }

                  if (var2 == null) {
                     break label94;
                  }
               }

               var16 = var6;
               var10001 = var0.x + var0.width;
            }

            if (var2 != null) {
               break label91;
            }

            if (var16 > var10001) {
               int var10 = var0.x + var0.width;
               int var13 = (var4 * (var7 - var5) - var5 * (var6 - var4) - var10 * (var7 - var5)) / (var4 - var6);
               var16 = var13;
               var10001 = var0.y;
               if (var2 != null) {
                  break label91;
               }

               if (var13 >= var0.y) {
                  var16 = var13;
                  var10001 = var0.y + var0.height;
                  if (var2 != null) {
                     break label91;
                  }

                  if (var13 <= var10001) {
                     return new Point(var10, var13);
                  }
               }
            }
         }

         var16 = var7;
         var10001 = var0.y;
      }

      if (var2 == null) {
         if (var16 < var10001) {
            label61: {
               int var11 = var0.y;
               int var14 = (var4 * (var7 - var5) - var5 * (var6 - var4) - var11 * (var4 - var6)) / (var7 - var5);
               var16 = var14;
               var10001 = var0.x;
               if (var2 == null) {
                  if (var14 < var0.x) {
                     break label61;
                  }

                  var16 = var14;
                  var10001 = var0.x + var0.width;
               }

               if (var16 <= var10001) {
                  return new Point(var14, var11);
               }
            }

            if (var2 == null) {
               return var3;
            }
         }

         var16 = var7;
         var10001 = var0.y + var0.height;
      }

      if (var2 == null) {
         if (var16 <= var10001) {
            return var3;
         }

         var16 = var0.y;
         var10001 = var0.height;
      }

      int var12 = var16 + var10001;
      int var15 = (var4 * (var7 - var5) - var5 * (var6 - var4) - var12 * (var4 - var6)) / (var7 - var5);
      var16 = var15;
      var10001 = var0.x;
      if (var2 == null) {
         if (var15 < var0.x) {
            return var3;
         }

         var16 = var15;
         var10001 = var0.x + var0.width;
      }

      return var16 <= var10001 ? new Point(var15, var12) : var3;
   }

   public static double l(double var0) {
      return var0 * Math.PI / 180.0;
   }

   public static double p(double var0) {
      return var0 * 180.0 / Math.PI;
   }
}






