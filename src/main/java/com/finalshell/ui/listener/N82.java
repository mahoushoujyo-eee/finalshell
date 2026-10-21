package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KV3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class N82 implements ActionListener {
   final KV3 E;

   N82(KV3 var1) {
      this.E = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.E.S(-1);
   }
}





