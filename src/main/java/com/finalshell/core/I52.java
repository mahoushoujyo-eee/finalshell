package com.finalshell.core;

import com.finalshell.ui.panel.Qt2;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JLayeredPane;

public class I52 implements WindowStateListener {
   final Qt2 j;
   final JLayeredPane i;

   I52(Qt2 var1, JLayeredPane var2) {
      this.j = var1;
      this.i = var2;
   }

   @Override
   public void windowStateChanged(WindowEvent var1) {
      this.j.setBounds(0, 0, this.i.getWidth(), this.i.getHeight());
      this.j.revalidate();
   }
}





