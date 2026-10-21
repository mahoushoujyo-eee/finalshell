package com.finalshell.ui.listener;

import com.finalshell.core.Nx4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ll4 implements ActionListener {
   final Nx4 t;

   Ll4(Nx4 var1) {
      this.t = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.t.b();
   }
}





