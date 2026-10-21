package org.v;

import org.I;

public abstract class fr_2 implements _u_2 {
   public static final fr_2 X = new R_(I.z);
   private final I y;
   private static com.ky_4[] c;

   protected fr_2(I var1) {
      this.y = var1;
   }

   @Override
   public I Q() {
      return this.y;
   }

   @Override
   public void M(String var1) throws org.b_2 {
      throw new org.b_2(var1, this.y);
   }

   static {
      com.ky_4[] var10000 = new com.ky_4[4];
      v(var10000);
   }

   public static void v(com.ky_4[] var0) {
      c = var0;
   }

   public static com.ky_4[] M() {
      return c;
   }
}





