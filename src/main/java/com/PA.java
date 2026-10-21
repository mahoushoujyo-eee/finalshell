package com;

public interface PA {
   void X(String var1, int var2) throws Exception;

   byte[] K();

   byte[] b();

   default void k(String var1, byte[] var2) throws Exception {
      throw new UnsupportedOperationException();
   }
}





