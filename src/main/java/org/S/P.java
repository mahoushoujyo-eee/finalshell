package org.s;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import org.F.F;

class P extends FilterReader {
   private boolean M;
   final Runnable K;

   P(Reader var1, Runnable var2) {
      super(var1);
      this.K = var2;
   }

   @Override
   public int read() throws IOException {
      this.l();
      return super.read();
   }

   @F(false)
   @Override
   public int read(char[] var1, int var2, int var3) throws IOException {
      this.l();
      return super.read(var1, var2, var3);
   }

   @Override
   public long skip(long var1) throws IOException {
      this.l();
      return super.skip(var1);
   }

   private void l() {
      String var1 = org.s.W.v();
      org.s.P var10000 = this;
      if (var1 != null) {
         if (this.M) {
            return;
         }

         this.K.run();
         var10000 = this;
      }

      var10000.M = true;
   }
}





