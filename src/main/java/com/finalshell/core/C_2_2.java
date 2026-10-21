package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class C_2_2 implements W2_4 {
   public final short Q;
   public final short q;
   public final short z;
   public final List E;
   public final Cr2_2 w;

   public C_2_2(Cr2_2 var1, short var2, short var3, short var4, List var5) {
      this.w = var1;
      this.Q = var2;
      this.q = var3;
      this.z = var4;
      this.E = var5;
   }

   public short w() {
      return this.Q;
   }

   @Override
   public V2_3[] R(boolean var1) {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      C_ var3 = Cr2_2.Z(this.w, var1, this.E);
      Ky4[] var2 = var10000;
      C_ var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return new V2_3[0];
         }

         var4 = var3;
      }

      return C_.j(var4).toArray(new V2_3[C_.j(var3).size()]);
   }

   public String K(Cr2_2 var1) {
      return var1.S$String(this.q);
   }

   public String P(Cr2_2 var1) {
      return var1.S$String(this.z);
   }

   public Y_3[] M() {
      return this.E.toArray(new Y_3[this.E.size()]);
   }

   public void g(Y_3 var1) {
      this.E.add(var1);
   }

   @Override
   public void t(boolean var1, String var2, Map var3) {
      Cr2_2.q(this.w, var1, var2, var3, this.E);
   }

   public void y(DataOutputStream var1) throws IOException {
      var1.writeShort(this.Q);
      var1.writeShort(this.q);
      var1.writeShort(this.z);
      Cr2_2.m(var1, this.E);
   }
}





