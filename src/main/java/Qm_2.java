import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class Qm_2 {
   public InetAddress c;
   public int i;
   public x1 J;
   public D8 j;
   public CU M;
   public tz_4 e;
   long n;
   lA_3 u;
   int O;
   private boolean l;
   long N;
   long g;
   static Random D = new Random();
   int W;
   private LinkedBlockingQueue f;
   public f9_2 d;
   public boolean G;
   public boolean s;
   public boolean x;
   public boolean Q;
   private static com.ky_4[] S;

   static {
      com.ky_4[] var10000 = new com.ky_4[2];
      F(var10000);
   }

   public Qm_2(lA_3 var1, InetAddress var2, int var3, int var4, int var5, f9_2 var6) throws Exception {
      com.ky_4[] var10000 = J();
      this.l = true;
      this.N = System.currentTimeMillis();
      this.g = 0L;
      this.f = new LinkedBlockingQueue();
      this.G = false;
      this.s = false;
      this.x = false;
      this.Q = false;
      this.d = var6;
      this.u = var1;
      this.c = var2;
      this.i = var3;
      com.ky_4[] var7 = var10000;
      this.O = var4;
      if (var4 != 1) {
      }

      this.W = var5;

      label39: {
         try {
            this.J = new x1(this);
            this.j = new D8(this);
            this.M = new CU(this);
            var13 = this;
            if (var7 == null) {
               break label39;
            }

            this.e = new tz_4(this);
            if (var4 == 2) {
               var1.X().S(this);
            }
         } catch (Exception var12) {
            var12.printStackTrace();
            this.l = false;
            this.u.O.remove(var5);
            var12.printStackTrace();
            synchronized (this) {
               this.notifyAll();
            }

            throw var12;
         }

         var13 = this;
      }

      synchronized (var13) {
         this.notifyAll();
      }
   }

   public DatagramPacket X(int var1) throws InterruptedException {
      return (DatagramPacket)this.f.take();
   }

   @Override
   public String toString() {
      return new String(this.c + ":" + this.i);
   }

   public boolean Z() {
      return this.l;
   }

   public void l() {
      Qm_2 var2;
      label25: {
         com.ky_4[] var1 = J();
         boolean var10000 = this.G;
         if (var1 != null) {
            if (this.G) {
               return;
            }

            this.G = true;
            var2 = this;
            if (var1 == null) {
               break label25;
            }

            var10000 = this.Q;
         }

         if (!var10000) {
            this.J.l();
         }

         var2 = this;
      }

      var2.u(false);
   }

   public void N() {
      com.ky_4[] var1 = J();
      Qm_2 var10000 = this;
      if (var1 != null) {
         if (this.s) {
            return;
         }

         this.s = true;
         var10000 = this;
      }

      var10000.u(false);
   }

   public void u(boolean var1) {
      com.ky_4[] var2 = J();
      boolean var10000 = this.x;
      if (var2 != null) {
         if (this.x) {
            return;
         }

         var10000 = this.G;
      }

      label27: {
         label26: {
            if (var2 != null) {
               if (var10000) {
                  var3 = this;
                  if (var2 == null) {
                     break label27;
                  }

                  if (this.s) {
                     break label26;
                  }
               }

               var10000 = var1;
            }

            if (!var10000) {
               return;
            }
         }

         this.x = true;
         this.l = false;
         this.e.X();
         this.M.h();
         this.J.I();
         this.j.J();
         this.u.g(this);
         var3 = this;
      }

      var3.d.g(this);
   }

   public void P() {
   }

   void T() {
      this.N = System.currentTimeMillis();
   }

   public static void F(com.ky_4[] var0) {
      S = var0;
   }

   public static com.ky_4[] J() {
      return S;
   }
}





