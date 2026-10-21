package org.H;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class P implements org.H.w_2 {
   private final short s;
   private final short y;
   private final short U;
   private final List E;
   final org.H.Cr_2 A;
   private static final String a;

   public P(org.H.Cr_2 var1, short var2, short var3, short var4, List var5) {
      this.A = var1;
      this.s = var2;
      this.y = var3;
      this.U = var4;
      this.E = var5;
   }

   public org.H.Cr_2 x() {
      return this.A;
   }

   public short D() {
      return this.s;
   }

   @Override
   public v_2[] R(boolean var1) {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      org.H.C_ var3 = org.H.Cr_2.Z(this.A, var1, this.E);
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

   public String s() {
      return this.A.S(this.y);
   }

   public String q() {
      return this.A.S(this.U);
   }

   public org.H.Y[] i() {
      return this.E.toArray(new org.H.Y[this.E.size()]);
   }

   public void m(org.H.Y var1) {
      this.E.add(var1);
   }

   @Override
   public void t(boolean var1, String var2, Map var3) {
      org.H.Cr_2.q(this.A, var1, var2, var3, this.E);
   }

   public void i(DataOutputStream var1) throws IOException {
      var1.writeShort(this.s);
      var1.writeShort(this.y);
      var1.writeShort(this.U);
      org.H.Cr_2.m(var1, this.E);
   }

   @Override
   public String toString() {
      try {
         return this.A + "." + this.A.S(this.y) + a;
      } catch (Exception var2) {
         return super.toString();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "$YGO\u0019".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 106;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 106;
         var10006 = var0;
      } else {
         var6 = 106;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 106;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 102;
               break;
            case 1:
               var23 = 29;
               break;
            case 2:
               var23 = 3;
               break;
            case 3:
               var23 = 11;
               break;
            case 4:
               var23 = 90;
               break;
            case 5:
               var23 = 38;
               break;
            default:
               var23 = 73;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





