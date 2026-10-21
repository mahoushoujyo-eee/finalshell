package com.finalshell.ui.listener;

import com.finalshell.ui.dialog.DK;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AY extends WindowAdapter {
   public final DK q;

   public AY(DK var1) {
      this.q = var1;
   }

   @Override
   public void windowClosed(WindowEvent var1) {
      this.q.z = -1;
   }
}





