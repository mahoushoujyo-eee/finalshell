import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class UR {
   public InetAddress s;
   public int f;
   public P z;
   public o__2 e;
   public bR_3 l;
   public br_4 J;
   long C;
   QI Y;
   int P;
   private boolean F = true;
   long w = System.currentTimeMillis();
   long k = 0L;
   static Random o = new Random();
   int v;
   private LinkedBlockingQueue q = new LinkedBlockingQueue();
   public B2 B;
   public boolean T = false;
   public boolean a = false;
   public boolean K = false;
   public boolean H = false;

   public UR(QI var1, InetAddress var2, int var3, int var4, int var5, B2 var6) throws Exception {
      String[] var10000 = QI.N();
      this.B = var6;
      this.Y = var1;
      this.s = var2;
      String[] var7 = var10000;
      this.f = var3;
      this.P = var4;
      if (var4 != 1) {
      }

      this.v = var5;

      label39: {
         try {
            this.z = new P(this);
            this.e = new o__2(this);
            this.l = new bR_3(this);
            var13 = this;
            if (var7 == null) {
               break label39;
            }

            this.J = new br_4(this);
            if (var4 == 2) {
               var1.m().i(this);
            }
         } catch (Exception var12) {
            var12.printStackTrace();
            this.F = false;
            this.Y.n.remove(var5);
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

   public DatagramPacket u(int var1) throws InterruptedException {
      return (DatagramPacket)this.q.take();
   }

   @Override
   public String toString() {
      return new String(this.s + ":" + this.f);
   }

   public boolean V() {
      return this.F;
   }

   public void Z() {
      UR var2;
      label25: {
         String[] var1 = QI.N();
         boolean var10000 = this.T;
         if (var1 != null) {
            if (this.T) {
               return;
            }

            this.T = true;
            var2 = this;
            if (var1 == null) {
               break label25;
            }

            var10000 = this.H;
         }

         if (!var10000) {
            this.z.F();
         }

         var2 = this;
      }

      var2.R(false);
   }

   public void d() {
      String[] var1 = QI.N();
      UR var10000 = this;
      if (var1 != null) {
         if (this.a) {
            return;
         }

         this.a = true;
         var10000 = this;
      }

      var10000.R(false);
   }

   public void R(boolean var1) {
      String[] var2 = QI.N();
      boolean var10000 = this.K;
      if (var2 != null) {
         if (this.K) {
            return;
         }

         var10000 = this.T;
      }

      label27: {
         label26: {
            if (var2 != null) {
               if (var10000) {
                  var3 = this;
                  if (var2 == null) {
                     break label27;
                  }

                  if (this.a) {
                     break label26;
                  }
               }

               var10000 = var1;
            }

            if (!var10000) {
               return;
            }
         }

         this.K = true;
         this.F = false;
         this.J.O();
         this.l.r();
         this.z.w();
         this.e.J();
         this.Y.X(this);
         var3 = this;
      }

      var3.B.O(this);
   }

   public void D() {
   }

   void g() {
      this.w = System.currentTimeMillis();
   }
}





