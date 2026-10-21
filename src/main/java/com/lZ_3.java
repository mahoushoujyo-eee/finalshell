package com;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class lZ_3 extends AbstractMap implements Serializable {
   private final Map w = new HashMap();
   private final Map R = new HashMap();
   private final ReferenceQueue B = new ReferenceQueue();
   private static int[] G;

   @Override
   public Object get(Object var1) {
      int[] var10000 = O();
      this.L();
      Object var3 = null;
      SoftReference var4 = (SoftReference)this.w.get(var1);
      int[] var2 = var10000;
      var10000 = (int[])var4;
      if (var2 != null) {
         if (var4 == null) {
            return var3;
         }

         var10000 = (int[])var4.get();
      }

      var3 = var10000;
      if (var2 == null) {
         return var3;
      } else {
         if (var3 == null) {
            this.w.remove(var1);
            this.R.remove(var4);
         }

         return var3;
      }
   }

   private void L() {
      int[] var1 = O();

      Reference var2;
      while ((var2 = this.B.poll()) != null) {
         this.w.remove(this.R.remove(var2));
         if (var1 == null) {
            break;
         }
      }
   }

   @Override
   public Object put(Object var1, Object var2) {
      int[] var10000 = O();
      this.L();
      SoftReference var4 = new SoftReference(var2, this.B);
      this.R.put(var4, var1);
      int[] var3 = var10000;
      SoftReference var5 = this.w.put(var1, var4);
      var10000 = (int[])var5;
      if (var3 != null) {
         if (var5 == null) {
            return null;
         }

         var10000 = (int[])var5.get();
      }

      if (var3 == null) {
         com.ky_4.K(new String[5]);
      }

      return var10000;
   }

   @Override
   public Object remove(Object var1) {
      int[] var10000 = O();
      this.L();
      int[] var2 = var10000;
      SoftReference var3 = (SoftReference)this.w.remove(var1);
      var10000 = (int[])var3;
      if (var2 != null) {
         if (var3 == null) {
            return null;
         }

         var10000 = (int[])var3.get();
      }

      return var10000;
   }

   @Override
   public void clear() {
      this.w.clear();
      this.R.clear();
   }

   @Override
   public int size() {
      this.L();
      return this.w.size();
   }

   @Override
   public Set entrySet() {
      int[] var10000 = O();
      this.L();
      int[] var1 = var10000;
      LinkedHashSet var2 = new LinkedHashSet();

      for (Entry var4 : this.w.entrySet()) {
         Object var5 = ((SoftReference)var4.getValue()).get();
         if (var5 != null) {
            var2.add(new com.K0(this, var4, var5));
         }

         if (var1 == null) {
            break;
         }
      }

      if (com.ky_4.F() != null) {
         F(new int[5]);
      }

      return var2;
   }

   static ReferenceQueue n(com.lZ_3 var0) {
      return var0.B;
   }

   public static void F(int[] var0) {
      G = var0;
   }

   public static int[] O() {
      return G;
   }

   static {
      if (O() == null) {
         F(new int[1]);
      }
   }
}





