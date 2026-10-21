package com.h;

import com.GO;
import com.P9;
import com.RV;
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

class B implements Icon {
   final JRadioButton Z;
   final com.h.c t;

   B(com.h.c var1, JRadioButton var2) {
      this.t = var1;
      this.Z = var2;
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      com.h.c.f(this.t, new Rectangle(var3, var4, com.h.c.L(this.t), com.h.c.c(this.t)));
      int var10000 = com.h.K.Z();
      Graphics2D var6 = (Graphics2D)var2;
      Object var7 = RV.X(var6);
      int var8 = com.h.c.L(this.t) - com.h.c.e(this.t) * 2 - 2;
      boolean var5 = (boolean)var10000;
      Rectangle var9 = new Rectangle(
         var3 + com.h.c.e(this.t), var4 + com.h.c.e(this.t), com.h.c.L(this.t) - com.h.c.e(this.t) * 2 - 1, com.h.c.c(this.t) - com.h.c.e(this.t) * 2 - 1
      );
      Double var10 = new Double((double)var9.x, (double)var9.y, (double)var9.width, (double)var9.height, (double)var8, (double)var8);
      var10000 = var1.isEnabled();
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

            RV.Y(var6, var10, var19, com.h.c.e(this.t));
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
                  (float)(var9.x + var9.width / 2), (float)(var9.y + var9.height / 2), (float)var11, new float[]{0.0F, 1.0F}, com.h.c.W(this.t, this.Z)
               )
            );
            var6.fill(var10);
            var12 = RV.M(var6, this.t.m);
            boolean var10001 = var1.isEnabled();
            if (var5) {
               if (!var10001) {
                  var18 = com.h.c.C(this.t);
                  break label59;
               }

               var17 = this.t;
               if (!var5) {
                  break label78;
               }

               var10001 = com.h.c.f(this.t);
            }

            if (var10001) {
               var18 = P9.N(com.h.c.O(this.t), com.h.c.L(this.t), com.h.c.T(this.t));
               break label59;
            }

            var17 = this.t;
         }

         var18 = com.h.c.L(var17);
      }

      var6.setPaint(var18);
      var6.draw(var10);
      RV.p(var6, var12);
      if (var5) {
         if (com.h.c.C(this.t) > 0) {
            label43: {
               Object var15 = this.Z;
               if (var5) {
                  if (!this.Z.isEnabled()) {
                     var16 = com.h.c.p;
                     break label43;
                  }

                  var15 = com.h.c.S.get(com.h.c.C(this.t));
               }

               var16 = (ImageIcon)var15;
            }

            ImageIcon var13 = var16;
            var6.drawImage(
               var13.getImage(), var3 + com.h.c.L(this.t) / 2 - var13.getIconWidth() / 2, var4 + com.h.c.c(this.t) / 2 - var13.getIconHeight() / 2, this.Z
            );
         }

         RV.X(var6, var7);
      }

      if (!var5) {
         com.ky_4.K(new String[1]);
      }
   }

   @Override
   public int getIconWidth() {
      return com.h.c.L(this.t);
   }

   @Override
   public int getIconHeight() {
      return com.h.c.c(this.t);
   }
}





