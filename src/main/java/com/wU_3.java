package com;

class wU_3 implements SC {
   private SC k;
   final SC v;
   final com.yj_4 c;

   wU_3(com.yj_4 var1, SC var2) {
      this.c = var1;
      this.v = var2;
      this.k = this.v;
   }

   @Override
   public float h(float var1, float var2) {
      String[] var3;
      float var4;
      label39: {
         label43: {
            label37: {
               String[] var10000 = com.W5.q();
               var4 = this.k.h(var1, var2);
               var3 = var10000;
               if (var3 != null) {
                  switch (com.yj_4.K(this.c)) {
                     case 1:
                        var4 *= NM.k(0.45F, 0.55F, var4);
                        break;
                     case 2:
                        break label37;
                     case 3:
                        break label43;
                     case 4:
                        break label39;
                     case 5:
                        return NM.w(var4, 0.75F);
                     default:
                        return var4;
                  }
               }

               if (var3 != null) {
                  return var4;
               }
            }

            float var5 = var4;
            if (var3 != null) {
               var5 = var4 < 0.5F ? 0.5F : var4;
            }

            var4 = var5;
            if (var3 != null) {
               return var4;
            }
         }

         var4 = NM.l(var4);
         if (var3 != null) {
            return var4;
         }
      }

      var4 = NM.q(var4);
      return var3 != null ? var4 : NM.w(var4, 0.75F);
   }
}





