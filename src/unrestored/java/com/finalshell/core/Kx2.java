package com.finalshell.core;

import java.io.File;
import java.util.List;

public abstract class Kx2 implements OQ3 {
   public final List w;

   public Kx2() {
      this((List)null);
   }

   public Kx2(String[] var1) {
      this(AL_2.F(var1));
   }

   public Kx2(List var1) {
      this.w = var1;
   }

   public List u() {
      return this.w;
   }

   @Override
   public boolean accept(File var1) {
      int var2 = Yt2.C();
      List var10000 = this.w;
      if (var2 != 0) {
         if (this.w == null) {
            return true;
         }

         var10000 = this.w;
      }

      boolean var3 = var10000.contains(Cz2.G(var1.getName(), false));
      return var2 == 0 ? var3 : var3;
   }

   @Override
   public boolean n(Object var1) {
      return this.accept((File)var1);
   }
}





