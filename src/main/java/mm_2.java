import java.util.Iterator;
import java.util.Vector;

public class mm_2 {
   public long A;
   public long K;
   Thread S;
   int q;
   Vector s;
   oh_4 Q;
   public int f = 0;
   public int F = 0;
   private static boolean Z;

   public static void K(String[] var0) {
      mm_2 var1 = new mm_2();
      W var2 = new W(var1);
      var2.start();
   }

   public mm_2() {
      this(2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public mm_2(int var1) {
      boolean var10000 = O();
      this.q = var1;
      this.s = new Vector();
      boolean var2 = var10000;
      int var3 = 0;
      if (!var2) {
         oh_4 var4 = new oh_4();
         if (var2) {
            if (var3 == 0) {
               this.Q = var4;
            }

            this.s.add(var4);
         }

         var3++;
      }

      for (; var3 < var1; var3++) {
         oh_4 var5 = new oh_4();
         if (var2) {
            if (var3 == 0) {
               this.Q = var5;
            }

            this.s.add(var5);
         }
      }

      this.S = new WB(this);
      this.S.start();
      if (com.ky_4.F() != null) {
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
   void M() {
      boolean var10000 = Q();
      int var2 = 0;
      int var3 = 0;
      boolean var1 = var10000;
      Iterator var5 = this.s.iterator();
      if (var1) {
         com.ky_4.K(new String[1]);
         oh_4 var4 = (oh_4)var5.next();
         var2 += var4.K;
         var3 += var4.u;
      }

      while (true) {
         while (var5.hasNext()) {
            oh_4 var6 = (oh_4)var5.next();
            var2 += var6.K;
            var3 += var6.u;
         }

         this.f = (int)((float)var3 / (float)this.s.size());
         this.F = (int)((float)var2) / this.s.size();
         this.s.remove(0);
         oh_4 var7 = new oh_4();
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
      if (!O()) {
         i(true);
      }
   }
}





