package com.finalshell.ui.listener;

import com.finalshell.core.WO3;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JList;

public class NV3 extends ComponentAdapter {
   public final JList T;
   public final WO3 l;

   public NV3(WO3 var1, JList var2) {
      this.l = var1;
      this.T = var2;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.R();
   }

   public void R() {
      int var1 = WO3.f();
      WO3 var10000 = this.l;
      if (var1 == 0) {
         if (!this.l.D()) {
            return;
         }

         var10000 = this.l;
      }

      Rectangle var2 = var10000.n(this.T, this.l.f, this.l.b);
      Rectangle var3 = var2;
      if (var1 == 0) {
         if (var2 == null) {
            return;
         }

         var3 = var2;
      }

      if (!var3.equals(this.l.d.getBounds())) {
         this.l.d.setBounds(var2);
         this.T.revalidate();
         this.T.repaint();
      }
   }
}





