package com;

import java.util.ArrayList;
import java.util.List;

class NF implements Np_2 {
   final um_2 C;

   NF(um_2 var1) {
      this.C = var1;
   }

   @Override
   public void S(List var1) {
      synchronized (this.C.c.f) {
         this.C.c.i.put(this.C.o.H(), var1);
         this.C.c.g(var1);
      }

      List var7 = this.C.c.Y(this.C.o, var1);
      synchronized (this.C.c.f) {
         this.C.c.g.put(this.C.o.H(), true);
      }

      com.FN.p(new com.BZ(this, var7));
   }

   @Override
   public void l(Throwable var1) {
      synchronized (this.C.c.f) {
         this.C.c.i.put(this.C.o.H(), new ArrayList(0));
         this.C.c.g.put(this.C.o.H(), true);
      }

      com.FN.p(new com.BT(this, var1));
   }
}





