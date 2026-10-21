package com.finalshell.io;

import com.finalshell.core.E_3;
import com.finalshell.core.S_4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class G extends ByteArrayOutputStream {
   public final OutputStream i;
   public final E_3 z;

   public G(E_3 var1, OutputStream var2) {
      this.z = var1;
      this.i = var2;
   }

   @Override
   public void close() throws IOException {
      byte[] var1 = this.toByteArray();
      S_4.K(var1);
      this.i.write(var1);
      this.i.close();
   }
}





