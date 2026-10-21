package com.finalshell.ui.listener;

import com.finalshell.ui.dialog.DK;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DE3 implements ActionListener {
   final DK V;

   DE3(DK var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.V.z = 0;
      this.V.dispose();
   }
}





