package com;

import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JList;

class nV_3 extends ComponentAdapter {
   final JList T;
   final wO_3 l;

   nV_3(wO_3 var1, JList var2) {
      this.l = var1;
      this.T = var2;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.R();
   }

   private void R() {
      int var1 = wO_3.f();
      wO_3 var10000 = this.l;
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





