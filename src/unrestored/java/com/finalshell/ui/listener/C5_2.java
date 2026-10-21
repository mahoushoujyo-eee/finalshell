package com.finalshell.ui.listener;

import com.finalshell.core.WC_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class C5_2 implements ActionListener {
   @Override
   public void actionPerformed(ActionEvent var1) {
      this.f(var1, (WC_2)var1.getSource());
   }

   public abstract void f(ActionEvent var1, WC_2 var2);
}





