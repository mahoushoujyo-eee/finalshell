package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class N {
   String Q;
   public long d;
   public long V;

   N() {
   }

   public String o() {
      Object var1 = 159650061954345832L;
      return (String)Ref.g(159650061954345832L, var1);
   }

   public void T(String var1) {
      long var3 = 159650061954345832L;
      Ref.s(159650061954345832L, var1, var3);
   }

   public long k() {
      return Registry.lookupField(428744148812321032L).getLong(this);
   }

   public void q(long var1) {
      Registry.lookupField(428744148812321032L).setLong(this, var1);
   }

   public long Z() {
      return Registry.lookupField(315787338003670960L).getLong(this);
   }

   public void M(long var1) {
      Registry.lookupField(315787338003670960L).setLong(this, var1);
   }
}





