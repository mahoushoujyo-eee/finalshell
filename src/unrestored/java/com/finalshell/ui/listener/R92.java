package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K32;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class R92 implements ActionListener {
   public final K32 s;

   public R92(K32 var1) {
      this.s = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = K32.L$arrint();
      K32 var10000 = this.s;
      if (var2 != null) {
         if (this.s.k < 1.0F) {
            this.s.k = Math.min(1.0F, this.s.k + this.s.H);
            this.s.revalidate();
            if (var2 != null) {
               return;
            }
         }

         this.s.k = 1.0F;
         this.s.K$void();
         var10000 = this.s;
      }

      var10000.p.Y();
   }
}





