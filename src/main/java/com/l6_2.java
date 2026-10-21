package com;

import java.awt.Component;
import javax.swing.JPanel;

class l6_2 extends JPanel {
   final xW_3 G;

   private l6_2(xW_3 var1) {
      this.G = var1;
   }

   public void o(Component var1) {
      xW_3.w(this.G).removeAll();
      xW_3.w(this.G).add(var1);
      xW_3.w(this.G).validate();
      xW_3.w(this.G).repaint();
   }

   l6_2(xW_3 var1, com.zK var2) {
      this(var1);
   }
}





