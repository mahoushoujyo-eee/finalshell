class FI implements Runnable {
   final cm_4 f;
   private final o9_2 j;
   private final a6 h;

   FI(cm_4 var1, o9_2 var2, a6 var3) {
      this.f = var1;
      this.j = var2;
      this.h = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void run() {
      com.ky_4[] var10000 = a6.P();
      b2_2 var2 = null;
      com.ky_4[] var1 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 >= this.f.I) {
            this.h.g = var2;
            if (var1 != null) {
               return;
            }
         } else {
            var2 = this.j.W(this.f.S, this.f.Y, 1);
         }

         while (var2.g != 0.0F && var1 != null) {
            this.h.g = var2;
            if (var1 != null) {
               return;
            }
         }

         var3++;
      }
   }
}





