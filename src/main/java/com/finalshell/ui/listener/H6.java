package com.finalshell.ui.listener;

import com.finalshell.core.EF;
import com.finalshell.ui.panel.Kz4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H6 implements ActionListener {
   final EF V;

   H6(EF var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      EF var3;
      label25: {
         String var2 = Kz4.M();
         float var4;
         int var10000 = (var4 = this.V.I.q - 1.0F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
         if (var2 != null) {
            if (var10000 < 0) {
               this.V.I.q += 0.1F;
            }

            this.V.I.q = Math.min(this.V.I.q, 1.0F);
            this.V.I.repaint();
            var3 = this.V;
            if (var2 == null) {
               break label25;
            }

            float var5;
            var10000 = (var5 = this.V.I.q - 1.0F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
         }

         if (var10000 < 0) {
            return;
         }

         var3 = this.V;
      }

      EF.l(var3).Y();
   }
}





