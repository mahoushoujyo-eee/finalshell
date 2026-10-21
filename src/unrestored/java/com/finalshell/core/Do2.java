package com.finalshell.core;

public class Do2 implements Ip_2 {
   public Is2 c;
   public byte[] y;
   public int m;

   @Override
   public void Z(byte[] var1, int var2) throws Exception {
      this.c = new Is2();
      this.y = var1;
      this.m = var2;
   }

   @Override
   public byte[] m(byte[] var1, int var2) {
      byte[] var3 = new byte[var2];
      this.c.p(var1, this.y, this.m, var3);
      return var3;
   }
}





