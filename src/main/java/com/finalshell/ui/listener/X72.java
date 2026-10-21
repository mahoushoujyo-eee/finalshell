package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K32;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class X72 implements ActionListener {
   public final K32 B;

   public X72(K32 var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.B.q$boolean();
      this.B.o();
   }
}





