package org.V;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

class C extends ByteArrayOutputStream {
   final String J;
   final I u;

   C(I var1, String var2) {
      this.u = var1;
      this.J = var2;
   }

   @Override
   public void close() throws IOException {
      super.close();
      I.T(this.u).put(this.J, this.toByteArray());
   }
}





