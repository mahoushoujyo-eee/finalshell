package com.finalshell.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class W2_5 implements T_4 {
   public final URL Y;
   public final String K;

   public W2_5(URL var1, String var2) {
      this.Y = var1;
      this.K = var2;
   }

   @Override
   public URL T() throws IOException {
      return this.Y;
   }

   @Override
   public InputStream o$InputStream() throws IOException {
      return this.Y.openStream();
   }

   @Override
   public String o$String() {
      return this.K;
   }

   @Override
   public long z() {
      return 0L;
   }
}





