package com.finalshell.core;

public class PW3 implements AB_2 {
   public Xe2 J;
   public Ls4 k;
   public String M;
   public static String a;

   public static PW3 e(String var0, String var1, Xe2 var2) throws Pc2 {
      Ls4 var3 = Ls4.X(var2, var0, var1);
      return new PW3(var2, var0, var3);
   }

   static PW3 Z(String var0, byte[] var1, byte[] var2, Xe2 var3) throws Pc2 {
      Ls4 var4 = Ls4.h(var3, var1, var2);
      return new PW3(var3, var0, var4);
   }

   public PW3(Xe2 var1, String var2, Ls4 var3) throws Pc2 {
      this.J = var1;
      this.M = var2;
      this.k = var3;
   }

   @Override
   public boolean M(byte[] var1) throws Pc2 {
      return this.k.d(var1);
   }

   @Override
   public byte[] u() {
      return this.k.O();
   }

   @Override
   public byte[] v(byte[] var1) {
      return this.k.l(var1);
   }

   @Override
   public byte[] l(byte[] var1, String var2) {
      return this.k.e(var1, var2);
   }

   @Deprecated
   @Override
   public boolean j() {
      throw new RuntimeException(a);
   }

   @Override
   public String B() {
      byte[] var1 = this.k.A();
      return E8.B(var1);
   }

   @Override
   public String b() {
      return this.M;
   }

   @Override
   public boolean f() {
      return this.k.t();
   }

   @Override
   public void v() {
      this.k.a$void();
      this.k = null;
   }

   public Ls4 J() {
      return this.k;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001dt(3gsK\u001f~1v`j^\u0017".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 25;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 25;
         var10006 = var0;
      } else {
         var6 = 25;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 25;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 106;
               break;
            case 1:
               var23 = 2;
               break;
            case 2:
               var23 = 69;
               break;
            case 3:
               var23 = 10;
               break;
            case 4:
               var23 = 23;
               break;
            case 5:
               var23 = 7;
               break;
            default:
               var23 = 34;
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





