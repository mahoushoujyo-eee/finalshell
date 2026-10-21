package org.H;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cq_2 extends org.H.Y {
   private final List q;

   Cq_2(short var1) {
      super(var1);
      this.q = new ArrayList();
   }

   Cq_2(short var1, org.H.CX[] var2) {
      super(var1);
      this.q = new ArrayList(Arrays.asList(var2));
   }

   public List u() {
      return this.q;
   }

   private static org.H.Y s(short var0, DataInputStream var1) throws IOException {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      org.H.CX[] var3 = new org.H.CX[var1.readUnsignedShort()];
      com.ky_4[] var2 = var10000;
      short var4 = 0;

      while (var4 < var3.length) {
         var3[var4] = new org.H.CX(var1.readShort(), var1.readShort(), var1.readShort(), var1.readShort());
         var4++;
         if (var2 != null) {
            break;
         }
      }

      return new org.H.Cq_2(var0, var3);
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      var1.writeShort(this.q.size());
      com.ky_4[] var2 = var10000;

      for (org.H.CX var4 : this.q) {
         var1.writeShort(var4.w);
         var1.writeShort(var4.a);
         var1.writeShort(var4.X);
         var1.writeShort(var4.q);
         if (var2 != null) {
            break;
         }
      }
   }

   static org.H.Y T(short var0, DataInputStream var1) throws IOException {
      return s(var0, var1);
   }
}





