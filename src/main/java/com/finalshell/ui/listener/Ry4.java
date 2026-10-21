package com.finalshell.ui.listener;

import com.finalshell.core.BX;
import com.finalshell.core.DP_2;
import com.finalshell.ui.model.Sj2;
import com.finalshell.ui.panel.QL;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Ry4 extends ComponentAdapter {
   final DP_2 Y;
   final Sj2 n;
   final QL K;

   Ry4(QL var1, DP_2 var2, Sj2 var3) {
      this.K = var1;
      this.Y = var2;
      this.n = var3;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      com.finalshell.ui.panel.O2 var4;
      String[] var10000 = BX.B$arrString();
      com.finalshell.ui.panel.O2 var3 = this.Y.g();
      String[] var2 = var10000;
      var4 = var3;
      label18:
      if (var2 == null) {
         if (var3.getWidth() <= 0) {
            var4 = var3;
            if (var2 != null) {
               break label18;
            }

            if (var3.getHeight() <= 0) {
               return;
            }
         }

         this.Y.a(this.n.b());
         var4 = var3;
      }

      var4.removeComponentListener(this);
   }
}





