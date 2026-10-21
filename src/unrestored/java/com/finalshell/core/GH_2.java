package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class GH_2 {
   public boolean V;
   public boolean B;
   public int U;
   public Runnable N;
   public static int m;
   public static int E;
   public static int y;
   public Thread K;
   public long Q;
   public int w;
   public boolean k;
   public boolean a;
   public String C;

   static {
      __vfClinit__();
   }

   public GH_2(Runnable var1, int var2) {
      Ref.s(564555266966771525L, this, false);
      long var4 = 257596131995932042L;
      Ref.s(257596131995932042L, var1, var4);
      Ref.s(153556024938273560L, this, var2);
   }

   public void Z() {
      String var1 = D82_2.Q();
      GH_2 var10000 = this;
      if (var1 == null) {
         if (((Boolean)Ref.g(560010910551261201L, this)).booleanValue()) {
            return;
         }

         Ref.s(560010910551261201L, this, true);
         var10000 = this;
      }

      if (var1 == null) {
         Object var2 = 129202526525324511L;
         if ((Thread)Ref.g(129202526525324511L, var2) != null) {
            Object var4 = 129202526525324511L;
            ((Thread)Ref.g(129202526525324511L, var4)).interrupt();
         }
      }

      Ref.s(505602397498011009L, var10000, true);
   }

   public boolean F() {
      return ((Boolean)Ref.g(505602397498011009L, this)).booleanValue();
   }

   public boolean v() {
      return ((Boolean)Ref.g(265865036711565556L, this)).booleanValue();
   }

   public long X$long() {
      return ((Long)Ref.g(323336845158005131L, this)).longValue();
   }

   public void I(long var1) {
      Ref.s(323336845158005131L, this, var1);
   }

   public int e() {
      return ((Integer)Ref.g(459368670286305418L, this)).intValue();
   }

   public void k(int var1) {
      Ref.s(459368670286305418L, this, var1);
   }

   public Runnable c() {
      Object var1 = 257596131995932042L;
      return (Runnable)Ref.g(257596131995932042L, var1);
   }

   public void l(Runnable var1) {
      long var3 = 257596131995932042L;
      Ref.s(257596131995932042L, var1, var3);
   }

   public int X$int() {
      return ((Integer)Ref.g(153556024938273560L, this)).intValue();
   }

   public void R(int var1) {
      Ref.s(153556024938273560L, this, var1);
   }

   public boolean r() {
      return ((Boolean)Ref.g(564555266966771525L, this)).booleanValue();
   }

   public void j(boolean var1) {
      Ref.s(564555266966771525L, this, var1);
   }

   public boolean R$boolean() {
      return ((Boolean)Ref.g(560010910551261201L, this)).booleanValue();
   }

   public Thread q() {
      Object var1 = 129202526525324511L;
      return (Thread)Ref.g(129202526525324511L, var1);
   }

   public void K(Thread var1) {
      long var3 = 129202526525324511L;
      Ref.s(129202526525324511L, var1, var3);
   }

   public String R$String() {
      Object var1 = 405895317232152174L;
      return (String)Ref.g(405895317232152174L, var1);
   }

   public void M(String var1) {
      long var3 = 405895317232152174L;
      Ref.s(405895317232152174L, var1, var3);
   }

   public static void __vfClinit__() {
      long var1 = 1430174936627474900L;
      long[] var0 = new long[3];
      int var4 = 0;
      String var5 = "Âl\u0099&\bXñ±äÿÉk\bXñ°\u009bK¼ï\bXñ\u008e";
      int var6 = "Âl\u0099&\bXñ±äÿÉk\bXñ°\u009bK¼ï\bXñ\u008e".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

      Ref.setInt(523223126306371045L, null, (int)var0[2]);
      Ref.setInt(171346713126145274L, null, (int)var0[1]);
      Ref.setInt(439517225992595079L, null, (int)var0[0]);
   }
}





