package com.finalshell.ui.listener;

import com.finalshell.core.Fk2;
import com.finalshell.ui.panel.BM;
import com.finalshell.ui.panel.KD3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B3 implements ActionListener {
   public final KD3 R;

   public B3(KD3 var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = KD3.u();
      BM var10000 = KD3.c(this.R);
      if (var2 == null) {
         if (var10000.R$boolean()) {
            return;
         }

         var10000 = KD3.c(this.R);
      }

      var10000.g(Fk2.D(KD3.c(this.R).T()));
   }
}





