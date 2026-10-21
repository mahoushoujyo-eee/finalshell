package org.H;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cb_2 extends org.H.Y {
   private final short[] F;

   public Cb_2(short var1, short[] var2) {
      super(var1);
      this.F = var2;
   }

   public org.H.G[] m(org.H.Cr_2 var1) {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      org.H.G[] var3 = new org.H.G[this.F.length];
      com.ky_4[] var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var3.length) {
            var5 = var3;
            if (var2 != null) {
               break;
            }

            var3[var4] = var1.X(this.F[var4]);
            var4++;
            if (var2 == null) {
               continue;
            }
         }

         var5 = var3;
         break;
      }

      return var5;
   }

   private static org.H.Y A(short var0, DataInputStream var1) throws IOException {
      return new org.H.Cb_2(var0, org.H.Cr_2.a(var1));
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      org.H.Cr_2.D(var1, this.F);
   }

   static org.H.Y f(short var0, DataInputStream var1) throws IOException {
      return A(var0, var1);
   }
}





