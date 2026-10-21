package com.finalshell.ui.panel;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.adapter.Bx2;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class Up2 extends JLabel {
   public final Bx2 H;

   public Up2(Bx2 var1) {
      this.H = var1;
   }

   @Override
   public void paint(Graphics var1) {
      Object var2 = 506432474033075896L;
      Ref.g(506432474033075896L, var2);
      Object var4 = 264155899074958124L;
      JLabel var10002 = (JLabel)Ref.g(264155899074958124L, var4);
      Object var6 = 506432474033075896L;
      Object var10004 = Ref.g(506432474033075896L, var6);
      Object var8 = 283651054618121503L;
      ((javax.swing.JComponent)var10004).setBackground((Color)Ref.g(283651054618121503L, var8));
      this.paintComponent(var1);
   }
}





