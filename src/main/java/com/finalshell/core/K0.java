package com.finalshell.core;

import com.finalshell.util.LZ3;
import java.lang.ref.SoftReference;
import java.util.Map.Entry;

public class K0 implements Entry {
   final Entry x;
   final Object W;
   final LZ3 G;

   K0(LZ3 var1, Entry var2, Object var3) {
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
      this.x.setValue(new SoftReference<>(var1, LZ3.n(this.G)));
      return this.W;
   }
}





