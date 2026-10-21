package com.finalshell.io;

import com.finalshell.core.F_4;
import com.finalshell.core.W_7;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class P_2 extends FilterReader {
   public boolean M;
   final Runnable K;

   P_2(Reader var1, Runnable var2) {
      super(var1);
      this.K = var2;
   }

   @Override
   public int read() throws IOException {
      this.l();
      return super.read();
   }

   @F_4(false)
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

   public void l() {
      String var1 = W_7.v();
      P_2 var10000 = this;
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





