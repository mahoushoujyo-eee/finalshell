package com.finalshell.core;

import com.finalshell.reflect.Registry;

public class BL3 {
   public int v;
   public long d;

   public int n() {
      return Registry.lookupField(168509883017378586L).getInt(this);
   }

   public void h(int var1) {
      Registry.lookupField(168509883017378586L).setInt(this, var1);
   }

   public long J() {
      return Registry.lookupField(485470392441495230L).getLong(this);
   }

   public void V(long var1) {
      Registry.lookupField(485470392441495230L).setLong(this, var1);
   }
}





