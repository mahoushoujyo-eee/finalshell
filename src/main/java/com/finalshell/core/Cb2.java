package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cb2 extends Y_3 {
   public final short[] F;

   public Cb2(short var1, short[] var2) {
      super(var1);
      this.F = var2;
   }

   public G_3[] m(Cr2_2 var1) {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      G_3[] var3 = new G_3[this.F.length];
      Ky4[] var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var3.length) {
      G_3[] var5;
            var5 = var3;
            if (var2 != null) {
               break;
            }

            var3[var4] = var1.X(this.F[var4]);
            var4++;
            if (var2 == null) {
      G_3[] var5;
               continue;
            }
         }

         var5 = var3;
         break;
      }

      return var5;
   }

   public static Y_3 A(short var0, DataInputStream var1) throws IOException {
      return new Cb2(var0, Cr2_2.a(var1));
   }

   @Override
   public void T(DataOutputStream var1) throws IOException {
      Cr2_2.D(var1, this.F);
   }

   public static Y_3 f(short var0, DataInputStream var1) throws IOException {
      return A(var0, var1);
   }
}






