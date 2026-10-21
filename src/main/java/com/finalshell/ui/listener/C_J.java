package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K32;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_J implements ActionListener {
   public final K32 Q;

   public C_J(K32 var1) {
      this.Q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = K32.L$arrint();
      K32 var10000 = this.Q;
      if (var2 != null) {
         if (this.Q.k > 0.0F) {
            this.Q.k = Math.max(0.0F, this.Q.k - this.Q.H);
            this.Q.revalidate();
            if (var2 != null) {
               return;
            }
         }

         this.Q.k = 0.0F;
         this.Q.u$void();
         var10000 = this.Q;
      }

      var10000.p.Y();
   }
}





