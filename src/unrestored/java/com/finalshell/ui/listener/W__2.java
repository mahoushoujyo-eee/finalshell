package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.QQ;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class W__2 extends MouseAdapter {
   public final com.finalshell.ui.panel.QS q;

   public W__2(com.finalshell.ui.panel.QS var1) {
      this.q = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Ky4[] var2 = QQ.N$arrky_4();
      boolean var10000 = this.q.a;
      if (var2 == null) {
         if (!this.q.a) {
            return;
         }

         var10000 = FN.B(var1);
      }

      if (var10000) {
         this.q.a();
         if (var2 == null) {
            return;
         }
      }

      this.q.V();
   }
}





