package com;

class cc_4 extends com.c4_2 {
   final com.kC_3 G;
   final com.ko_4 z;

   cc_4(com.ko_4 var1, boolean var2, com.kC_3 var3) {
      super(var2);
      this.z = var1;
      this.G = var3;
   }

   @Override
   public void f(boolean var1) {
      int[] var10000 = com.k3_2.L();
      com.ko_4 var3 = this.z;
      com.ko_4.R(var3, var1);
      int[] var2 = var10000;
      if (var2 != null) {
         label17: {
            if (!var1) {
               var4 = this.z;
               if (var2 == null) {
                  break label17;
               }

               if (com.ko_4.Q(this.z)) {
                  com.ko_4.r(this.z, false);
                  this.z.V.v().y(var3, null);
                  var3.revalidate();
               }
            }

            var4 = this.z;
         }

         var4.repaint();
      }
   }
}





