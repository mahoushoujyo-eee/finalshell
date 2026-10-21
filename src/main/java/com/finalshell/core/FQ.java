package com.finalshell.core;

public class FQ implements Hj2 {
   final FF_2 p;
   public static long a;

   FQ(FF_2 var1) {
      this.p = var1;
   }

   @C_9
   public Void Z(N9_2 var1) {
      this.p.t.print(var1.toString() + (int)a);
      return null;
   }

   @C_9
   public Void J(RH_2 var1) {
      return (Void)var1.q(FF_2.r(this.p));
   }

   @C_9
   public Void p(Rg2 var1) {
      return (Void)var1.q(FF_2.r(this.p));
   }

   @C_9
   public Void m(RA var1) {
      return (Void)var1.q(FF_2.r(this.p));
   }

   @C_9
   @Override
   public Object H(N9_2 var1) throws Throwable {
      return this.Z(var1);
   }

   @C_9
   @Override
   public Object b(RH_2 var1) throws Throwable {
      return this.J(var1);
   }

   @C_9
   @Override
   public Object a(Rg2 var1) throws Throwable {
      return this.p(var1);
   }

   @C_9
   @Override
   public Object z(RA var1) throws Throwable {
      return this.m(var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6691819123633515059L;
      long var10002 = 2729291594948110867L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





