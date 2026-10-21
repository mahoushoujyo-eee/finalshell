package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class P_4 implements W2_4 {
   public final short s;
   public final short y;
   public final short U;
   public final List E;
   final Cr2_2 A;
   public static String a;

   public P_4(Cr2_2 var1, short var2, short var3, short var4, List var5) {
      this.A = var1;
      this.s = var2;
      this.y = var3;
      this.U = var4;
      this.E = var5;
   }

   public Cr2_2 x() {
      return this.A;
   }

   public short D() {
      return this.s;
   }

   @Override
   public V2_3[] R(boolean var1) {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      C_ var3 = Cr2_2.Z(this.A, var1, this.E);
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

   public String s() {
      return this.A.S$String(this.y);
   }

   public String q() {
      return this.A.S$String(this.U);
   }

   public Y_3[] i() {
      return this.E.toArray(new Y_3[this.E.size()]);
   }

   public void m(Y_3 var1) {
      this.E.add(var1);
   }

   @Override
   public void t(boolean var1, String var2, Map var3) {
      Cr2_2.q(this.A, var1, var2, var3, this.E);
   }

   public void i(DataOutputStream var1) throws IOException {
      var1.writeShort(this.s);
      var1.writeShort(this.y);
      var1.writeShort(this.U);
      Cr2_2.m(var1, this.E);
   }

   @Override
   public String toString() {
      try {
         return this.A + "." + this.A.S$String(this.y) + a;
      } catch (Exception var2) {
         return super.toString();
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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





