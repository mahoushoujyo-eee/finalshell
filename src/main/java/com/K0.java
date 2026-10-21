package com;

import java.lang.ref.SoftReference;
import java.util.Map.Entry;

class K0 implements Entry {
   final Entry x;
   final Object W;
   final com.lZ_3 G;

   K0(com.lZ_3 var1, Entry var2, Object var3) {
      this.G = var1;
      this.x = var2;
      this.W = var3;
   }

   @Override
   public Object getKey() {
      return this.x.getKey();
   }

   @Override
   public Object getValue() {
      return this.W;
   }

   @Override
   public Object setValue(Object var1) {
      this.x.setValue(new SoftReference(var1, com.lZ_3.n(this.G)));
      return this.W;
   }
}





