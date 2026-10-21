package com.finalshell.ui.listener;

import com.finalshell.ui.panel.OG;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rf4 implements ActionListener {
   public final OG V;

   public Rf4(OG var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.V.B$void();
   }
}





