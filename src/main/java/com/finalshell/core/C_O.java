package com.finalshell.core;

public class C_O extends C_n_2 implements RW_2 {
   public static long g;

   public C_O(com.finalshell.ui.model.I var1, @C_9 String var2, Fu2_2[] var3, String var4, @C_9 C_U[] var5, Nt2_2[] var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public com.finalshell.ui.model.S_3 Q() {
      return RG_2.N$_S(this.D());
   }

   @Override
   public String R() {
      C_Y_2 var1 = (C_Y_2)this.y();
      return var1.R() + (int)g + this.j();
   }

   @Override
   public void C(K_2_2 var1) {
      this.r(var1);
   }

   @Override
   public K_2_2 H() {
      return (K_2_2)this.y();
   }

   @C_9
   @Override
   public Object J(Fq2_2 var1) throws Throwable {
      return var1.p(this);
   }

   @C_9
   @Override
   public Object i(HL var1) throws Throwable {
      return var1.I(this);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 1573063443516784526L;
      long var10002 = -7896114609684709462L ^ var0;
      byte var10001 = -1;
      g = var10002;
   }
}





