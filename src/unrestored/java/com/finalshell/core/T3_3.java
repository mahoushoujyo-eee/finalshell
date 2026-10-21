package com.finalshell.core;

import com.finalshell.ui.model.QE;
import com.finalshell.ui.panel.QY;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;

public class T3_3 extends T4 {
   public static long a;

   @Override
   public void layoutContainer(Container var1) {
      int[] var2;
      QY var3;
      float var4;
      QE var7;
      label28: {
         var3 = (QY)var1;
         int[] var10000 = com.finalshell.ui.panel.E2.P();
         var4 = Gw2.d(var3.u());
         var2 = var10000;
         QY var6 = var3;
         if (var2 == null) {
            if (!var3.k()) {
               var7 = var3.t();
               break label28;
            }

            var6 = var3;
         }

         var7 = var6.H();
      }

      QE var5;
      label21: {
         var5 = var7;
         if (var2 == null) {
            if (!var5.l()) {
               break label21;
            }

            this.R(var3, var4, var5);
         }

         if (var2 == null) {
            return;
         }
      }

      this.e(var3, var4, var5);
   }

   public void e(QY var1, float var2, QE var3) {
      int[] var10000 = com.finalshell.ui.panel.E2.P();
      Dimension var5 = FN.P(var1.getComponents());
      int var6 = var1.getComponentCount();
      int[] var4 = var10000;
      int var10 = WN3.Z[var3.ordinal()];
      if (var4 == null) {
         switch (var10) {
            case 1:
               boolean var11 = false;
               break;
            default:
               return;
         }
      }

      int var8 = 0;
      int var9 = 0;

      while (var9 < var6) {
         this.l(var1, var9, 0, var8);
         var8 = (int)((float)var8 + (float)var5.height * var2);
         var9++;
         if (var4 != null) {
            break;
         }
      }
   }

   public void l(QY var1, int var2, int var3, int var4) {
      Component var5 = var1.getComponent(var2);
      Dimension var6 = var5.getPreferredSize();
      var5.setBounds(var3, var4, var6.width, var6.height);
   }

   public void R(QY var1, float var2, QE var3) {
      int var46;
      int[] var10000 = com.finalshell.ui.panel.E2.P();
      Dimension var5 = FN.P(var1.getComponents());
      Point var6 = new Point(var1.v(), var1.v());
      int var7 = Math.max(var5.width, var5.height);
      int[] var4 = var10000;
      int var8 = var1.u();
      int var43 = var8;
      if (var4 == null) {
         var43 = var8 != -1 ? var8 : 0;
      }

      int var9 = var43;
      int var10 = var1.v() - var7 / 2;
      double var11 = this.b(var1);
      double var13 = this.X(var1);
      int var44 = (var1.C()) ? 1 : 0;
      if (var4 == null) {
         var44 = var44 != 0 ? 1 : -1;
      }

      int var15;
      int var16;
      label129: {
         var15 = var44;
         var16 = var1.getComponentCount();
         switch (WN3.Z[var3.ordinal()]) {
            case 2:
               double var17 = (double)var2 * var11;
               int var19 = 0;

               while (var19 < var16) {
                  int var20 = var9 + var19;
                  if (var4 != null) {
                     return;
                  }

                  label111: {
                     int var45 = var20;
                     int var10001 = var16;
                     if (var4 == null) {
                        if (var20 < var16) {
                           var46 = var20;
                           break label111;
                        }

                        var45 = var20;
                        var10001 = var16;
                     }

                     var46 = var45 - var10001;
                  }

                  int var21 = var46;
                  double var22 = var13 + (double)var9 * var11 + var17 * (double)var19 * (double)var15;
                  int var24 = (int)Math.round((double)var6.x + (double)var10 * Math.cos(var22));
                  int var25 = (int)Math.round((double)var6.y + (double)var10 * Math.sin(var22));
                  this.y(var1, var21, var24, var25);
                  var19++;
                  if (var4 != null) {
                     break;
                  }
               }

               if (var4 == null) {
                  return;
               }
            case 3:
               int var29 = Math.round((float)var10 * var2);
               int var18 = 0;

               while (var18 < var16) {
                  double var34 = var13 + var11 * (double)var18 * (double)var15;
                  if (var4 != null) {
                     return;
                  }

                  int var47 = var18;
                  if (var4 == null) {
                     var47 = var18 == var8 ? var10 : var29;
                  }

                  int var37 = var47;
                  int var40 = (int)Math.round((double)var6.x + (double)var37 * Math.cos(var34));
                  int var23 = (int)Math.round((double)var6.y + (double)var37 * Math.sin(var34));
                  this.y(var1, var18, var40, var23);
                  var18++;
                  if (var4 != null) {
                     break;
                  }
               }

               if (var4 == null) {
                  return;
               }
            case 4:
               break;
            case 5:
               break label129;
            default:
               return;
         }

         int var30 = Math.round((float)var10 * var2);
         int var48 = var1.q();
         if (var4 == null) {
            var48 = var48 != 0 ? -1 : 1;
         }

         int var32 = var48;
         double var35 = Rv4.l((double)((float)(var32 * (int)a) * (1.0F - var2)));
         int var38 = 0;

         while (var38 < var16) {
            if (var4 != null) {
               return;
            }

            double var41 = var38 == var8 ? 0.0 : var35;
            double var42 = var13 + (var11 * (double)var38 + var41) * (double)var15;
            int var49 = var38;
            if (var4 == null) {
               var49 = var38 == var8 ? var10 : var30;
            }

            int var26 = var49;
            int var27 = (int)Math.round((double)var6.x + (double)var26 * Math.cos(var42));
            int var28 = (int)Math.round((double)var6.y + (double)var26 * Math.sin(var42));
            this.y(var1, var38, var27, var28);
            var38++;
            if (var4 != null) {
               break;
            }
         }

         if (var4 == null) {
            return;
         }
      }

      int var31 = 0;

      while (var31 < var16) {
         double var33 = var13 + var11 * (double)var31 * (double)var15;
         int var36 = (int)Math.round((double)var6.x + (double)var10 * Math.cos(var33));
         int var39 = (int)Math.round((double)var6.y + (double)var10 * Math.sin(var33));
         this.y(var1, var31, var36, var39);
         var31++;
         if (var4 != null) {
            break;
         }
      }
   }

   public double b(QY var1) {
      int[] var10000 = com.finalshell.ui.panel.E2.P();
      double var3 = Rv4.l(Math.min(var1.a(), 360.0));
      int[] var2 = var10000;
      double var5 = var3;
      double var10001 = Math.PI * 2;
      if (var2 == null) {
         if (var3 < Math.PI * 2) {
            return var3 / (double)(var1.getComponentCount() - 1);
         }

         var5 = var3;
         var10001 = (double)var1.getComponentCount();
      }

      return var5 / var10001;
   }

   public double X(QY var1) {
      return Rv4.l(var1.V()) - (Math.PI / 2);
   }

   public double r(QY var1, int var2) {
      int[] var3 = com.finalshell.ui.panel.E2.P();
      int var10000 = (var1.C()) ? 1 : 0;
      if (var3 == null) {
         var10000 = var10000 != 0 ? 1 : -1;
      }

      int var4 = var10000;
      switch (WN3.Z[var1.t().ordinal()]) {
         case 2:
         case 3:
         case 4:
         case 5:
         default:
            double var5 = this.X(var1);
            double var7 = this.b(var1);
            return var5 + var7 * (double)var2 * (double)var4;
      }
   }

   public void y(QY var1, int var2, int var3, int var4) {
      Component var5 = var1.getComponent(var2);
      Dimension var6 = var5.getPreferredSize();
      var5.setBounds(var3 - var6.width / 2, var4 - var6.height / 2, var6.width, var6.height);
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      int[] var10000 = com.finalshell.ui.panel.E2.P();
      QY var3 = (QY)var1;
      int[] var2 = var10000;
      int var7 = WN3.Z[var3.t().ordinal()];
      if (var2 == null) {
         switch (var7) {
            case 1:
               Dimension var6 = FN.P(var3.getComponents());
               int var5 = var3.getComponentCount();
               return new Dimension(var6.width, var6.height * var5);
            case 2:
            case 3:
            case 4:
            case 5:
               var7 = var3.v();
               break;
            default:
               return new Dimension(0, 0);
         }
      }

      int var4 = var7;
      return new Dimension(var4 * 2, var4 * 2);
   }

   public Point r(QY var1, int var2, int var3) {
      switch (WN3.Z[var1.t().ordinal()]) {
         case 1:
         default:
            return new Point(var2, var3);
         case 2:
         case 3:
         case 4:
         case 5:
            Dimension var4 = this.preferredLayoutSize(var1);
            return new Point(var2 - var4.width / 2, var3 - var4.height / 2);
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5773783133856348037L;
      long var10002 = -6125545393185474593L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





