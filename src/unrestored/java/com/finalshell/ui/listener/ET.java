package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Qt2;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLayeredPane;

public class ET extends ComponentAdapter {
   public final Qt2 A;
   public final JLayeredPane m;

   public ET(Qt2 var1, JLayeredPane var2) {
      this.A = var1;
      this.m = var2;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.A.setBounds(0, 0, this.m.getWidth(), this.m.getHeight());
      this.A.revalidate();
   }
}





