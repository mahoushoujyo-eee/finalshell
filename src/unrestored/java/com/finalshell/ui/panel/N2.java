package com.finalshell.ui.panel;

import com.finalshell.core.R_2_2;
import java.awt.Dimension;
import javax.swing.JComponent;

public class N2 extends JComponent {
   public final R_2_2 X;

   public N2(R_2_2 var1) {
      this.X = var1;
      this.setOpaque(false);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(4 + this.X.X, 0);
   }
}





