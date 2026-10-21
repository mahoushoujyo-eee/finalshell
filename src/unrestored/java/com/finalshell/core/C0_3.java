package com.finalshell.core;

import java.io.DataOutputStream;
import java.io.IOException;

public final class C0_3 implements R2_3 {
   public final short M;
   public final short Z;
   public static long a;

   public C0_3(short var1, short var2) {
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

   @C_9
   @Override
   public Object d(M2_4 var1) throws Throwable {
      return var1.P(this);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 1889590547488403747L;
      long var10002 = -3313726537358151354L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





