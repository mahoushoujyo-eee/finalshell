package com;

import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.event.AncestorEvent;

class Ff_2 extends com.FY {
   final Component G;
   final com.E g;
   final com.QX E;

   Ff_2(com.QX var1, Component var2, com.E var3) {
      this.E = var1;
      this.G = var2;
      this.g = var3;
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.E.A(this.G, (Rectangle)this.g.J());
   }
}





