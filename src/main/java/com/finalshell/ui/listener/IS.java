package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K02;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IS implements ActionListener {
   public final K02 i;

   public IS(K02 var1) {
      this.i = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.i.K(var1, this.i.j);
   }
}





