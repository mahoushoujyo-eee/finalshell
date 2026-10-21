package com;

public class G7 implements e3_2 {
   private e3_2 t;
   private e3_2 q;

   public G7(e3_2 var1, e3_2 var2) {
      this.t = var1;
      this.q = var2;
   }

   @Override
   public float H(float var1) {
      return this.t.H(this.q.H(var1));
   }
}





