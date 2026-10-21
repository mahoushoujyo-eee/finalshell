package org.H;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class c_2 implements org.H.w_2 {
   private final short Q;
   private final short q;
   private final short z;
   private final List E;
   final org.H.Cr_2 w;

   public c_2(org.H.Cr_2 var1, short var2, short var3, short var4, List var5) {
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
   public v_2[] R(boolean var1) {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      org.H.C_ var3 = org.H.Cr_2.Z(this.w, var1, this.E);
      com.ky_4[] var2 = var10000;
      org.H.C_ var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return new v_2[0];
         }

         var4 = var3;
      }

      return org.H.C_.j(var4).toArray(new v_2[org.H.C_.j(var3).size()]);
   }

   public String K(org.H.Cr_2 var1) {
      return var1.S(this.q);
   }

   public String P(org.H.Cr_2 var1) {
      return var1.S(this.z);
   }

   public org.H.Y[] M() {
      return this.E.toArray(new org.H.Y[this.E.size()]);
   }

   public void g(org.H.Y var1) {
      this.E.add(var1);
   }

   @Override
   public void t(boolean var1, String var2, Map var3) {
      org.H.Cr_2.q(this.w, var1, var2, var3, this.E);
   }

   public void y(DataOutputStream var1) throws IOException {
      var1.writeShort(this.Q);
      var1.writeShort(this.q);
      var1.writeShort(this.z);
      org.H.Cr_2.m(var1, this.E);
   }
}





