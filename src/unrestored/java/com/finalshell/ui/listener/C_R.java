package com.finalshell.ui.listener;

import com.finalshell.core.Fk2;
import com.finalshell.ui.panel.BM;
import com.finalshell.ui.panel.KD3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_R implements ActionListener {
   public final KD3 T;

   public C_R(KD3 var1) {
      this.T = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = KD3.u();
      BM var10000 = KD3.c(this.T);
      if (var2 == null) {
         if (var10000.R$boolean()) {
            return;
         }

         var10000 = KD3.c(this.T);
      }

      var10000.g(Fk2.N(KD3.c(this.T).T()));
   }
}





