package com.finalshell.core;

import com.finalshell.task.BT_2;
import com.finalshell.task.BZ;
import java.util.ArrayList;
import java.util.List;

public class NF implements Np2 {
   public final com.finalshell.task.Um2 C;

   public NF(com.finalshell.task.Um2 var1) {
      this.C = var1;
   }

   @Override
   public void S(List var1) {
      synchronized (this.C.c.f) {
         this.C.c.i.put(this.C.o.H(), var1);
         this.C.c.g(var1);
      }

      List var7 = this.C.c.Y$List(this.C.o, var1);
      synchronized (this.C.c.f) {
         this.C.c.g.put(this.C.o.H(), true);
      }

      FN.p(new BZ(this, var7));
   }

   @Override
   public void l(Throwable var1) {
      synchronized (this.C.c.f) {
         this.C.c.i.put(this.C.o.H(), new ArrayList(0));
         this.C.c.g.put(this.C.o.H(), true);
      }

      FN.p(new BT_2(this, var1));
   }
}





