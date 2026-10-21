package com.finalshell.ui.listener;

import com.finalshell.core.PM;
import com.finalshell.core.Wx2;
import com.finalshell.ui.panel.BM;
import com.finalshell.ui.panel.KD3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class K12 implements ActionListener {
   final KD3 A;

   K12(KD3 var1) {
      this.A = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = KD3.u();
      BM var10000 = KD3.c(this.A);
      if (var2 == null) {
         if (var10000.R$boolean()) {
            return;
         }

         var10000 = KD3.c(this.A);
      }

      Wx2.G(PM.l(var10000.w$RT()));
   }
}





