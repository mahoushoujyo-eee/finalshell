package org;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class g extends ByteArrayOutputStream {
   final OutputStream i;
   final org.E z;

   g(org.E var1, OutputStream var2) {
      this.z = var1;
      this.i = var2;
   }

   @Override
   public void close() throws IOException {
      byte[] var1 = this.toByteArray();
      org.T.s.K(var1);
      this.i.write(var1);
      this.i.close();
   }
}





