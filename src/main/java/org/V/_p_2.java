package org.v;

import java.util.ArrayList;
import java.util.List;
import org.I;

public final class _p_2 extends _j_2 implements k_3 {
   private final List t = new ArrayList();

   public _p_2(I var1, @org.F.c String var2, fu_2[] var3, String var4, Nt_2[] var5) {
      super(var1, var2, var3, var4, null, null, var5);
   }

   @Override
   public Nt_2[] M() {
      return this.g;
   }

   @Override
   public List N() {
      return this.t;
   }

   @Override
   public void W(_B var1) {
      this.t.add(var1);
   }

   @org.F.c
   @Override
   public Object J(fq_2 var1) throws Throwable {
      return var1.f(this);
   }

   @org.F.c
   @Override
   public Object i(hL var1) throws Throwable {
      return var1.L(this);
   }
}





