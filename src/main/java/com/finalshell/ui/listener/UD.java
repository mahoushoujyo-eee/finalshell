package com.finalshell.ui.listener;

import com.finalshell.core.IQ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UD implements ActionListener {
   public final IQ Y;

   public UD(IQ var1) {
      this.Y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.Y.M();
   }
}





