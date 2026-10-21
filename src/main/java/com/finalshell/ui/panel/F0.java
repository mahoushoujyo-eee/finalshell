package com.finalshell.ui.panel;

import com.finalshell.core.GO;
import com.finalshell.core.Y2_2;
import com.finalshell.ui.frame.XD3;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

public class F0 extends JComponent {
   public final XD3 h;

   public F0(XD3 var1) {
      this.h = var1;
   }

   @Override
   public void paintComponent(Graphics var1) {
      var1.setColor(GO.R);
      var1.fillRect(0, 0, this.getWidth(), this.getHeight() - 1);
      var1.setColor(GO.Ff);
      var1.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(0, 4);
   }

   public F0(XD3 var1, Y2_2 var2) {
      this(var1);
   }
}





