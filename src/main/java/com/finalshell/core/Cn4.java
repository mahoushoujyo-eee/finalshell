package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

public class Cn4 {
   String n;
   String O;
   boolean g;
   boolean t;
   boolean L;
   int A;
   Zh2_2 r;
   KV U;
   HashSet N;

   public Cn4() {
      HashSet var10001 = new HashSet();
      long var2 = 514516057646380455L;
      HashSet var1 = var10001;
      Ref.s(514516057646380455L, var1, var2);
   }

   public void V(String var1) {
      Object var2 = 514516057646380455L;
      ((HashSet)Ref.g(514516057646380455L, var2)).add(var1);
   }

   public int G() {
      Object var1 = 514516057646380455L;
      return ((HashSet)Ref.g(514516057646380455L, var1)).size();
   }

   public String B$String() {
      Object var1 = 630347306118036886L;
      return (String)Ref.g(630347306118036886L, var1);
   }

   public void a(String var1) {
      int[] var2 = com.finalshell.ui.panel.YQ.m();
      Object var10001 = var1;
      if (var2 != null) {
         long var4 = 630347306118036886L;
         Ref.s(630347306118036886L, var1, var4);
         if (var1 == null) {
            return;
         }

         var10001 = this;
      }

      var10001 = Registry.packArgs(var10001);
      long var6 = 419278803587653136L;
      Object[] var5 = (Object[])var10001;
      Ref.h(419278803587653136L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public String c() {
      Object var1 = 600495477565496970L;
      return (String)Ref.g(600495477565496970L, var1);
   }

   public void Q(String var1) {
      long var3 = 600495477565496970L;
      Ref.s(600495477565496970L, var1, var3);
   }

   public boolean E() {
      return Registry.lookupField(430453442639568160L).getBoolean(this);
   }

   public void x(boolean var1) {
      Registry.lookupField(430453442639568160L).setBoolean(this, var1);
   }

   public boolean B$boolean() {
      return Registry.lookupField(155088746315920746L).getBoolean(this);
   }

   public void e(boolean var1) {
      Registry.lookupField(155088746315920746L).setBoolean(this, var1);
   }

   public int Y() {
      return Registry.lookupField(192203579081304091L).getInt(this);
   }

   public void n(int var1) {
      Registry.lookupField(192203579081304091L).setInt(this, var1);
   }

   public Zh2_2 W() {
      Object var1 = 261313468987900257L;
      return (Zh2_2)Ref.g(261313468987900257L, var1);
   }

   public void n(Zh2_2 var1) {
      long var3 = 261313468987900257L;
      Ref.s(261313468987900257L, var1, var3);
   }

   public boolean a() {
      return Registry.lookupField(409389968211315794L).getBoolean(this);
   }

   public void L(boolean var1) {
      Registry.lookupField(409389968211315794L).setBoolean(this, var1);
   }

   public KV C() {
      Object var1 = 386569180623392168L;
      return (KV)Ref.g(386569180623392168L, var1);
   }

   public void y(KV var1) {
      long var3 = 386569180623392168L;
      Ref.s(386569180623392168L, var1, var3);
   }
}





