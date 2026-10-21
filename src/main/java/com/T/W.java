package com.t;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D.Double;
import javax.swing.JComponent;

class W extends JComponent {
   final com.t.L H;

   W(com.t.L var1) {
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
      var2.drawImage(com.t.L.d(this.H), 2, 2, null);
      var2.drawImage(
         com.t.L.m.getImage(),
         com.t.L.H(this.H).x - com.t.L.m.getIconWidth() / 2,
         com.t.L.H(this.H).y - com.t.L.m.getIconHeight() / 2,
         com.t.L.m.getImageObserver()
      );
      var2.setClip(var3);
   }
}





