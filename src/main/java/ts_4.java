class ts_4 implements Runnable {
   final cm_4 V;
   private final o9_2 b;
   private final a6 I;
   private final a6 Z;

   ts_4(cm_4 var1, o9_2 var2, a6 var3, a6 var4) {
      this.V = var1;
      this.b = var2;
      this.I = var3;
      this.Z = var4;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void run() {
      com.ky_4[] var10000 = a6.P();
      b2_2 var2 = null;
      com.ky_4[] var1 = var10000;
      int var3 = 0;

      while (true) {
         label30: {
            if (var3 < 3) {
               var2 = this.b.e(this.I.m, this.I.a, this.V.S, this.V.Y, 1);
               if (var2.g == 0.0F || var1 == null) {
                  break label30;
               }
            }

            do {
               if (var1 != null) {
                  if (var2 != null) {
                     this.V.f.l(this.Z.m, this.I.m, var2);
                     this.Z.g(this.I.m, var2);
                  }

                  return;
               }
            } while (var2.g != 0.0F && var1 != null);
         }

         var3++;
      }
   }
}





