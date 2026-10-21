public class K5 {
   private byte[] q;
   private byte[] K;
   private int b;
   private yu_4 J;

   public K5(byte[] var1) {
      this(var1, yu_4.BIN);
   }

   public K5(byte[] var1, yu_4 var2) {
      this.q = var1;
      this.J = var2;
      this.K = new byte[this.q.length * 2];
      this.x();
   }

   private void p(byte var1) {
      this.K[this.b] = var1;
      this.b++;
   }

   private void x() {
      String[] var10000 = Ub_2.A();
      byte var2 = 0;
      String[] var1 = var10000;

      for (byte var6 : this.q) {
         var7 = this.J.d();
         label23:
         if (var1 == null) {
            if (var7 == 0) {
               var7 = xP.W(var6, var2, false);
               if (var1 != null) {
                  break label23;
               }

               if (var7 != 0) {
                  this.p(x9.ZDLE.r());
                  var6 = xP.c(var6);
               }
            }

            this.p(var6);
            var7 = var6;
         }

         var2 = var7;
         if (var1 != null) {
            break;
         }
      }
   }

   public byte[] v() {
      return this.q;
   }

   public int e() {
      return this.b;
   }

   public byte[] n() {
      return this.K;
   }
}





