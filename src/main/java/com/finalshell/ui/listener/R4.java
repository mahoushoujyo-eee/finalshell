package com.finalshell.ui.listener;

import com.finalshell.core.D_3;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class R4 extends MouseAdapter {
   public final com.finalshell.ui.panel.X3 n;

   public R4(com.finalshell.ui.panel.X3 var1) {
      this.n = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.F(var1.getY());
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      this.F(var1.getY());
   }

   public void F(int var1) {
      com.finalshell.ui.panel.X3.B(this.n, Math.round(360.0F * ((float)(var1 - 5) / (float)(com.finalshell.ui.panel.X3.E(this.n).getHeight() - 4))), true);
   }

   public R4(com.finalshell.ui.panel.X3 var1, D_3 var2) {
      this(var1);
   }
}





