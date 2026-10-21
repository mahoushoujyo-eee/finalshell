package com.finalshell.core;

public class G7 implements E32 {
   public E32 t;
   public E32 q;

   public G7(E32 var1, E32 var2) {
      this.t = var1;
      this.q = var2;
   }

   @Override
   public float H(float var1) {
      return this.t.H(this.q.H(var1));
   }
}





