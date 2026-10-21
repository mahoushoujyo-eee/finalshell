package com.finalshell.ui.panel;

import com.finalshell.core.ZK;
import java.awt.Component;
import javax.swing.JPanel;

public class L62 extends JPanel {
   final XW3 G;

   public L62(XW3 var1) {
      this.G = var1;
   }

   public void o(Component var1) {
      XW3.w(this.G).removeAll();
      XW3.w(this.G).add(var1);
      XW3.w(this.G).validate();
      XW3.w(this.G).repaint();
   }

   L62(XW3 var1, ZK var2) {
      this(var1);
   }
}





