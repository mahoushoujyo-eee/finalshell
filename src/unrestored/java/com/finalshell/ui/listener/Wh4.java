package com.finalshell.ui.listener;

import com.finalshell.core.FV_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wh4 implements ActionListener {
   public final Runnable y;

   public Wh4(Runnable var1) {
      this.y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      FV_2.p(this.y);
   }
}





