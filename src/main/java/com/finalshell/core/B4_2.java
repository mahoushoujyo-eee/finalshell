package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import javax.swing.ImageIcon;

public abstract class B4_2 extends V3 {
   public ImageIcon V;
   public String h;

   public B4_2(ImageIcon var1, String var2) {
      V3.L();
      this.V = var1;
      this.h = var2;
      if (Ky4.F$arrString() != null) {
         V3.Q(new Ky4[2]);
      }
   }

   @Override
   public ImageIcon b() {
      return this.V;
   }

   public void S(ImageIcon var1) {
      this.V = var1;
   }

   @Override
   public String getDescription() {
      return this.h;
   }

   public void W(String var1) {
      this.h = var1;
   }
}





