package com.c;

import java.awt.Dimension;
import javax.swing.JComponent;

class N_2 extends JComponent {
   final R_2 X;

   N_2(R_2 var1) {
      this.X = var1;
      this.setOpaque(false);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(4 + this.X.X, 0);
   }
}





