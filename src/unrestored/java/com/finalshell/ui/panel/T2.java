package com.finalshell.ui.panel;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class T2 extends JLabel {
   public RenderingHints z;

   public T2(String var1) {
      super(var1);
      this.setFont((Font)Ref.g(164046876459002055L, null));
      RenderingHints var10001 = new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
      long var3 = 340954326888131361L;
      RenderingHints var2 = var10001;
      Ref.s(340954326888131361L, var2, var3);
      this.setOpaque(false);
      this.setHorizontalAlignment(0);
      this.setForeground((Color)Ref.g(503018106388102479L, null));
   }

   @Override
   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
   }

   public RenderingHints P() {
      Object var1 = 340954326888131361L;
      return (RenderingHints)Ref.g(340954326888131361L, var1);
   }

   public void C(RenderingHints var1) {
      long var3 = 340954326888131361L;
      Ref.s(340954326888131361L, var1, var3);
   }
}





