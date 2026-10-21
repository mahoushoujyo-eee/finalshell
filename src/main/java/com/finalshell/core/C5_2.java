package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class C5_2 extends Y_3 {
   public final F_5[] f;

   public C5_2(short var1, F_5[] var2) {
      super(var1);
      this.f = var2;
   }

   public static Y_3 k(short var0, DataInputStream var1) throws IOException {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      F_5[] var3 = new F_5[var1.readUnsignedShort()];
      short var4 = 0;
      Ky4[] var2 = var10000;

      while (var4 < var3.length) {
         var3[var4] = new F_5(var1.readShort(), var1.readShort());
         var4++;
         if (var2 != null) {
            break;
         }
      }

      return new C5_2(var0, var3);
   }

   @Override
   public void T(DataOutputStream var1) throws IOException {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      var1.writeShort(this.f.length);
      F_5[] var3 = this.f;
      int var4 = var3.length;
      Ky4[] var2 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         F_5 var6 = var3[var5];
         var1.writeShort(var6.p);
         var1.writeShort(var6.X);
         var5++;
         if (var2 != null) {
            break;
         }
      }
   }

   public static Y_3 L(short var0, DataInputStream var1) throws IOException {
      return k(var0, var1);
   }
}





