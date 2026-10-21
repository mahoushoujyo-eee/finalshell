package com.finalshell.core;

import com.finalshell.ui.model.SY;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Random;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YP {
   public static EnumSet o;
   public static YP r;
   public static WeakHashMap j;
   public Et2 a;
   public Et2 v;
   public final EnumSet U;
   public int w = new Random().nextInt();
   boolean W = false;
   boolean m = false;
   boolean f;
   boolean c;

   public YP() {
      this(null, null, o);
   }

   public YP(@Nullable Et2 var1, @Nullable Et2 var2) {
      this(var1, var2, o);
   }

   public YP(@Nullable Et2 var1, @Nullable Et2 var2, @NotNull EnumSet var3) {
      this.a = var1;
      this.v = var2;
      this.U = var3.clone();
   }

   public boolean u() {
      return this.c;
   }

   public void Z(boolean var1) {
      this.c = var1;
   }

   public void d(Et2 var1) {
      this.v = var1;
   }

   public void p(Et2 var1) {
      this.a = var1;
   }

   public boolean w() {
      return this.f;
   }

   public void t(boolean var1) {
      this.f = var1;
   }

   public boolean r() {
      return this.W;
   }

   public void C(boolean var1) {
      String var2 = Dx4.g();
      YP var10000 = this;
      if (var2 == null) {
         if (!this.W && var1) {
         }

         var10000 = this;
      }

      var10000.W = var1;
   }

   public boolean a() {
      return this.m;
   }

   public void e(boolean var1) {
      this.m = var1;
   }

   public YP q$YP() {
      YP var1 = new YP(this.a, this.v, this.U);
      var1.e(this.m);
      var1.C(this.W);
      var1.t(this.f);
      return var1;
   }

   public int q$int() {
      return this.w;
   }

   @NotNull
   public static YP P(YP var0) {
      String var1 = Dx4.g();
      Object var10000 = var0;
      if (var1 == null) {
         if (var0 instanceof Yw2) {
            return var0;
         }

         var10000 = j.get(var0);
      }

      WeakReference var2 = (WeakReference)var10000;
      if (var1 == null) {
         if (var2 != null) {
            YP var3 = (YP)var2.get();
            if (var1 != null) {
               return var3;
            }

            if (var3 != null) {
               return var3;
            }
         }

         j.put(var0, new WeakReference<>(var0));
      }

      return var0;
   }

   @Nullable
   public Et2 K() {
      return this.a;
   }

   @Nullable
   public Et2 s() {
      return this.v;
   }

   public YP j() {
      return new YP(this.a, this.v);
   }

   public boolean v(SY var1) {
      return this.U.contains(var1);
   }

   @Override
   public boolean equals(Object var1) {
      String var2 = Dx4.g();
      Object var10000 = this;
      if (var2 == null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var10000 != null) {
         var10000 = this.getClass();
         if (var2 == null) {
            if (var10000 != var1.getClass()) {
               return false;
            }

            var10000 = var1;
         }

         YP var3 = (YP)var10000;
         boolean var5 = Objects.equals(this.a, var3.a);
         if (var2 == null) {
            if (!var5) {
               return false;
            }

            var5 = Objects.equals(this.v, var3.v);
         }

         if (var2 == null) {
            if (!var5) {
               return false;
            }

            var5 = this.U.equals(var3.U);
         }

         return var2 != null ? var5 : var5;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.v, this.U);
   }

   public Et2 Z() {
      String var1 = Dx4.g();
      YP var10000 = this;
      if (var1 == null) {
         if (this.U.contains(SY.INVERSE)) {
            return this.a;
         }

         var10000 = this;
      }

      return var10000.v;
   }

   public Et2 O() {
      String var1 = Dx4.g();
      YP var10000 = this;
      if (var1 == null) {
         if (this.U.contains(SY.INVERSE)) {
            return this.v;
         }

         var10000 = this;
      }

      return var10000.a;
   }

   @NotNull
   public AG n() {
      return new AG(this);
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      return this.q$YP();
   }

   static Et2 i(YP var0) {
      return var0.a;
   }

   static Et2 r(YP var0) {
      return var0.v;
   }

   static EnumSet h(YP var0) {
      return var0.U;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      o = EnumSet.noneOf(SY.class);
      r = new YP();
      j = new WeakHashMap();
   }
}





