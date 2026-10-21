package com.finalshell.io;

import com.finalshell.core.I_6;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class C extends ByteArrayOutputStream {
   final String J;
   final I_6 u;

   C(I_6 var1, String var2) {
      this.u = var1;
      this.J = var2;
   }

   @Override
   public void close() throws IOException {
      super.close();
      I_6.T(this.u).put(this.J, this.toByteArray());
   }
}





