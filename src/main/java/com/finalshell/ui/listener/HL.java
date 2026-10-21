package com.finalshell.ui.listener;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HL extends WindowAdapter {
   public final Frame c;
   public final Frame e;

   public HL(Frame var1, Frame var2) {
      this.c = var1;
      this.e = var2;
   }

   @Override
   public void windowOpened(WindowEvent var1) {
      this.c.setEnabled(false);
   }

   @Override
   public void windowClosed(WindowEvent var1) {
      this.c.setEnabled(true);
      this.e.removeWindowListener(this);
   }
}





