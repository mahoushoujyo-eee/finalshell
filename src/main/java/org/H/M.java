package org.H;

import java.io.DataOutputStream;
import java.io.IOException;

public final class M implements org.H.r_2 {
   public final org.H.r_2[] z;
   private static final long a;

   public M(org.H.r_2[] var1) {
      this.z = var1;
   }

   @Override
   public byte s() {
      return (byte)((int)a);
   }

   @Override
   public void E(DataOutputStream var1) throws IOException {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      var1.writeShort(this.z.length);
      com.ky_4[] var2 = var10000;

      for (org.H.r_2 var6 : this.z) {
         var1.writeByte(var6.s());
         var6.E(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   @org.F.c
   @Override
   public Object d(org.H.m_2 var1) throws Throwable {
      return var1.M(this);
   }

   static {
      long var0 = 8213722792239723985L;
      long var10002 = 5900489011893007754L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





