package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KV3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PH3 implements ActionListener {
   public final KV3 k;

   public PH3(KV3 var1) {
      this.k = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.k.P(1);
   }
}





