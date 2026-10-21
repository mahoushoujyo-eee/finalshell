package org.v;

import java.io.File;

class h7 extends org.V.f {
   final File K;
   final W_3 G;
   private static final long b;

   h7(W_3 var1, File var2) {
      this.G = var1;
      this.K = var2;
   }

   @Override
   protected File r(String var1) {
      return new File(this.K.getParentFile(), var1.substring(var1.lastIndexOf((int)b) + 1));
   }

   static {
      long var0 = 482416634935006502L;
      long var10002 = 174998505273316617L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





