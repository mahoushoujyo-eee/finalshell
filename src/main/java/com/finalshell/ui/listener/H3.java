package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H3 implements ActionListener {
   public final int b;
   public final HD X;

   public H3(HD var1, int var2) {
      this.X = var1;
      this.b = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.X.L.u$boolean(this.X.L.x(this.b));
   }
}





