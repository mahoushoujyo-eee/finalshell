package com.finalshell.ui.listener;

import com.finalshell.core.Ch2;
import com.finalshell.core.KD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nv2 implements ActionListener {
   public final KD p;

   public Nv2(KD var1) {
      this.p = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Ch2.P(this.p);
   }
}





