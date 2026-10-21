package com.finalshell.ui.listener;

import com.finalshell.core.A4_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E2 implements ActionListener {
   public final A4_2 y;

   public E2(A4_2 var1) {
      this.y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      A4_2.n(this.y).cancelSelection();
   }
}





