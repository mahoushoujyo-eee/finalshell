package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kz4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class E7 implements ActionListener {
   final File M;
   final Kz4 h;

   E7(Kz4 var1, File var2) {
      this.h = var1;
      this.M = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.h.X(this.M);
   }
}





