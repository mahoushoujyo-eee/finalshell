package com.finalshell.ui.listener;

import com.finalshell.ui.model.NC3;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.QQ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WH implements ActionListener {
   public final NC3 K;
   public final com.finalshell.ui.panel.QS J;

   public WH(com.finalshell.ui.panel.QS var1, NC3 var2) {
      this.J = var1;
      this.K = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Ky4[] var10000 = QQ.N$arrky_4();
      this.J.Z(this.K);
      Ky4[] var2 = var10000;
      com.finalshell.ui.panel.QS var3 = this.J;
      if (var2 == null) {
         if (!this.J.O) {
            return;
         }

         var3 = this.J;
      }

      var3.a();
   }
}





