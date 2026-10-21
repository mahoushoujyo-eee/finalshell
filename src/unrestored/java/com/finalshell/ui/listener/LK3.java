package com.finalshell.ui.listener;

import com.finalshell.ui.model.NC3;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.QQ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LK3 implements ActionListener {
   public final NC3 T;
   public final QQ M;

   public LK3(QQ var1, NC3 var2) {
      this.M = var1;
      this.T = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Ky4[] var10000 = QQ.N$arrky_4();
      this.M.Y(this.T);
      Ky4[] var2 = var10000;
      QQ var3 = this.M;
      if (var2 == null) {
         if (!this.M.Q) {
            return;
         }

         var3 = this.M;
      }

      var3.a();
   }
}





