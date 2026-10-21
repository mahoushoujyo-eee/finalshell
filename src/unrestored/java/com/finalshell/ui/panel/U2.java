package com.finalshell.ui.panel;

import com.finalshell.core.R_2_2;
import java.awt.Dimension;
import javax.swing.JComponent;

public class U2 extends JComponent {
   public final R_2_2 R;

   public U2(R_2_2 var1) {
      this.R = var1;
      this.setOpaque(false);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(0, 4 + this.R.X);
   }
}





