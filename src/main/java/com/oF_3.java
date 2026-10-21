package com;

class oF_3 implements Runnable {
   final String[] V;

   oF_3(String[] var1) {
      this.V = var1;
   }

   @Override
   public void run() {
      xc_4 var2;
      label19: {
         label18: {
            int[] var10000 = com.kD_3.u();
            com.a9.x();
            int[] var1 = var10000;
            String[] var3 = this.V;
            if (var1 == null) {
               if (this.V == null) {
                  break label18;
               }

               var3 = this.V;
            }

            if (var3.length > 0) {
               var2 = new xc_4(this.V[0]);
               if (var1 == null) {
                  break label19;
               }
            }
         }

         var2 = new xc_4();
      }

      var2.setVisible(true);
   }
}





