package com.finalshell.ui.listener;

import com.finalshell.core.E_2;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.event.AncestorEvent;

public class Ff2 extends FY {
   public final Component G;
   public final E_2 g;
   public final com.finalshell.ui.panel.QX E;

   public Ff2(com.finalshell.ui.panel.QX var1, Component var2, E_2 var3) {
      this.E = var1;
      this.G = var2;
      this.g = var3;
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.E.A(this.G, (Rectangle)this.g.J());
   }
}





