package com.finalshell.ui.listener;

import com.finalshell.core.E_2;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class X7 extends ComponentAdapter {
   final Component i;
   final E_2 q;
   final com.finalshell.ui.panel.QX Y;

   X7(com.finalshell.ui.panel.QX var1, Component var2, E_2 var3) {
      this.Y = var1;
      this.i = var2;
      this.q = var3;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.Y.A(this.i, (Rectangle)this.q.J());
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      this.Y.A(this.i, (Rectangle)this.q.J());
   }
}





