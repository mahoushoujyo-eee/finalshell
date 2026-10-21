package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class GZ_2 {
   public String a;
   public boolean m;
   public long O;
   public int X;

   public GZ_2(String var1, long var2, int var4, boolean var5) {
      long var7 = 209132680130127334L;
      Ref.s(209132680130127334L, var1, var7);
      Registry.lookupField(589745203277410921L).setLong(this, var2);
      Registry.lookupField(520021697125386708L).setBoolean(this, var5);
      Registry.lookupField(455768602156336346L).setInt(this, var4);
   }

   public String z$String() {
      Object var1 = 209132680130127334L;
      return (String)Ref.g(209132680130127334L, var1);
   }

   public void s(String var1) {
      long var3 = 209132680130127334L;
      Ref.s(209132680130127334L, var1, var3);
   }

   public boolean F() {
      return Registry.lookupField(520021697125386708L).getBoolean(this);
   }

   public long z$long() {
      return Registry.lookupField(589745203277410921L).getLong(this);
   }

   public void U(long var1) {
      Registry.lookupField(589745203277410921L).setLong(this, var1);
   }

   public int I() {
      return Registry.lookupField(455768602156336346L).getInt(this);
   }

   public void f(int var1) {
      Registry.lookupField(455768602156336346L).setInt(this, var1);
   }
}





