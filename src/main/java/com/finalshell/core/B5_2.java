package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.RoundRectangle2D.Double;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class B5_2 implements Icon {
   public final JRadioButton Z;
   public final com.finalshell.ui.listener.C4 t;

   public B5_2(com.finalshell.ui.listener.C4 var1, JRadioButton var2) {
      this.t = var1;
      this.Z = var2;
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      com.finalshell.ui.listener.C4.f(this.t, new Rectangle(var3, var4, com.finalshell.ui.listener.C4.L$int(this.t), com.finalshell.ui.listener.C4.c(this.t)));
      int var10000 = (K4_2.Z$boolean()) ? 1 : 0;
      Graphics2D var6 = (Graphics2D)var2;
      Object var7 = RV.X(var6);
      int var8 = com.finalshell.ui.listener.C4.L$int(this.t) - com.finalshell.ui.listener.C4.e(this.t) * 2 - 2;
      boolean var5 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      Rectangle var9 = new Rectangle(
         var3 + com.finalshell.ui.listener.C4.e(this.t),
         var4 + com.finalshell.ui.listener.C4.e(this.t),
         com.finalshell.ui.listener.C4.L$int(this.t) - com.finalshell.ui.listener.C4.e(this.t) * 2 - 1,
         com.finalshell.ui.listener.C4.c(this.t) - com.finalshell.ui.listener.C4.e(this.t) * 2 - 1
      );
      Double var10 = new Double((double)var9.x, (double)var9.y, (double)var9.width, (double)var9.height, (double)var8, (double)var8);
      var10000 = (var1.isEnabled()) ? 1 : 0;
      if (var5) {
         if (var10000 != 0) {
            Color var19;
            label70: {
               label69: {
                  boolean var10002 = var1.isEnabled();
                  if (var5) {
                     if (!var10002) {
                        break label69;
                     }

                     var10002 = var1.isFocusOwner();
                  }

                  if (var10002) {
                     var19 = GO.c;
                     break label70;
                  }
               }

               var19 = GO.r;
            }

            RV.Y(var6, var10, var19, com.finalshell.ui.listener.C4.e(this.t));
         }

         var10000 = Math.round((float)Math.sqrt((double)(var9.width * var9.width / 2)));
      }

      Stroke var12;
      Color var18;
      label59: {
         label78: {
            int var11 = var10000;
            var6.setPaint(
               new RadialGradientPaint(
                  (float)(var9.x + var9.width / 2),
                  (float)(var9.y + var9.height / 2),
                  (float)var11,
                  new float[]{0.0F, 1.0F},
                  com.finalshell.ui.listener.C4.W(this.t, this.Z)
               )
            );
            var6.fill(var10);
            var12 = RV.M(var6, this.t.m);
            boolean var10001 = var1.isEnabled();
            if (var5) {
               if (!var10001) {
                  var18 = com.finalshell.ui.listener.C4.C$Color(this.t);
                  break label59;
               }

               var17 = this.t;
               if (!var5) {
                  break label78;
               }

               var10001 = com.finalshell.ui.listener.C4.f(this.t);
            }

            if (var10001) {
               var18 = P9.N(
                  com.finalshell.ui.listener.C4.O(this.t), com.finalshell.ui.listener.C4.L$Color(this.t), com.finalshell.ui.listener.C4.T$float(this.t)
               );
               break label59;
            }

            var17 = this.t;
         }

         var18 = com.finalshell.ui.listener.C4.L$Color(var17);
      }

      var6.setPaint(var18);
      var6.draw(var10);
      RV.p(var6, var12);
      if (var5) {
         if (com.finalshell.ui.listener.C4.C$int(this.t) > 0) {
            label43: {
               Object var15 = this.Z;
               if (var5) {
                  if (!this.Z.isEnabled()) {
                     var16 = com.finalshell.ui.listener.C4.p;
                     break label43;
                  }

                  var15 = com.finalshell.ui.listener.C4.S.get(com.finalshell.ui.listener.C4.C$int(this.t));
               }

               var16 = (ImageIcon)var15;
            }

            ImageIcon var13 = var16;
            var6.drawImage(
               var13.getImage(),
               var3 + com.finalshell.ui.listener.C4.L$int(this.t) / 2 - var13.getIconWidth() / 2,
               var4 + com.finalshell.ui.listener.C4.c(this.t) / 2 - var13.getIconHeight() / 2,
               this.Z
            );
         }

         RV.X(var6, var7);
      }

      if (!var5) {
         Ky4.K(new String[1]);
      }
   }

   @Override
   public int getIconWidth() {
      return com.finalshell.ui.listener.C4.L$int(this.t);
   }

   @Override
   public int getIconHeight() {
      return com.finalshell.ui.listener.C4.c(this.t);
   }
}





