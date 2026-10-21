package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataOutputStream;
import java.io.IOException;

public final class M_2 implements R2_3 {
   public final R2_3[] z;
   public static long a;

   public M_2(R2_3[] var1) {
      this.z = var1;
   }

   @Override
   public byte s() {
      return (byte)((int)a);
   }

   @Override
   public void E(DataOutputStream var1) throws IOException {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      var1.writeShort(this.z.length);
      Ky4[] var2 = var10000;

      for (R2_3 var6 : this.z) {
         var1.writeByte(var6.s());
         var6.E(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   @C_9
   @Override
   public Object d(M2_4 var1) throws Throwable {
      return var1.M(this);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8213722792239723985L;
      long var10002 = 5900489011893007754L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





