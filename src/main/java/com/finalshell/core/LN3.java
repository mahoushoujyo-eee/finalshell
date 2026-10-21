package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class LN3 extends Ln4_2 {
   public String v;
   public byte[] j;
   public boolean o;
   public PW3 T;
   public static int x;

   public LN3() {
      Registry.lookupField(493608400358118531L).setBoolean(this, false);
   }

   public String P() {
      Object var1 = 233371333307467846L;
      return (String)Ref.g(233371333307467846L, var1);
   }

   public void v(String var1) {
      long var3 = 233371333307467846L;
      Ref.s(233371333307467846L, var1, var3);
   }

   public byte[] p() {
      Object var1 = 618075449696964647L;
      return (byte[])Ref.g(618075449696964647L, var1);
   }

   public void X(byte[] var1) {
      long var4 = 618075449696964647L;
      Ref.s(618075449696964647L, var1, var4);

      try {
         Registry.packArgs(this);
         long var5 = 181303880124437871L;
         Object var10003 = Ref.h2(181303880124437871L, var5);
         long var8 = 466974556789702365L;
         Object var7 = var10003;
         Ref.s(466974556789702365L, var7, var8);
      } catch (Pc2 var9) {
         var9.printStackTrace();
      }
   }

   @Override
   public Ln4_2 B() {
      return new LN3();
   }

   public boolean s() {
      return Registry.lookupField(493608400358118531L).getBoolean(this);
   }

   public void F(boolean var1) {
      Registry.lookupField(493608400358118531L).setBoolean(this, var1);
   }

   public PW3 h() {
      Object var1 = 466974556789702365L;
      return (PW3)Ref.g(466974556789702365L, var1);
   }

   public void Q(PW3 var1) {
      long var3 = 466974556789702365L;
      Ref.s(466974556789702365L, var1, var3);
   }

   public static void O(int var0) {
      x = var0;
   }

   public static int A() {
      return x;
   }

   public static int v() {
      int var0 = A();
      return var0 == 0 ? 117 : 0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (A() != 0) {
         O(107);
      }
   }
}





