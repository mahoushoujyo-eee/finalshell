package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;

public class NH3 extends Ne4 {
   public boolean G;

   public NH3() {
      Rq4.G();
      super(false);
      this.G = false;
      this.n(0);
      this.J(0);
      this.setForeground(Sm2.o);
      this.F(new LM_2());
      if (Ky4.F$arrString() != null) {
         Rq4.O(new int[4]);
      }
   }

   public boolean U() {
      return this.G;
   }

   public void s(boolean var1) {
      this.G = var1;
      this.repaint();
   }
}





