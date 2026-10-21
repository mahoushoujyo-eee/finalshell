package com.finalshell.ui.listener;

import com.finalshell.core.Ac2;
import com.finalshell.ui.model.IC3;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.Wd2;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

public class KQ implements ActionListener {
   public final Wd2 I;

   public KQ(Wd2 var1) {
      this.I = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var3 = (float)Wd2.J() / (1000.0F / (float)Wd2.x$int());
      Ky4[] var10000 = Ac2.n();
      float var4 = 1.0F / var3;
      Ky4[] var2 = var10000;
      int var7 = (Wd2.q(this.I).equals(IC3.fadeIn)) ? 1 : 0;
      if (var2 == null) {
         if (var7 != 0) {
            Wd2 var8 = this.I;
            if (var2 == null) {
               if (Wd2.Y$float(this.I) < 1.0F) {
                  Wd2.F(this.I, Math.min(Wd2.Y$float(this.I) + var4, 1.0F));
                  this.I.repaint();
                  if (var2 == null) {
                     return;
                  }
               }

               Wd2.Y$void(this.I);
               var8 = this.I;
            }

            Wd2.N(var8).Y();
            if (var2 == null) {
               return;
            }
         }

         var7 = (Wd2.q(this.I).equals(IC3.fadeOut)) ? 1 : 0;
      }

      label50: {
         if (var2 == null) {
            if (var7 == 0) {
               return;
            }

            var10000 = (Ky4[])(this.I);
            if (var2 != null) {
               break label50;
            }

            float var10;
            var7 = (var10 = Wd2.Y$float(this.I) - 0.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
         }

         if (var7 > 0) {
            Wd2.F(this.I, Math.max(Wd2.Y$float(this.I) - var4, 0.0F));
            this.I.repaint();
            if (var2 == null) {
               return;
            }
         }

         var10000 = (Ky4[])((JComponent)this.I.getParent());
      }

      Object var5 = var10000;
      if (var5 != null) {
         Rectangle var6 = this.I.getBounds();
         var5.remove(this.I);
         ((javax.swing.JComponent)var5).repaint(var6);
      }

      Wd2.N(this.I).Y();
   }
}





