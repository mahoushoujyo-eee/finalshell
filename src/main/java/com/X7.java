package com;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class X7 extends ComponentAdapter {
   final Component i;
   final com.E q;
   final com.QX Y;

   X7(com.QX var1, Component var2, com.E var3) {
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





