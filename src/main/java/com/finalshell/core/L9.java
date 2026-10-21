package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

public class L9 {
   public String J;
   public String i;
   public boolean a;
   public boolean N;
   public boolean s;
   public int L;
   public Zh2_2 z;
   public KV c;
   public HashSet v;
   public static int[] k;

   public L9() {
      HashSet var10001 = new HashSet();
      long var2 = 196959233489421900L;
      HashSet var1 = var10001;
      Ref.s(196959233489421900L, var1, var2);
   }

   public void c(String var1) {
      Object var2 = 196959233489421900L;
      ((HashSet)Ref.g(196959233489421900L, var2)).add(var1);
   }

   public int C() {
      Object var1 = 196959233489421900L;
      return ((HashSet)Ref.g(196959233489421900L, var1)).size();
   }

   public String o() {
      Object var1 = 320742864705291608L;
      return (String)Ref.g(320742864705291608L, var1);
   }

   public void u(String var1) {
      int[] var2 = X();
      Object var10001 = var1;
      if (var2 == null) {
         long var4 = 320742864705291608L;
         Ref.s(320742864705291608L, var1, var4);
         if (var1 == null) {
            return;
         }

         var10001 = this;
      }

      var10001 = Registry.packArgs(var10001);
      long var6 = 378849519055405264L;
      Object[] var5 = (Object[])var10001;
      Ref.h(378849519055405264L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public String K() {
      Object var1 = 131287010932144231L;
      return (String)Ref.g(131287010932144231L, var1);
   }

   public void V(String var1) {
      long var3 = 131287010932144231L;
      Ref.s(131287010932144231L, var1, var3);
   }

   public boolean y() {
      return Registry.lookupField(289896148011038420L).getBoolean(this);
   }

   public void V(boolean var1) {
      Registry.lookupField(289896148011038420L).setBoolean(this, var1);
   }

   public boolean s() {
      return Registry.lookupField(635527125572129349L).getBoolean(this);
   }

   public void g(boolean var1) {
      Registry.lookupField(635527125572129349L).setBoolean(this, var1);
   }

   public int O() {
      return Registry.lookupField(159321665489106190L).getInt(this);
   }

   public void l(int var1) {
      Registry.lookupField(159321665489106190L).setInt(this, var1);
   }

   public Zh2_2 F() {
      Object var1 = 570637810374567417L;
      return (Zh2_2)Ref.g(570637810374567417L, var1);
   }

   public void P(Zh2_2 var1) {
      long var3 = 570637810374567417L;
      Ref.s(570637810374567417L, var1, var3);
   }

   public boolean i() {
      return Registry.lookupField(466904403992138213L).getBoolean(this);
   }

   public void y(boolean var1) {
      Registry.lookupField(466904403992138213L).setBoolean(this, var1);
   }

   public KV r() {
      Object var1 = 419207569098345878L;
      return (KV)Ref.g(419207569098345878L, var1);
   }

   public void E(KV var1) {
      long var3 = 419207569098345878L;
      Ref.s(419207569098345878L, var1, var3);
   }

   public static void A(int[] var0) {
      k = var0;
   }

   public static int[] X() {
      return k;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (X() != null) {
         A(new int[3]);
      }
   }
}





