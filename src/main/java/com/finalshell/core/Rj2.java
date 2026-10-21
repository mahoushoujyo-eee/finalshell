package com.finalshell.core;

public class Rj2 implements Fz2_2 {
   final FF_2 b;
   public static String a;

   Rj2(FF_2 var1) {
      this.b = var1;
   }

   @C_9
   public Void f(Nr2_2 var1) {
      this.b.A(var1.u);
      this.b.t.print(a);
      return null;
   }

   @C_9
   public Void h(NK_2 var1) {
      this.b.t.print(var1.toString());
      return null;
   }

   @C_9
   public Void J(NA_3 var1) {
      FF_2.w(this.b, var1.N);
      this.b.t.print(var1.toString());
      return null;
   }

   @C_9
   public Void r(Ng2 var1) {
      this.b.t.print(var1.toString());
      return null;
   }

   @C_9
   public Void Z(NH_2 var1) {
      this.b.t.print(var1.toString());
      return null;
   }

   @C_9
   @Override
   public Object j(NH_2 var1) throws Throwable {
      return this.Z(var1);
   }

   @C_9
   @Override
   public Object O(Ng2 var1) throws Throwable {
      return this.r(var1);
   }

   @C_9
   @Override
   public Object u(NA_3 var1) throws Throwable {
      return this.J(var1);
   }

   @C_9
   @Override
   public Object l(NK_2 var1) throws Throwable {
      return this.h(var1);
   }

   @C_9
   @Override
   public Object n(Nr2_2 var1) throws Throwable {
      return this.f(var1);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0007\n".toCharArray();
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
            a = var9;
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
               var23 = 109;
               break;
            case 1:
               var23 = 102;
               break;
            case 2:
               var23 = 69;
               break;
            case 3:
               var23 = 14;
               break;
            case 4:
               var23 = 122;
               break;
            case 5:
               var23 = 107;
               break;
            default:
               var23 = 78;
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





