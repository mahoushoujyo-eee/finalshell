package com.finalshell.ui.listener;

import com.finalshell.core.Ch2;
import com.finalshell.core.KD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class R22 implements ActionListener {
   public final KD g;

   public R22(KD var1) {
      this.g = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Ch2.P(this.g);
   }
}





