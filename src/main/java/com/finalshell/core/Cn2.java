package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cn2 extends Y_3 {
   public final F2_3[] P;

   public Cn2(short var1, F2_3[] var2) {
      super(var1);
      this.P = var2;
   }

   public static Y_3 Q(short var0, DataInputStream var1) throws IOException {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      F2_3[] var3 = new F2_3[var1.readUnsignedShort()];
      Ky4[] var2 = var10000;
      short var4 = 0;

      while (var4 < var3.length) {
         var3[var4] = new F2_3(var1.readShort(), var1.readShort(), var1.readShort(), var1.readShort(), var1.readShort());
         var4++;
         if (var2 != null) {
            break;
         }
      }

      return new Cn2(var0, var3);
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      var1.writeShort(this.P.length);
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      F2_3[] var3 = this.P;
      Ky4[] var2 = var10000;

      for (F2_3 var6 : var3) {
         var1.writeShort(var6.I);
         var1.writeShort(var6.u);
         var1.writeShort(var6.w);
         var1.writeShort(var6.p);
         var1.writeShort(var6.F);
         if (var2 != null) {
            break;
         }
      }
   }

   static Y_3 Z(short var0, DataInputStream var1) throws IOException {
      return Q(var0, var1);
   }
}





