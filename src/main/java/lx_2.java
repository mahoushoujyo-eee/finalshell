class Lx_2 implements Runnable {
   final Qt_2 e;
   private final org.icmp4j.j c;

   Lx_2(Qt_2 var1, org.icmp4j.j var2) {
      this.e = var1;
      this.c = var2;
   }

   @Override
   public void run() {
      dX_3 var3;
      label24: {
         label23: {
            String[] var1 = xQ.B();
            org.icmp4j.j var10000 = this.c;
            if (var1 != null) {
               if (this.c.r() == -1) {
                  this.c.P(true);
                  this.c.v(false);
                  B0 var2 = new B0(B0.Z);
                  var2.q(this.c);
                  var3 = fH_3.P(Qt_2.A(this.e));
                  if (var1 == null) {
                     break label24;
                  }

                  if (var3.F == null) {
                     break label23;
                  }

                  fH_3.P(Qt_2.A(this.e)).F.a(var2);
                  if (var1 != null) {
                     break label23;
                  }
               }

               var10000 = this.c;
            }

            var10000.v(true);
         }

         var3 = fH_3.P(Qt_2.A(this.e));
      }

      var3.P.T(this.c);
   }
}





