package com.finalshell.ui.listener;

import com.finalshell.core.Fk2;
import com.finalshell.ui.panel.BM;
import com.finalshell.ui.panel.KD3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IV3 implements ActionListener {
   final KD3 p;

   IV3(KD3 var1) {
      this.p = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = KD3.u();
      BM var10000 = KD3.c(this.p);
      if (var2 == null) {
         if (var10000.R$boolean()) {
            return;
         }

         var10000 = KD3.c(this.p);
      }

      var10000.g(Fk2.K(KD3.c(this.p).T()));
   }
}





