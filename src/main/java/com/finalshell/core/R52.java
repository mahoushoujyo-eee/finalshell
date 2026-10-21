package com.finalshell.core;

import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class R52 extends RA3 {
   public R52(float var1) {
      super(var1);
   }

   @Override
   public CompositeContext createContext(ColorModel var1, ColorModel var2, RenderingHints var3) {
      return new TG(this.l, var1, var2);
   }
}





