package com;

class dO_3 extends com.dA_3 {
   final com.ks_4 F;

   dO_3(com.ks_4 var1) {
      this.F = var1;
   }

   @Override
   public void q(com.k3_2 var1) {
      this.F.H(this.F.y.indexOf(var1), true);
   }

   @Override
   public void A(com.k3_2 var1) {
      com.ks_4 var3;
      label21: {
         label20: {
            int[] var2 = com.k3_2.L();
            var3 = this.F;
            if (var2 != null) {
               if (!this.F.r) {
                  var3 = this.F;
                  if (var2 == null) {
                     break label21;
                  }

                  if (this.F.I() != 0) {
                     break label20;
                  }
               }

               var3 = this.F;
            }

            var3.H(this.F.y.indexOf(var1), false);
         }

         var3 = this.F;
      }

      var3.j = var1;
   }
}





