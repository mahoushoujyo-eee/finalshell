package com.finalshell.core;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class W_5 implements N_6 {
   public final String W;
   public final byte[] v;

   public W_5(String var1, String var2) {
      this.W = var1;
      this.v = var2.getBytes();
   }

   @Override
   public final String o$String() {
      return this.W;
   }

   @Override
   public final InputStream o$InputStream() {
      return new ByteArrayInputStream(this.v);
   }

   @Override
   public final long z() {
      return 0L;
   }

   @Override
   public final String toString() {
      return this.o$String();
   }
}





