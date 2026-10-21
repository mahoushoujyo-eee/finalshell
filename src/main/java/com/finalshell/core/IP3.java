package com.finalshell.core;

import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class IP3 implements Composite {
   public int t;

   public IP3(int var1) {
      this.t = var1;
   }

   @Override
   public CompositeContext createContext(ColorModel var1, ColorModel var2, RenderingHints var3) {
      return new PR(this.t, var1, var2);
   }

   @Override
   public int hashCode() {
      return 0;
   }

   @Override
   public boolean equals(Object var1) {
      String var2 = RA3.c();
      boolean var10000 = var1 instanceof IP3;
      if (var2 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = true;
      }

      return var10000;
   }
}





