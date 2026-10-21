package com.finalshell.ui.panel;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class DC extends JLabel {
   public static long a;

   public DC(String var1) {
      super(var1);
      this.setOpaque(true);
      this.setHorizontalAlignment(0);
      int var2 = (int)a;
      this.setForeground(new Color(var2, var2, var2));
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 1014987571449219614L;
      long var10002 = -5195840931648320902L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





