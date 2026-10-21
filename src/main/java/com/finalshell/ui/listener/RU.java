package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KF3;
import com.finalshell.ui.panel.Kz4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RU implements ActionListener {
   final KF3 L;

   RU(KF3 var1) {
      this.L = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = Kz4.M();
      KF3 var10000 = this.L;
      if (var2 != null) {
         if (this.L.D == null) {
            return;
         }

         var10000 = this.L;
      }

      var10000.V(this.L.D.getParentFile(), true, true);
   }
}





