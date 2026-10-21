package com.finalshell.ui.listener;

import com.finalshell.core.PM;
import com.finalshell.core.Wx2;
import com.finalshell.ui.model.RT;
import com.finalshell.ui.panel.KD3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lq2 implements ActionListener {
   public final KD3 q;

   public Lq2(KD3 var1) {
      this.q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = KD3.u();
      if (!KD3.c(this.q).R$boolean()) {
         String var3 = Wx2.a();
         Object var10000 = var3;
         if (var2 == null) {
            if (var3 == null) {
               return;
            }

            var10000 = PM.N(var3);
         }

         RT var4 = (RT)var10000;
         KD3.c(this.q).O(var4);
      }
   }
}





