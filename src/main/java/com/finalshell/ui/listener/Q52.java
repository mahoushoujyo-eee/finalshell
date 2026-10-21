package com.finalshell.ui.listener;

import com.finalshell.core.Gi2;
import com.finalshell.core.KD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

public class Q52 implements ActionListener {
   final BK2 B;

   Q52(BK2 var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JComponent var4;
      label25: {
         int[] var10000 = KD.s$arrint();
         this.B.g.u += 0.075F;
         int[] var2 = var10000;
         float var5;
         int var3 = (var5 = this.B.g.u - 1.0F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
         if (var2 == null) {
            if (var3 >= 0) {
               this.B.g.u = 1.0F;
               this.B.g.x.Y();
            }

            Gi2.F(this.B.g);
            var4 = this.B.w;
            if (var2 != null) {
               break label25;
            }

            var3 = (this.B.w.isEnabled()) ? 1 : 0;
         }

         if (var3 == 0) {
            return;
         }

         var4 = this.B.w;
      }

      var4.repaint();
   }
}





