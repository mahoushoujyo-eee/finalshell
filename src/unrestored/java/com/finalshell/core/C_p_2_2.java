package com.finalshell.core;

import java.util.ArrayList;
import java.util.List;

public final class C_p_2_2 extends C_j_2 implements K3_4 {
   public final List t = new ArrayList();

   public C_p_2_2(com.finalshell.ui.model.I var1, @C_9 String var2, Fu2_2[] var3, String var4, Nt2_2[] var5) {
      super(var1, var2, var3, var4, null, null, var5);
   }

   @Override
   public Nt2_2[] M() {
      return this.g;
   }

   @Override
   public List N() {
      return this.t;
   }

   @Override
   public void W(C_B_2 var1) {
      this.t.add(var1);
   }

   @C_9
   @Override
   public Object J(Fq2_2 var1) throws Throwable {
      return var1.f(this);
   }

   @C_9
   @Override
   public Object i(HL var1) throws Throwable {
      return var1.L(this);
   }
}





