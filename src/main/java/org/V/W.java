package org.V;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class W implements org.V.N {
   private final String W;
   private final byte[] v;

   public W(String var1, String var2) {
      this.W = var1;
      this.v = var2.getBytes();
   }

   @Override
   public final String o() {
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
      return this.o();
   }
}





