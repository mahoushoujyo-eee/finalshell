package org.V;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

class w_2 implements org.V.T {
   final URL Y;
   final String K;

   w_2(URL var1, String var2) {
      this.Y = var1;
      this.K = var2;
   }

   @Override
   public URL T() throws IOException {
      return this.Y;
   }

   @Override
   public InputStream o() throws IOException {
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





