package org.H;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cn_2 extends org.H.Y {
   private final f_2[] P;

   public Cn_2(short var1, f_2[] var2) {
      super(var1);
      this.P = var2;
   }

   private static org.H.Y Q(short var0, DataInputStream var1) throws IOException {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      f_2[] var3 = new f_2[var1.readUnsignedShort()];
      com.ky_4[] var2 = var10000;
      short var4 = 0;

      while (var4 < var3.length) {
         var3[var4] = new f_2(var1.readShort(), var1.readShort(), var1.readShort(), var1.readShort(), var1.readShort());
         var4++;
         if (var2 != null) {
            break;
         }
      }

      return new org.H.Cn_2(var0, var3);
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      var1.writeShort(this.P.length);
      com.ky_4[] var10000 = org.H.Cr_2.q();
      f_2[] var3 = this.P;
      com.ky_4[] var2 = var10000;

      for (f_2 var6 : var3) {
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

   static org.H.Y Z(short var0, DataInputStream var1) throws IOException {
      return Q(var0, var1);
   }
}





