package com;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.SwingConstants;

public final class CJ implements SwingConstants {
   private static final long a;

   public static void O(List var0, Rectangle var1) {
      com.ky_4[] var2;
      int var3;
      int var24;
      com.ky_4[] var10000 = com.QQ.N();
      var3 = com.lq_4.r();
      var2 = var10000;
      var24 = var3;
      label176:
      if (var2 == null) {
         if (var3 != 4) {
            var24 = var3;
            if (var2 != null) {
               break label176;
            }

            if (var3 != 2) {
               var24 = 0;
               break label176;
            }
         }

         var24 = 1;
      }

      int var4;
      var4 = var24;
      var24 = var3;
      label168:
      if (var2 == null) {
         if (var3 != 4) {
            var24 = var3;
            if (var2 != null) {
               break label168;
            }

            if (var3 != (int)a) {
               var24 = 0;
               break label168;
            }
         }

         var24 = 1;
      }

      int var5;
      int var6;
      Insets var7;
      int var8;
      byte var9;
      int var10;
      int var11;
      int var12;
      label159: {
         var5 = var24;
         var6 = com.lq_4.E() == com.cG_3.flow ? 1 : 0;
         var7 = com.lq_4.L();
         var8 = com.lq_4.J();
         var9 = com.lq_4.d();
         var10 = com.lq_4.S();
         var11 = 0;
         var12 = 0;
         var24 = var4;
         if (var2 == null) {
            if (var4 != 0) {
               var24 = var1.x + var1.width - var7.right;
               break label159;
            }

            var24 = var1.x;
         }

         var24 += var7.left;
      }

      int var13;
      label153: {
         var13 = var24;
         var24 = var5;
         if (var2 == null) {
            if (var5 != 0) {
               var24 = var1.y + var1.height - var7.bottom;
               break label153;
            }

            var24 = var1.y;
         }

         var24 += var7.top;
      }

      int var14 = var24;
      int var15 = var14;
      int var16 = 0;

      for (Component var18 : var0) {
         Dimension var19;
         label143: {
            label180: {
               label181: {
                  var19 = var18.getPreferredSize();
                  var24 = var5;
                  if (var2 == null) {
                     if (var5 != 0) {
                        var24 = var15 - var19.height;
                        if (var2 != null) {
                           break label143;
                        }

                        if (var24 >= var1.y) {
                           break label180;
                        }
                        break label181;
                     }

                     var24 = var15 + var19.height;
                  }

                  if (var2 != null) {
                     break label143;
                  }

                  if (var24 <= var1.height) {
                     break label180;
                  }
               }

               var24 = var9;
               if (var2 == null) {
                  var24 = var9 != 0 ? Math.max(1, var12) : 1;
               }

               label129: {
                  int var20 = var24;
                  var15 = var14;
                  var24 = var4;
                  if (var2 == null) {
                     if (var4 != 0) {
                        var24 = var13 - var11 - var8 * var20;
                        break label129;
                     }

                     var24 = var13 + var11;
                  }

                  var24 += var8;
               }

               var13 = var24;
               var11 = 0;
               var12 = 0;
               var16 = 0;
            }

            var24 = var9;
         }

         if (var2 == null) {
            var24 = var24 != 0 ? var8 * var16 : 0;
         }

         label119: {
            int var23 = var24;
            var24 = var4;
            if (var2 == null) {
               if (var4 != 0) {
                  var24 = var13 - var19.width - var23;
                  break label119;
               }

               var24 = var13;
            }

            var24 += var23;
         }

         int var21 = var24;
         var24 = var5;
         if (var2 == null) {
            var24 = var5 != 0 ? var15 - var19.height : var15;
         }

         int var22 = var24;
         var18.setBounds(var21, var22, var19.width, var19.height);
         var11 = Math.max(var11, var19.width);
         int var10001 = var5;
         if (var2 == null) {
            var10001 = var5 != 0 ? -1 : 1;
         }

         int var10002 = var6;
         if (var2 == null) {
            var10002 = var6 != 0 ? var19.height + var8 : var8;
         }

         label182: {
            var15 += var10001 * var10002;
            var24 = var9;
            if (var2 == null) {
               if (var9 == 0) {
                  break label182;
               }

               var12 = Math.max(var12, ++var16);
               var24 = var16;
            }

            if (var2 == null) {
               if (var24 <= var10 - 1) {
                  break label182;
               }

               var24 = 0;
            }

            var16 = var24;
         }

         if (var2 != null) {
            break;
         }
      }
   }

   static {
      long var0 = 7515830705333562458L;
      long var10002 = 7146983977719524444L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





