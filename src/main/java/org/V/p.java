package org.V;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class p implements org.V.N {
   final byte[] Z;
   final String d;
   final org.V.X P;

   p(org.V.X var1, byte[] var2, String var3) {
      this.P = var1;
      this.Z = var2;
      this.d = var3;
   }

   @Override
   public InputStream o() {
      return new ByteArrayInputStream(this.Z);
   }

   @Override
   public String o$String() {
      return this.d;
   }

   @Override
   public long z() {
      return org.V.X.f(this.P);
   }
}





