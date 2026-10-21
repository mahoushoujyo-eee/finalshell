package com;

import java.awt.Dimension;
import java.awt.Rectangle;

class wu_4 implements com.E {
   final int E;
   final int w;
   final com.QX F;

   wu_4(com.QX var1, int var2, int var3) {
      this.F = var1;
      this.E = var2;
      this.w = var3;
   }

   public Rectangle e() {
      Dimension var1 = this.F.getPreferredSize();
      return new Rectangle(this.E, this.w, var1.width, var1.height);
   }

   @Override
   public Object J() {
      return this.e();
   }
}





