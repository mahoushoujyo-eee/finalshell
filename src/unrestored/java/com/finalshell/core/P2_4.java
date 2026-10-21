package com.finalshell.core;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class P2_4 implements N_6 {
   public final byte[] Z;
   public final String d;
   public final X_6 P;

   public P2_4(X_6 var1, byte[] var2, String var3) {
      this.P = var1;
      this.Z = var2;
      this.d = var3;
   }

   @Override
   public InputStream o$InputStream() {
      return new ByteArrayInputStream(this.Z);
   }

   @Override
   public String o$String() {
      return this.d;
   }

   @Override
   public long z() {
      return X_6.f(this.P);
   }
}





