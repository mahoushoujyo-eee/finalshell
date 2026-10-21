package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.Iterator;
import java.util.Vector;

public class Mm2 {
   public long A;
   public long K;
   public Thread S;
   public int q;
   public Vector s;
   public Oh4_2 Q;
   public int f = 0;
   public int F = 0;
   public static boolean Z;

   public static void K(String[] var0) {
      Mm2 var1 = new Mm2();
      com.finalshell.task.W var2 = new com.finalshell.task.W(var1);
      var2.start();
   }

   public Mm2() {
      this(2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public Mm2(int var1) {
      boolean var10000 = O();
      this.q = var1;
      this.s = new Vector();
      boolean var2 = var10000;
      int var3 = 0;
      if (!var2) {
         Oh4_2 var4 = new Oh4_2();
         if (var2) {
            if (var3 == 0) {
               this.Q = var4;
            }

            this.s.add(var4);
         }

         var3++;
      }

      for (; var3 < var1; var3++) {
         Oh4_2 var5 = new Oh4_2();
         if (var2) {
            if (var3 == 0) {
               this.Q = var5;
            }

            this.s.add(var5);
         }
      }

      this.S = new com.finalshell.task.WB(this);
      this.S.start();
      if (Ky4.F$arrString() != null) {
         i(!var2);
      }
   }

   public void G() {
      this.S.interrupt();
   }

   public int H() {
      return this.f;
   }

   public void S(int var1) {
      this.f = var1;
   }

   public int p() {
      return this.F;
   }

   public void L(int var1) {
      this.F = var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void M() {
      boolean var10000 = Q();
      int var2 = 0;
      int var3 = 0;
      boolean var1 = var10000;
      Iterator var5 = this.s.iterator();
      if (var1) {
         Ky4.K(new String[1]);
         Oh4_2 var4 = (Oh4_2)var5.next();
         var2 += var4.K;
         var3 += var4.u;
      }

      while (true) {
         while (var5.hasNext()) {
            Oh4_2 var6 = (Oh4_2)var5.next();
            var2 += var6.K;
            var3 += var6.u;
         }

         this.f = (int)((float)var3 / (float)this.s.size());
         this.F = (int)((float)var2) / this.s.size();
         this.s.remove(0);
         Oh4_2 var7 = new Oh4_2();
         this.Q = var7;
         this.s.add(var7);
         if (!var1) {
            return;
         }

         var3 += var7.u;
      }
   }

   public void l(int var1) {
      this.K += (long)var1;
      this.Q.q(var1);
   }

   public void i(int var1) {
      this.A += (long)var1;
      this.Q.k(var1);
   }

   public void j() {
   }

   public void a() {
   }

   public void H(int var1) {
   }

   public void y(int var1) {
   }

   public static void i(boolean var0) {
      Z = var0;
   }

   public static boolean O() {
      return Z;
   }

   public static boolean Q() {
      boolean var0 = O();
      return !var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (!O()) {
         i(true);
      }
   }
}





