package com.finalshell.core;

import java.awt.Container;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.ScrollPaneLayout;

public class IL extends ScrollPaneLayout {
   public final JComponent f;

   public IL(JComponent var1) {
      this.f = var1;
   }

   @Override
   public void layoutContainer(Container var1) {
      super.layoutContainer(var1);
      this.f.setBounds(new Rectangle(this.viewport.getBounds()));
      var1.setComponentZOrder(this.f, 0);
   }
}





