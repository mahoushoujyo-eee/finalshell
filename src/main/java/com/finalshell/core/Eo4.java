package com.finalshell.core;

import com.finalshell.ui.model.U0;
import com.finalshell.ui.panel.Ky4;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Eo4 implements Map {
   public Map m;
   public Map a;
   public static long b;

   public Eo4() {
      this((int)b);
   }

   public Eo4(int var1) {
   super();
      U0.P();
      this.m = new HashMap(var1);
      this.a = new HashMap(var1);
      if (Ky4.F$arrString() != null) {
         U0.B(new String[4]);
      }
   }

   public Eo4(Map var1) {
      this(var1.size());
      this.putAll(var1);
   }

   public Object u(Object var1) {
      return this.m.get(var1);
   }

   public Object M(Object var1) {
      return this.a.get(var1);
   }

   public Object E(Object var1) {
      String[] var10000 = U0.P();
      Object var3 = this.m.remove(var1);
      String[] var2 = var10000;
      var10000 = (String[])var3;
      if (var2 != null) {
         if (var3 != null) {
            this.a.remove(var3);
         }

         var10000 = (String[])var3;
      }

      return var10000;
   }

   public Object R(Object var1) {
      String[] var10000 = U0.P();
      Object var3 = this.a.remove(var1);
      String[] var2 = var10000;
      var10000 = (String[])var3;
      if (var2 != null) {
         if (var3 != null) {
            this.m.remove(var3);
         }

         var10000 = (String[])var3;
      }

      return var10000;
   }

   @Override
   public Object put(Object var1, Object var2) {
      String[] var3;
      Object var4;
      label27: {
         label30: {
            var3 = U0.P();
            Map var10000 = this.m;
            Object var10001 = var1;
            if (var3 != null) {
               if (!this.m.containsKey(var1)) {
                  break label30;
               }

               var10000 = this.m;
               var10001 = var1;
            }

            var4 = var10000.get(var10001);
            this.m.remove(var1);
            this.a.remove(var4);
            if (var3 != null) {
               break label27;
            }

            Ky4.K(new String[5]);
         }

         var4 = null;
      }

      Map var6 = this.a;
      Object var7 = var2;
      if (var3 != null) {
         if (this.a.containsKey(var2)) {
            Object var5 = this.a.get(var2);
            this.m.remove(var5);
            this.a.remove(var2);
         }

         this.m.put(var1, var2);
         var6 = this.a;
         var7 = var2;
      }

      var6.put(var7, var1);
      return var4;
   }

   @Override
   public int size() {
      return this.m.size();
   }

   @Override
   public boolean isEmpty() {
      return this.m.isEmpty();
   }

   @Override
   public boolean containsKey(Object var1) {
      return this.m.containsKey(var1);
   }

   @Override
   public boolean containsValue(Object var1) {
      return this.a.containsKey(var1);
   }

   @Override
   public Object get(Object var1) {
      return this.m.get(var1);
   }

   @Override
   public Object remove(Object var1) {
      return this.E(var1);
   }

   @Override
   public void putAll(Map var1) {
      String[] var10000 = U0.P();
      Iterator var3 = var1.entrySet().iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         this.put(var4.getKey(), var4.getValue());
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void clear() {
      this.m.clear();
      this.a.clear();
   }

   @Override
   public Set keySet() {
      return this.m.keySet();
   }

   @Override
   public Collection values() {
      return this.m.values();
   }

   @Override
   public Set entrySet() {
      return this.m.entrySet();
   }

   public Map d() {
      return RT3.H(this.m);
   }

   public Map o() {
      return RT3.H(this.a);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3603658500774711312L;
      long var10002 = -6634757094312620006L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





