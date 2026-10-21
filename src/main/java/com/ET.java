package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLayeredPane;

class ET extends ComponentAdapter {
   final com.Qt_2 A;
   final JLayeredPane m;

   ET(com.Qt_2 var1, JLayeredPane var2) {
      this.A = var1;
      this.m = var2;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.A.setBounds(0, 0, this.m.getWidth(), this.m.getHeight());
      this.A.revalidate();
   }
}





