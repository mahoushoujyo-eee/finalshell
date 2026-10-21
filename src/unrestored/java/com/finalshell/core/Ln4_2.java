package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public abstract class Ln4_2 {
   public String y;
   public String O;
   public int S;
   public String a;
   public long Z;
   public long G;
   public long s;
   public long U;
   public long P;
   public long b;
   public long L;
   public static boolean R;

   public Ln4_2() {
      Registry.emptyArgs();
      long var1 = 236040230540929068L;
      Object var10002 = Ref.h2(236040230540929068L, var1);
      long var4 = 469940910977292411L;
      Object var3 = var10002;
      Ref.s(469940910977292411L, var3, var4);
   }

   public abstract Ln4_2 B();

   public long c() {
      return Registry.lookupField(367267596504705820L).getLong(this);
   }

   public void Z(long var1) {
      Registry.lookupField(367267596504705820L).setLong(this, var1);
   }

   public long T() {
      return Registry.lookupField(175353713507913948L).getLong(this);
   }

   public void x(long var1) {
      Registry.lookupField(175353713507913948L).setLong(this, var1);
   }

   public long q() {
      return Registry.lookupField(263023896137074983L).getLong(this);
   }

   public void G(long var1) {
      Registry.lookupField(263023896137074983L).setLong(this, var1);
   }

   public int Y() {
      return Registry.lookupField(276073657800783051L).getInt(this);
   }

   public void Z(int var1) {
      Registry.lookupField(276073657800783051L).setInt(this, var1);
   }

   public long l() {
      return Registry.lookupField(389000664659847042L).getLong(this);
   }

   public void J(long var1) {
      Registry.lookupField(389000664659847042L).setLong(this, var1);
   }

   public String F() {
      Object var1 = 350806123988960857L;
      return (String)Ref.g(350806123988960857L, var1);
   }

   public void z(String var1) {
      long var3 = 350806123988960857L;
      Ref.s(350806123988960857L, var1, var3);
   }

   public String g() {
      Object var1 = 469940910977292411L;
      return (String)Ref.g(469940910977292411L, var1);
   }

   public void p(String var1) {
      long var3 = 469940910977292411L;
      Ref.s(469940910977292411L, var1, var3);
   }

   public String J() {
      Object var1 = 200133482699923083L;
      return (String)Ref.g(200133482699923083L, var1);
   }

   public void R(String var1) {
      long var3 = 200133482699923083L;
      Ref.s(200133482699923083L, var1, var3);
   }

   public long w() {
      return Registry.lookupField(165455792488885275L).getLong(this);
   }

   public void v(long var1) {
      Registry.lookupField(165455792488885275L).setLong(this, var1);
   }

   @Override
   public String toString() {
      new StringBuilder();
      String var10002 = (String)(Registry.emptyArgs());
      long var2 = 286931176286176762L;
      Object var1 = var10002;
      var10002 = Ref.h(286931176286176762L, var1, var2);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      this.append((String)var10002).append(" ");
      String var10003 = (String)(Registry.emptyArgs());
      long var4 = 194080076253066315L;
      Object var3 = var10003;
      var10003 = Ref.h(194080076253066315L, var3, var4);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      return this.append((String)var10003).toString();
   }

   public long y() {
      return Registry.lookupField(271778103214377343L).getLong(this);
   }

   public void d(long var1) {
      Registry.lookupField(271778103214377343L).setLong(this, var1);
   }

   public long b() {
      return Registry.lookupField(482903438334262492L).getLong(this);
   }

   public void n(long var1) {
      Registry.lookupField(482903438334262492L).setLong(this, var1);
   }

   public static void O(boolean var0) {
      R = var0;
   }

   public static boolean R() {
      return R;
   }

   public static boolean i() {
      boolean var0 = R();
      return !var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (R()) {
         O(true);
      }
   }
}





