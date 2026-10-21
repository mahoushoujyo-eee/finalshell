package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class wk_4 implements ActionListener {
   final EF q;

   wk_4(EF var1) {
      this.q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      EF var3;
      label25: {
         String var2 = com.kz_4.M();
         float var4;
         int var10000 = (var4 = this.q.I.q - 0.0F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
         if (var2 != null) {
            if (var10000 > 0) {
               this.q.I.q -= 0.1F;
            }

            this.q.I.q = Math.max(this.q.I.q, 0.0F);
            this.q.I.repaint();
            var3 = this.q;
            if (var2 == null) {
               break label25;
            }

            float var5;
            var10000 = (var5 = this.q.I.q - 0.0F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
         }

         if (var10000 > 0) {
            return;
         }

         var3 = this.q;
      }

      EF.l(var3).Y();
   }
}





