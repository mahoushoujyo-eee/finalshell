package com.finalshell.ui.listener;

import com.finalshell.core.Nx4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H4 implements ActionListener {
   final Nx4 d;

   H4(Nx4 var1) {
      this.d = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.d.j();
   }
}





