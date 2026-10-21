package com.c;

import java.awt.Dimension;
import javax.swing.JComponent;

class U_2 extends JComponent {
   final R_2 R;

   U_2(R_2 var1) {
      this.R = var1;
      this.setOpaque(false);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(0, 4 + this.R.X);
   }
}





