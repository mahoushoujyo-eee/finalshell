package org.V;

import java.io.File;

public class E extends org.V.f {
   private final File I;
   private static final long b;

   public E(File var1) {
      this.I = var1;
   }

   @Override
   protected final File r(String var1) {
      return new File(this.I, var1.replace((char)((int)b), File.separatorChar));
   }

   static {
      long var0 = 5009753000943441928L;
      long var10002 = 8068242574414862375L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





