package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class YE {
   public static int e;
   public static int H;
   public static int A;
   public int z;
   public String n;
   public int G;
   public int E;
   public String g;
   public String u;
   public int I;
   public boolean J;
   public static int[] W;

   public YE() {
      Registry.lookupField(599097404547531905L).setBoolean(this, false);
   }

   public int t() {
      return Registry.lookupField(535903555827317970L).getInt(this);
   }

   public void Q(int var1) {
      Registry.lookupField(535903555827317970L).setInt(this, var1);
   }

   public int O() {
      return Registry.lookupField(229300282789615821L).getInt(this);
   }

   public void t(int var1) {
      Registry.lookupField(229300282789615821L).setInt(this, var1);
   }

   public int r() {
      return Registry.lookupField(530838633911506304L).getInt(this);
   }

   public void F(int var1) {
      Registry.lookupField(530838633911506304L).setInt(this, var1);
   }

   public String b() {
      Object var1 = 203328808028409851L;
      return (String)Ref.g(203328808028409851L, var1);
   }

   public void y(String var1) {
      long var3 = 203328808028409851L;
      Ref.s(203328808028409851L, var1, var3);
   }

   @Override
   public String toString() {
      Object var1 = 203328808028409851L;
      return (String)Ref.g(203328808028409851L, var1);
   }

   public boolean H() {
      return Registry.lookupField(599097404547531905L).getBoolean(this);
   }

   public void d(boolean var1) {
      Registry.lookupField(599097404547531905L).setBoolean(this, var1);
   }

   public String B() {
      Object var1 = 156169966542756743L;
      return (String)Ref.g(156169966542756743L, var1);
   }

   public void V(String var1) {
      long var3 = 156169966542756743L;
      Ref.s(156169966542756743L, var1, var3);
   }

   public String A() {
      Object var1 = 273857012092198885L;
      return (String)Ref.g(273857012092198885L, var1);
   }

   public void T(String var1) {
      long var3 = 273857012092198885L;
      Ref.s(273857012092198885L, var1, var3);
   }

   public int D() {
      return Registry.lookupField(357868404620533321L).getInt(this);
   }

   public void C(int var1) {
      Registry.lookupField(357868404620533321L).setInt(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static void W(int[] var0) {
      W = var0;
   }

   public static int[] n() {
      return W;
   }

   public static void __vfClinit__() {
      long var1 = 5864339385746299505L;
      long[] var0 = new long[3];
      int var4 = 0;
      String var5 = "K½G>É½\u009a¹\nÁ©0É½\u009a\u0015]×\u0012ÊÉ½\u009b]";
      int var6 = "K½G>É½\u009a¹\nÁ©0É½\u009a\u0015]×\u0012ÊÉ½\u009b]".length();
      byte var3 = 0;
      W(null);

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var1;
         byte var10003 = -1;
         var0[var10001] = var10004;
      } while (var3 < var6);

      Registry.lookupField(297191265528158022L).setInt(null, (int)var0[2]);
      Registry.lookupField(343042688357189616L).setInt(null, (int)var0[0]);
      Registry.lookupField(314583299194608155L).setInt(null, (int)var0[1]);
   }
}





