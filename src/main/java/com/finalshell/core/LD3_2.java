package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class LD3_2 extends Ln4_2 {
   public static int v;
   public static int i;
   public static int X;
   int t;
   String E;
   int B;
   String z;
   String K;
   boolean F;
   public static int n;

   public LD3_2() {
      long var2 = 350806123988960857L;
      String var1 = "";
      Ref.s(350806123988960857L, var1, var2);
   }

   @Override
   public void p(String var1) {
      super.p(var1);
   }

   public int H() {
      return Registry.lookupField(246233731721734998L).getInt(this);
   }

   public void u(int var1) {
      Registry.lookupField(246233731721734998L).setInt(this, var1);
   }

   public String B$String() {
      Object var1 = 131343769847123808L;
      return (String)Ref.g(131343769847123808L, var1);
   }

   public void w(String var1) {
      long var3 = 131343769847123808L;
      Ref.s(131343769847123808L, var1, var3);
   }

   public int p() {
      return Registry.lookupField(631564034273974753L).getInt(this);
   }

   public void d(int var1) {
      Registry.lookupField(631564034273974753L).setInt(this, var1);
   }

   public String f() {
      Object var1 = 271928114840425242L;
      return (String)Ref.g(271928114840425242L, var1);
   }

   public void S(String var1) {
      long var3 = 271928114840425242L;
      Ref.s(271928114840425242L, var1, var3);
   }

   public String c() {
      Object var1 = 537038495471492692L;
      return (String)Ref.g(537038495471492692L, var1);
   }

   public void c(String var1) {
      long var3 = 537038495471492692L;
      Ref.s(537038495471492692L, var1, var3);
   }

   public boolean o() {
      return Registry.lookupField(305722795594497236L).getBoolean(this);
   }

   public void s(boolean var1) {
      Registry.lookupField(305722795594497236L).setBoolean(this, var1);
   }

   public Ln4_2 B$ln_4() {
      return new LD3_2();
   }

   static {
      __vfClinit__();
   }

   public static void b(int var0) {
      n = var0;
   }

   public static int e() {
      return n;
   }

   public static int v() {
      int var0 = e();
      return var0 == 0 ? 107 : 0;
   }

   public static void __vfClinit__() {
      long var1 = 4098829763164179555L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "L(§'ü3\f\u0007\u0007\u009b\u008b\u0095ü3\f«";
      int var6 = "L(§'ü3\f\u0007\u0007\u009b\u008b\u0095ü3\f«".length();
      byte var3 = 0;
      b(0);

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

      Registry.lookupField(392143205024518869L).setInt(null, (int)var0[0]);
      Registry.lookupField(319971801115033366L).setInt(null, (int)var0[1]);
      Registry.lookupField(339184634502945253L).setInt(null, 0);
   }
}





