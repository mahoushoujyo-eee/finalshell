package org.H;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class C5 extends org.H.Y {
   private final F[] f;

   public C5(short var1, F[] var2) {
      super(var1);
      this.f = var2;
   }

   private static org.H.Y k(short var0, DataInputStream var1) throws IOException {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      F[] var3 = new F[var1.readUnsignedShort()];
      short var4 = 0;
      com.ky_4[] var2 = var10000;

      while (var4 < var3.length) {
         var3[var4] = new F(var1.readShort(), var1.readShort());
         var4++;
         if (var2 != null) {
            break;
         }
      }

      return new org.H.C5(var0, var3);
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      var1.writeShort(this.f.length);
      F[] var3 = this.f;
      int var4 = var3.length;
      com.ky_4[] var2 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         F var6 = var3[var5];
         var1.writeShort(var6.p);
         var1.writeShort(var6.X);
         var5++;
         if (var2 != null) {
            break;
         }
      }
   }

   static org.H.Y L(short var0, DataInputStream var1) throws IOException {
      return k(var0, var1);
   }
}





