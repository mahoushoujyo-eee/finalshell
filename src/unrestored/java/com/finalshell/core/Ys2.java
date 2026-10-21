package com.finalshell.core;

import com.finalshell.ui.panel.Kh4;

public class Ys2 extends YO {
   public final Kh4 C;

   public Ys2(Kh4 var1) {
      this.C = var1;
   }

   @Override
   public void T() {
      this.C.repaint();
      this.C.revalidate();
   }
}





