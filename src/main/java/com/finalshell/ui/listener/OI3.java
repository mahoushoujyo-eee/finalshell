package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Bq_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OI3 implements ActionListener {
   final Bq_2 B;

   OI3(Bq_2 var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.B.V();
   }
}





