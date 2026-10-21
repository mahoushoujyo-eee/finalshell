package org.H;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class v_2 implements org.H.r_2 {
   public final short B;
   public final Map P;
   private static final long a;

   public v_2(short var1, Map var2) {
      this.B = var1;
      this.P = var2;
   }

   @Override
   public byte s() {
      return (byte)((int)a);
   }

   @Override
   public void E(DataOutputStream var1) throws IOException {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      var1.writeShort(this.B);
      var1.writeShort(this.P.size());
      com.ky_4[] var2 = var10000;

      for (Entry var4 : this.P.entrySet()) {
         Short var5 = (Short)var4.getKey();
         org.H.r_2 var6 = (org.H.r_2)var4.getValue();
         var1.writeShort(var5);
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
      return var1.o(this);
   }

   static {
      long var0 = 5494457149533065828L;
      long var10002 = -9167146557042716124L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





