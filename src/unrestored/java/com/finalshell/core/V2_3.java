package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class V2_3 implements R2_3 {
   public final short B;
   public final Map P;
   public static long a;

   public V2_3(short var1, Map var2) {
      this.B = var1;
      this.P = var2;
   }

   @Override
   public byte s() {
      return (byte)((int)a);
   }

   @Override
   public void E(DataOutputStream var1) throws IOException {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      var1.writeShort(this.B);
      var1.writeShort(this.P.size());
      Ky4[] var2 = var10000;

      for (Entry var4 : this.P.entrySet()) {
         Short var5 = (Short)var4.getKey();
         R2_3 var6 = (R2_3)var4.getValue();
         var1.writeShort(var5);
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
      return var1.o(this);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5494457149533065828L;
      long var10002 = -9167146557042716124L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





