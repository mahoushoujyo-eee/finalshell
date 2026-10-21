package com.finalshell.core;

import com.finalshell.task.Mu2;
import com.finalshell.ui.panel.Ky4;
import java.util.Iterator;
import java.util.Vector;

public class Ku4 {
   public long w;
   public long t;
   public Thread a;
   public int x;
   public Vector l;
   public Cx4_2 P;
   public int T = 0;
   public int j;

   public Ku4() {
      this(2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public Ku4(int var1) {
      boolean var10000 = CN3.B();
      this.j = 0;
      boolean var2 = var10000;
      this.x = var1;
      this.l = new Vector();
      int var3 = 0;
      if (var2) {
         Cx4_2 var4 = new Cx4_2();
         if (!var2) {
            if (var3 == 0) {
               this.P = var4;
            }

            this.l.add(var4);
         }

         var3++;
      }

      for (; var3 < var1; var3++) {
         Cx4_2 var5 = new Cx4_2();
         if (!var2) {
            if (var3 == 0) {
               this.P = var5;
            }

            this.l.add(var5);
         }
      }

      this.a = new Mu2(this);
      this.a.start();
      if (Ky4.F$arrString() != null) {
         CN3.y(!var2);
      }
   }

   public void c() {
      this.a.interrupt();
   }

   public int j() {
      return this.T;
   }

   public void w(int var1) {
      this.T = var1;
   }

   public int z() {
      return this.j;
   }

   public void p(int var1) {
      this.j = var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void u() {
      boolean var10000 = CN3.B();
      int var2 = 0;
      boolean var1 = var10000;
      int var3 = 0;
      Iterator var5 = this.l.iterator();
      if (var1) {
         Ky4.K(new String[3]);
         Cx4_2 var4 = (Cx4_2)var5.next();
         var2 += var4.t;
         var3 += var4.u;
      }

      while (true) {
         while (var5.hasNext()) {
            Cx4_2 var6 = (Cx4_2)var5.next();
            var2 += var6.t;
            var3 += var6.u;
         }

         this.T = (int)((float)var3 / (float)this.l.size());
         this.j = (int)((float)var2) / this.l.size();
         this.l.remove(0);
         Cx4_2 var7 = new Cx4_2();
         this.P = var7;
         this.l.add(var7);
         if (!var1) {
            return;
         }

         var3 += var7.u;
      }
   }

   public void j(int var1) {
      this.t += (long)var1;
      this.P.w(var1);
   }

   public void l(int var1) {
      this.w += (long)var1;
      this.P.b(var1);
   }

   public void B() {
   }

   public void W() {
   }

   public void W(int var1) {
   }

   public void A(int var1) {
   }
}





