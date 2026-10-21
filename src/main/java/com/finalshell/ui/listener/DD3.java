package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KF3;
import com.finalshell.ui.panel.Kz4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DD3 implements ActionListener {
   public final KF3 k;

   public DD3(KF3 var1) {
      this.k = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = Kz4.M();
      KF3 var10000 = this.k;
      if (var2 != null) {
         if (this.k.D != null) {
            this.k.a.s(this.k.D);
            if (var2 != null) {
               return;
            }
         }

         var10000 = this.k;
      }

      var10000.a.T();
   }
}





