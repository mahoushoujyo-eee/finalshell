package com;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

class KQ implements ActionListener {
   final com.Wd_2 I;

   KQ(com.Wd_2 var1) {
      this.I = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var3 = (float)com.Wd_2.J() / (1000.0F / (float)com.Wd_2.x());
      com.ky_4[] var10000 = com.ac_2.n();
      float var4 = 1.0F / var3;
      com.ky_4[] var2 = var10000;
      int var7 = com.Wd_2.q(this.I).equals(iC_3.fadeIn);
      if (var2 == null) {
         if (var7 != 0) {
            com.Wd_2 var8 = this.I;
            if (var2 == null) {
               if (com.Wd_2.Y(this.I) < 1.0F) {
                  com.Wd_2.F(this.I, Math.min(com.Wd_2.Y(this.I) + var4, 1.0F));
                  this.I.repaint();
                  if (var2 == null) {
                     return;
                  }
               }

               com.Wd_2.Y(this.I);
               var8 = this.I;
            }

            com.Wd_2.N(var8).Y();
            if (var2 == null) {
               return;
            }
         }

         var7 = com.Wd_2.q(this.I).equals(iC_3.fadeOut);
      }

      label50: {
         if (var2 == null) {
            if (var7 == 0) {
               return;
            }

            var10000 = this.I;
            if (var2 != null) {
               break label50;
            }

            float var10;
            var7 = (var10 = com.Wd_2.Y(this.I) - 0.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
         }

         if (var7 > 0) {
            com.Wd_2.F(this.I, Math.max(com.Wd_2.Y(this.I) - var4, 0.0F));
            this.I.repaint();
            if (var2 == null) {
               return;
            }
         }

         var10000 = (JComponent)this.I.getParent();
      }

      Object var5 = var10000;
      if (var5 != null) {
         Rectangle var6 = this.I.getBounds();
         var5.remove(this.I);
         var5.repaint(var6);
      }

      com.Wd_2.N(this.I).Y();
   }
}





