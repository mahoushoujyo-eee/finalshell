package com.finalshell.core;

import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.Graphics2D;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class Ep2 implements Lf2 {
   int o;
   final Graphics2D W;
   final SetBackgroundImagePanel p;
   public static long a;

   Ep2(SetBackgroundImagePanel var1, Graphics2D var2) {
      this.p = var1;
      this.W = var2;
      this.o = this.p.U$int();
   }

   @Override
   public void N(int var1, int var2, @NotNull YP var3, @NotNull com.finalshell.ui.model.J2 var4, int var5) {
      int var6;
      int var7;
      SetBackgroundImagePanel var19;
      int var10000 = ConnectionProperty.y();
      var7 = var2 - var5;
      var6 = var10000;
      SetBackgroundImagePanel.G(this.p, var1, var7, var3, var4, this.W);
      var19 = this.p;
      label63:
      if (var6 == 0) {
         if (SetBackgroundImagePanel.o(this.p) != null) {
            var19 = this.p;
            if (var6 != 0) {
               break label63;
            }

            List var8 = SetBackgroundImagePanel.o(this.p).E(var4);
            label59:
            if (var8 != null) {
               this.p.c8 = true;

               for (KB var10 : var8) {
                  YP var11 = SetBackgroundImagePanel.a(this.p, var3);
                  com.finalshell.ui.model.J2 var12 = var4.D(var10);
                  SetBackgroundImagePanel.G(this.p, var1 + (Integer)var10.X, var7, var11, var12, this.W);
                  if (var6 != 0) {
                     break label59;
                  }

                  if (var6 != 0) {
                     break;
                  }
               }

               this.p.c8 = false;
            }
         }

         var19 = this.p;
      }

      var20 = SetBackgroundImagePanel.Y(var19);
      label45:
      if (var6 == 0) {
         if (var20 != null) {
            var20 = SetBackgroundImagePanel.Y(this.p);
            if (var6 != 0) {
               break label45;
            }

            KB var13 = var20.x(var1, var7 + this.p.P, var4.length());
            if (var13 != null) {
               YP var15 = SetBackgroundImagePanel.l(this.p, var3);
               com.finalshell.ui.model.J2 var17 = var4.Y((Integer)var13.X - var1, (Integer)var13.S);
               SetBackgroundImagePanel.G(this.p, (Integer)var13.X, var7, var15, var17, this.W);
            }
         }

         var20 = SetBackgroundImagePanel.e(this.p);
      }

      if (var6 == 0) {
         if (var20 == null) {
            return;
         }

         var20 = SetBackgroundImagePanel.e(this.p);
      }

      KB var14 = var20.x(var1, var7 + this.p.P, var4.length());
      if (var6 == 0) {
         if (var14 == null) {
            return;
         }

         this.p.k = true;
      }

      YP var16 = SetBackgroundImagePanel.S(this.p, var3);
      com.finalshell.ui.model.J2 var18 = var4.Y((Integer)var14.X - var1, (Integer)var14.S);
      SetBackgroundImagePanel.G(this.p, (Integer)var14.X, var7, var16, var18, this.W);
      this.p.k = false;
   }

   @Override
   public void r(int var1, int var2, int var3, YP var4, com.finalshell.ui.model.J2 var5, int var6) {
      int var10000 = ConnectionProperty.M$int();
      int var8 = var2 - var6;
      int var7 = var10000;
      SetBackgroundImagePanel var11 = this.p;
      if (var7 != 0) {
         if (SetBackgroundImagePanel.e(this.p) != null) {
            KB var9 = SetBackgroundImagePanel.e(this.p).x(var3, var8 + this.p.P, this.o - var3);
            if (var7 == 0) {
               return;
            }

            if (var9 != null) {
               YP var10 = SetBackgroundImagePanel.S(this.p, var4);
               SetBackgroundImagePanel.G(this.p, var1, var8, var10, var5, this.W);
               return;
            }
         }

         var11 = this.p;
      }

      SetBackgroundImagePanel.G(var11, var1, var8, var4, var5, this.W);
   }

   @Override
   public void K(int var1, int var2, int var3, int var4) {
      if (var1 < this.o) {
         this.r(var1, var2, var3, YP.r, new com.finalshell.ui.model.J2((char)((int)a), this.o - var1), var4);
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5261361356709521201L;
      long var10002 = 1650211244313110289L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





