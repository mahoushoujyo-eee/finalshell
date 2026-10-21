package com.finalshell.ui.panel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D.Double;
import javax.swing.JComponent;

public class W2 extends JComponent {
   final L H;

   W2(L var1) {
      this.H = var1;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Graphics2D var2 = (Graphics2D)var1;
      Shape var3 = var2.getClip();
      Area var4 = new Area(new Double(2.0, 2.0, (double)(this.getWidth() - 4), (double)(this.getHeight() - 4)));
      var4.intersect(new Area(var3));
      var2.setClip(var4);
      var2.drawImage(L.d(this.H), 2, 2, null);
      var2.drawImage(L.m.getImage(), L.H(this.H).x - L.m.getIconWidth() / 2, L.H(this.H).y - L.m.getIconHeight() / 2, L.m.getImageObserver());
      var2.setClip(var3);
   }
}





