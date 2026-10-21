package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

class un_2 implements ActionListener {
   final com.BK g;

   un_2(com.BK var1) {
      this.g = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JComponent var4;
      label25: {
         int[] var10000 = com.KD.s();
         this.g.g.u -= 0.075F;
         int[] var2 = var10000;
         float var5;
         int var3 = (var5 = this.g.g.u - 0.0F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
         if (var2 == null) {
            if (var3 <= 0) {
               this.g.g.W = false;
               this.g.g.b.getModel().setRollover(false);
               this.g.g.u = 0.0F;
               this.g.g.F = null;
               this.g.g.x.Y();
            }

            Gi_2.F(this.g.g);
            var4 = this.g.w;
            if (var2 != null) {
               break label25;
            }

            var3 = this.g.w.isEnabled();
         }

         if (var3 == 0) {
            return;
         }

         var4 = this.g.w;
      }

      var4.repaint();
   }
}





