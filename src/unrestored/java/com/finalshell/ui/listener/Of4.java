package com.finalshell.ui.listener;

import com.finalshell.ui.dialog.DK;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Of4 implements ActionListener {
   public final DK M;

   public Of4(DK var1) {
      this.M = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.M.z = 1;
      this.M.dispose();
   }
}





