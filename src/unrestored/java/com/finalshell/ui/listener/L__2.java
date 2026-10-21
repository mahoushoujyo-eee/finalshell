package com.finalshell.ui.listener;

import com.finalshell.core.Xk2;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class L__2 extends ComponentAdapter {
   public final com.finalshell.ui.dialog.Ds2 p;

   public L__2(com.finalshell.ui.dialog.Ds2 var1) {
      this.p = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      int[] var2 = com.finalshell.ui.dialog.Ds2.U$arrint();
      com.finalshell.ui.dialog.Ds2 var10000 = this.p;
      if (var2 == null) {
         if (this.p.g() == null) {
            return;
         }

         var10000 = this.p;
      }

      Rectangle var3 = var10000.getBounds();
      var3.width++;
      var3.height++;
      Xk2.v(this.p, this.p.g().g(this.p.o, var3));
   }
}





