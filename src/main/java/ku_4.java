import java.util.Iterator;
import java.util.Vector;

public class ku_4 {
   public long w;
   public long t;
   Thread a;
   int x;
   Vector l;
   cx_4 P;
   public int T = 0;
   public int j;

   public ku_4() {
      this(2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public ku_4(int var1) {
      boolean var10000 = cN_3.B();
      this.j = 0;
      boolean var2 = var10000;
      this.x = var1;
      this.l = new Vector();
      int var3 = 0;
      if (var2) {
         cx_4 var4 = new cx_4();
         if (!var2) {
            if (var3 == 0) {
               this.P = var4;
            }

            this.l.add(var4);
         }

         var3++;
      }

      for (; var3 < var1; var3++) {
         cx_4 var5 = new cx_4();
         if (!var2) {
            if (var3 == 0) {
               this.P = var5;
            }

            this.l.add(var5);
         }
      }

      this.a = new mu_2(this);
      this.a.start();
      if (com.ky_4.F() != null) {
         cN_3.y(!var2);
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
   void u() {
      boolean var10000 = cN_3.B();
      int var2 = 0;
      boolean var1 = var10000;
      int var3 = 0;
      Iterator var5 = this.l.iterator();
      if (var1) {
         com.ky_4.K(new String[3]);
         cx_4 var4 = (cx_4)var5.next();
         var2 += var4.t;
         var3 += var4.u;
      }

      while (true) {
         while (var5.hasNext()) {
            cx_4 var6 = (cx_4)var5.next();
            var2 += var6.t;
            var3 += var6.u;
         }

         this.T = (int)((float)var3 / (float)this.l.size());
         this.j = (int)((float)var2) / this.l.size();
         this.l.remove(0);
         cx_4 var7 = new cx_4();
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





