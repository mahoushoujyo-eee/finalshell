package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kz4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Kz2 implements ActionListener {
   public final File O;
   public final Kz4 c;

   public Kz2(Kz4 var1, File var2) {
      this.c = var1;
      this.O = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.c.X(this.O);
   }
}





