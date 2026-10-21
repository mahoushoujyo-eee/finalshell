package org.H;

import java.io.DataOutputStream;
import java.io.IOException;

public abstract class CB implements org.H.r_2 {
   private final byte J;
   public final short h;

   public CB(byte var1, short var2) {
      this.J = var1;
      this.h = var2;
   }

   @Override
   public byte s() {
      return this.J;
   }

   @Override
   public void E(DataOutputStream var1) throws IOException {
      var1.writeShort(this.h);
   }

   @org.F.c
   @Override
   public Object d(org.H.m_2 var1) throws Throwable {
      return this.b(var1);
   }

   @org.F.c
   protected abstract Object b(org.H.g_2 var1) throws Throwable;
}





