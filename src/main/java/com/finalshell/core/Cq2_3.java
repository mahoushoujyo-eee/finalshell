package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cq2_3 extends Y_3 {
   public final List q;

   Cq2_3(short var1) {
      super(var1);
      this.q = new ArrayList();
   }

   Cq2_3(short var1, CX_2[] var2) {
      super(var1);
      this.q = new ArrayList<>(Arrays.asList(var2));
   }

   public List u() {
      return this.q;
   }

   public static Y_3 s(short var0, DataInputStream var1) throws IOException {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      CX_2[] var3 = new CX_2[var1.readUnsignedShort()];
      Ky4[] var2 = var10000;
      short var4 = 0;

      while (var4 < var3.length) {
         var3[var4] = new CX_2(var1.readShort(), var1.readShort(), var1.readShort(), var1.readShort());
         var4++;
         if (var2 != null) {
            break;
         }
      }

      return new Cq2_3(var0, var3);
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      var1.writeShort(this.q.size());
      Ky4[] var2 = var10000;

      for (CX_2 var4 : this.q) {
         var1.writeShort(var4.w);
         var1.writeShort(var4.a);
         var1.writeShort(var4.X);
         var1.writeShort(var4.q);
         if (var2 != null) {
            break;
         }
      }
   }

   static Y_3 T(short var0, DataInputStream var1) throws IOException {
      return s(var0, var1);
   }
}





