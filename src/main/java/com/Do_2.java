package com;

public class Do_2 implements Ip_2 {
   private Is_2 c;
   private byte[] y;
   private int m;

   @Override
   public void Z(byte[] var1, int var2) throws Exception {
      this.c = new Is_2();
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





