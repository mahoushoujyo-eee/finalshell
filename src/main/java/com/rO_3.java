package com;

import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class rO_3 extends rA_3 {
   public rO_3(float var1) {
      super(var1);
   }

   @Override
   public CompositeContext createContext(ColorModel var1, ColorModel var2, RenderingHints var3) {
      return new Xn_2(this.l, var1, var2);
   }
}





