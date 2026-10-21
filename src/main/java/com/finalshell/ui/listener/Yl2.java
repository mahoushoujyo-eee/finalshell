package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KV3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Yl2 implements ActionListener {
   final KV3 b;

   Yl2(KV3 var1) {
      this.b = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.b.P(-1);
   }
}





