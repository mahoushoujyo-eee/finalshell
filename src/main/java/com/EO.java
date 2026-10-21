package com;

import java.awt.Rectangle;

class EO implements com.E {
   final _y_2 J;

   EO(_y_2 var1) {
      this.J = var1;
   }

   public Rectangle I() {
      return new Rectangle(0, 0, _y_2.j(this.J).getWidth(), _y_2.j(this.J).getHeight());
   }

   @Override
   public Object J() {
      return this.I();
   }
}





