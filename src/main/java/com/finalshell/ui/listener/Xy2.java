package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.QQ;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Xy2 extends MouseAdapter {
   public final QQ F;

   public Xy2(QQ var1) {
      this.F = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Ky4[] var2 = QQ.N$arrky_4();
      boolean var10000 = this.F.m;
      if (var2 == null) {
         if (!this.F.m) {
            return;
         }

         var10000 = FN.B(var1);
      }

      if (var10000) {
         this.F.a();
         if (var2 == null) {
            return;
         }
      }

      this.F.l();
   }
}





