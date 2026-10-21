package com.finalshell.core;

public class B3 implements X9 {
   final M3 l;

   B3(M3 var1) {
      this.l = var1;
   }

   @Override
   public void r() {
      M3.a(this.l).repaint();
      M3.I$JList(this.l).repaint();
   }

   @Override
   public void Q() {
      M3.x(this.l, true);
      M3.o(this.l).revalidate();
      M3.O$JList(this.l).revalidate();
   }
}





