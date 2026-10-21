package com.finalshell.core;

import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class RW3 extends RA3 {
   public RW3(float var1) {
      super(var1);
   }

   @Override
   public CompositeContext createContext(ColorModel var1, ColorModel var2, RenderingHints var3) {
      return new Tm2(this.l, var1, var2);
   }
}





