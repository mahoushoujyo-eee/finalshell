package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kc4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Lk2 implements ActionListener {
   final File y;
   final Kc4 E;

   Lk2(Kc4 var1, File var2) {
      this.E = var1;
      this.y = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.E.m.remove(this.y);
      this.E.n();
   }
}





