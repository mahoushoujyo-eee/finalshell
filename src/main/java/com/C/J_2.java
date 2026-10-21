package com.c;

import java.awt.Dimension;
import javax.swing.JComponent;

class J_2 extends JComponent {
   final R_2 U;

   J_2(R_2 var1) {
      this.U = var1;
      this.setOpaque(false);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(4 + this.U.X, 0);
   }
}





