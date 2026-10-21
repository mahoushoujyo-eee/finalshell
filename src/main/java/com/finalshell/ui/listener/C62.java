package com.finalshell.ui.listener;

import com.finalshell.core.WH3;
import com.finalshell.ui.panel.Cn2;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.XW3;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C62 extends MouseAdapter {
   final Cn2 G;
   final WH3 O;
   final ConnectionProperty e;
   final XW3 m;

   C62(XW3 var1, Cn2 var2, WH3 var3, ConnectionProperty var4) {
      this.m = var1;
      this.G = var2;
      this.O = var3;
      this.e = var4;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.m.M(var1);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.O.i(this.e);
      this.m.M(var1);
   }
}





