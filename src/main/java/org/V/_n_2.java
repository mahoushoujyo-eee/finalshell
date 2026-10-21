package org.v;

import java.util.ArrayList;
import java.util.List;
import org.I;

public abstract class _n_2 extends _i_2 implements _Y, RO {
   @org.F.c
   private final String f;
   public final String D;
   public final Nt_2[] q;
   public final List Q = new ArrayList();
   @org.F.c
   q_4[] F;
   private static final String c;

   protected _n_2(I var1, @org.F.c String var2, fu_2[] var3, String var4, @org.F.c _U[] var5, Nt_2[] var6) {
      super(var1, var3, var5);
      this.f = var2;
      String[] var10000 = RG.C();
      this.D = var4;
      String[] var7 = var10000;
      this.q = var6;

      for (Nt_2 var11 : var6) {
         var11.n(new _v_2(this));
         if (var7 == null) {
            break;
         }
      }
   }

   @Override
   public String toString() {
      return this.D;
   }

   public void I(RF var1) {
      String[] var10000 = RG.C();
      this.Q.add(var1);
      var1.C(this);
      String[] var2 = var10000;
      hd_2 var3 = this.m;
      if (var2 != null) {
         if (this.m == null) {
            return;
         }

         var3 = this.m;
      }

      var3.z();
   }

   @Override
   public String j() {
      return this.D;
   }

   @org.F.c
   @Override
   public String W() {
      return this.f;
   }

   @Override
   public boolean w() {
      String[] var1 = RG.C();
      String var10000 = this.f;
      if (var1 != null) {
         if (this.f == null) {
            return (boolean)0;
         }

         var10000 = this.f;
      }

      int var2 = var10000.indexOf(c);
      if (var1 == null) {
         return (boolean)var2;
      } else {
         return (boolean)(var2 != -1 ? 1 : 0);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u001a\n%\u0011:(0;\u001a%\u0005".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 49;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 49;
         var10006 = var0;
      } else {
         var6 = 49;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            c = var9;
            return;
         }

         var10005 = var10003;
         var10 = 49;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 107;
               break;
            case 1:
               var23 = 95;
               break;
            case 2:
               var23 = 113;
               break;
            case 3:
               var23 = 80;
               break;
            case 4:
               var23 = 121;
               break;
            case 5:
               var23 = 124;
               break;
            default:
               var23 = 98;
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
               c = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





