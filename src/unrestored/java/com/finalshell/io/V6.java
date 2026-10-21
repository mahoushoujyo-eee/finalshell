package com.finalshell.io;

import com.finalshell.core.ZModemTransfer;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class V6 extends FilterInputStream {
   public long r = 0L;
   public int h = 0;
   public boolean E = false;
   public static long a;
   public static long b;

   public V6(InputStream var1) {
      super(var1);
   }

   public int L(long var1) throws IOException {
      boolean var3 = ZModemTransfer.r$boolean();

      label34: {
         try {
            if (!var3) {
               return (this.E) ? 1 : 0;
            }

            if (!this.E) {
               break label34;
            }
         } catch (IOException var9) {
            throw new RuntimeException(a(var9));
         }

         return (int)a;
      }

      long var4 = System.currentTimeMillis();
      int var6 = this.read();
      long var7 = System.currentTimeMillis() - var4;
      if (var7 > b) {
      }

      return var6;
   }

   public void M() {
      this.E = true;
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var2 = 3873445675594635695L;
      long var10002 = -5794207854351656521L ^ var2;
      byte var10001 = -1;
      a = var10002;
      long var0 = 8278478027844939072L;
      var10002 = 8278478027844939544L ^ var0;
      var10001 = -1;
      b = var10002;
   }
}





