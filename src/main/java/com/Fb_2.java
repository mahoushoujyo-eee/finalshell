package com;

import java.awt.Shape;
import java.awt.Stroke;

public class Fb_2 implements Stroke {
   private Stroke l;
   private Stroke U;

   public Fb_2(Stroke var1, Stroke var2) {
      this.l = var1;
      this.U = var2;
   }

   @Override
   public Shape createStrokedShape(Shape var1) {
      return this.U.createStrokedShape(this.l.createStrokedShape(var1));
   }
}





