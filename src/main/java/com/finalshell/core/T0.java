package com.finalshell.core;

import com.finalshell.crypto.PingMessageR;
import java.util.HashMap;

public class T0 {
   public HashMap c;
   public long k;

   public T0(long var1) {
      this.k = var1;
      this.c = new HashMap();
   }

   @Override
   public boolean equals(Object var1) {
      String[] var10000 = PingMessageR.N();
      T0 var3 = (T0)var1;
      String[] var2 = var10000;
      long var5;
      int var4 = (var5 = this.k - var3.k) == 0L ? 0 : (var5 < 0L ? -1 : 1);
      if (var2 != null) {
         if (!var4) {
            return true;
         }

         var4 = 0;
      }

      return var4 != 0;
   }

   @Override
   public int hashCode() {
      return Long.toString(this.k).hashCode();
   }

   public void c(NL var1, Kw2 var2) {
      this.c.put(var1, var2);
   }

   public void n(NL var1) {
      this.c.remove(var1);
   }

   public int k() {
      return this.c.size();
   }

   public HashMap v() {
      return this.c;
   }
}





