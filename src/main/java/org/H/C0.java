package org.H;

import java.io.DataOutputStream;
import java.io.IOException;

public final class C0 implements org.H.r_2 {
   public final short M;
   public final short Z;
   private static final long a;

   public C0(short var1, short var2) {
      this.M = var1;
      this.Z = var2;
   }

   @Override
   public byte s() {
      return (byte)((int)a);
   }

   @Override
   public void E(DataOutputStream var1) throws IOException {
      var1.writeShort(this.M);
      var1.writeShort(this.Z);
   }

   @org.F.c
   @Override
   public Object d(org.H.m_2 var1) throws Throwable {
      return var1.P(this);
   }

   static {
      long var0 = 1889590547488403747L;
      long var10002 = -3313726537358151354L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





