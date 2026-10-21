package com.finalshell.core;

import java.util.ArrayList;
import java.util.List;

public abstract class C_n_2 extends C_i_2 implements C_Y_2, RO {
   @C_9
   public final String f;
   public final String D;
   public final Nt2_2[] q;
   public final List Q = new ArrayList();
   @C_9
   Q4_3[] F;
   public static String c;

   protected C_n_2(com.finalshell.ui.model.I var1, @C_9 String var2, Fu2_2[] var3, String var4, @C_9 C_U[] var5, Nt2_2[] var6) {
      super(var1, var3, var5);
      this.f = var2;
      String[] var10000 = RG_2.C();
      this.D = var4;
      String[] var7 = var10000;
      this.q = var6;

      for (Nt2_2 var11 : var6) {
         var11.n(new C_v_2(this));
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
      String[] var10000 = RG_2.C();
      this.Q.add(var1);
      var1.C(this);
      String[] var2 = var10000;
      Hd2 var3 = this.m;
      if (var2 != null) {
         if (this.m == null) {
            return;
         }

         var3 = this.m;
      }

      var3.z$void();
   }

   @Override
   public String j() {
      return this.D;
   }

   @C_9
   @Override
   public String W() {
      return this.f;
   }

   @Override
   public boolean w() {
      String[] var1 = RG_2.C();
      String var10000 = this.f;
      if (var1 != null) {
         if (this.f == null) {
            return 0 != 0;
         }

         var10000 = this.f;
      }

      int var2 = var10000.indexOf(c);
      if (var1 == null) {
         return var2 != 0;
      } else {
         return (boolean)(var2 != -1 ? 1 : 0);
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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





