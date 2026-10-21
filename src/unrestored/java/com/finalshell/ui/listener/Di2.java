package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KV3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Di2 implements ActionListener {
   public final KV3 s;

   public Di2(KV3 var1) {
      this.s = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.s.S(1);
   }
}





