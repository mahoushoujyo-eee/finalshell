package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kz4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SF implements ActionListener {
   public final File G;
   public final Kz4 h;

   public SF(Kz4 var1, File var2) {
      this.h = var1;
      this.G = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.h.X(this.G);
   }
}





