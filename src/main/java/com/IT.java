package com;

public class IT implements e3_2 {
   private int L;

   public IT(int var1) {
      this.L = var1;
   }

   @Override
   public float H(float var1) {
      switch (this.L) {
         case -4:
            return var1 * var1;
         case -3:
            return (float)Math.atan((double)var1);
         case -2:
            return (float)Math.acos((double)var1);
         case -1:
            return (float)Math.asin((double)var1);
         case 0:
         default:
            return var1;
         case 1:
            return (float)Math.sin((double)var1);
         case 2:
            return (float)Math.cos((double)var1);
         case 3:
            return (float)Math.tan((double)var1);
         case 4:
            return (float)Math.sqrt((double)var1);
      }
   }
}





