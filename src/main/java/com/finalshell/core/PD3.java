package com.finalshell.core;

public interface PD3 {
   @Deprecated
   void J(byte[] var1);

   @Deprecated
   void D(String var1);

   default void L(byte[] var1, boolean var2) {
      this.J(var1);
   }

   default void s(String var1, boolean var2) {
      this.D(var1);
   }
}





