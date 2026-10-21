package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.util.ArrayList;

public class UI3 {
   String v;
   public long J;
   public long X;
   long y;
   long l;
   long C;
   long G;
   public ArrayList e;
   public ArrayList O;
   int d;
   public static long a;

   public UI3() {
      ArrayList var10001 = new ArrayList();
      long var2 = 400438251718288839L;
      ArrayList var1 = var10001;
      Ref.s(400438251718288839L, var1, var2);
      ArrayList var10002 = new ArrayList();
      long var4 = 559298368859498848L;
      ArrayList var3 = var10002;
      Ref.s(559298368859498848L, var3, var4);
      int var10003 = (int)a;
      Registry.lookupField(469312586073532900L).setInt(this, var10003);
   }

   public void t() {
      Object var1 = 400438251718288839L;
      ((ArrayList)Ref.g(400438251718288839L, var1)).clear();
      Object var3 = 559298368859498848L;
      ((ArrayList)Ref.g(559298368859498848L, var3)).clear();
   }

   public long O() {
      return Registry.lookupField(276405647390720435L).getLong(this);
   }

   public synchronized void e(long var1) {
      KV.b$arrString();
      Registry.lookupField(276405647390720435L).setLong(this, var1);
      Object var9 = 400438251718288839L;
      ((ArrayList)Ref.g(400438251718288839L, var9)).add(Registry.lookupField(276405647390720435L).getLong(this));
      UI3 var3 = this;
      Object var11 = 400438251718288839L;
      if (this == null && ((ArrayList)Ref.g(400438251718288839L, var11)).size() > Registry.lookupField(469312586073532900L).getInt(this)) {
         Object var13 = 400438251718288839L;
         ((ArrayList)Ref.g(400438251718288839L, var13)).remove(0);
      }

      long var4 = 0L;
      Object var15 = 400438251718288839L;

      for (long var7 : (ArrayList)Ref.g(400438251718288839L, var15)) {
         var4 += var7;
         if (var3 != null) {
            break;
         }
      }
   }

   public long y() {
      return Registry.lookupField(345009583953251357L).getLong(this);
   }

   public synchronized void Y(long var1) {
      String[] var10000 = KV.b$arrString();
      Registry.lookupField(345009583953251357L).setLong(this, var1);
      String[] var3 = var10000;
      Object var9 = 559298368859498848L;
      ((ArrayList)Ref.g(559298368859498848L, var9)).add(Registry.lookupField(345009583953251357L).getLong(this));
      Object var11 = 559298368859498848L;
      if (var3 == null && ((ArrayList)Ref.g(559298368859498848L, var11)).size() > Registry.lookupField(469312586073532900L).getInt(this)) {
         Object var13 = 559298368859498848L;
         ((ArrayList)Ref.g(559298368859498848L, var13)).remove(0);
      }

      long var4 = 0L;
      Object var15 = 559298368859498848L;

      for (long var7 : (ArrayList)Ref.g(559298368859498848L, var15)) {
         var4 += var7;
         if (var3 != null) {
            break;
         }
      }
   }

   public ArrayList W() {
      Object var1 = 400438251718288839L;
      return (ArrayList)Ref.g(400438251718288839L, var1);
   }

   public synchronized ArrayList I() {
      ArrayList var1 = new ArrayList();
      Object var2 = 400438251718288839L;
      this.addAll((ArrayList)Ref.g(400438251718288839L, var2));
      return var1;
   }

   public synchronized ArrayList k() {
      ArrayList var1 = new ArrayList();
      Object var2 = 559298368859498848L;
      this.addAll((ArrayList)Ref.g(559298368859498848L, var2));
      return var1;
   }

   public void d() {
      Registry.lookupField(492627762665069625L).setLong(this, 0L);
      Registry.lookupField(354679426752562901L).setLong(this, 0L);
      Registry.lookupField(378121677769114664L).setLong(this, 0L);
      Registry.lookupField(454115681480069499L).setLong(this, 0L);
   }

   public ArrayList T$ArrayList() {
      Object var1 = 559298368859498848L;
      return (ArrayList)Ref.g(559298368859498848L, var1);
   }

   public void y(ArrayList var1) {
      long var3 = 559298368859498848L;
      Ref.s(559298368859498848L, var1, var3);
   }

   public long T$long() {
      return Registry.lookupField(454115681480069499L).getLong(this);
   }

   public void h(long var1) {
      Registry.lookupField(454115681480069499L).setLong(this, var1);
   }

   public long r() {
      return Registry.lookupField(378121677769114664L).getLong(this);
   }

   public void T(long var1) {
      Registry.lookupField(378121677769114664L).setLong(this, var1);
   }

   public long Y() {
      return Registry.lookupField(354679426752562901L).getLong(this);
   }

   public void o(long var1) {
      Registry.lookupField(354679426752562901L).setLong(this, var1);
   }

   public long g() {
      return Registry.lookupField(492627762665069625L).getLong(this);
   }

   public void y(long var1) {
      Registry.lookupField(492627762665069625L).setLong(this, var1);
   }

   public String U() {
      Object var1 = 493900951344634838L;
      return (String)Ref.g(493900951344634838L, var1);
   }

   public void y(String var1) {
      long var3 = 493900951344634838L;
      Ref.s(493900951344634838L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2690515540993287461L;
      long var10002 = -362586666020199415L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





