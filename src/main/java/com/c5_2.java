package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class c5_2 implements ActionListener {
   @Override
   public void actionPerformed(ActionEvent var1) {
      this.f(var1, (com.WC)var1.getSource());
   }

   public abstract void f(ActionEvent var1, com.WC var2);
}





