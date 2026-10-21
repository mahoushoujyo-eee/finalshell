package com.finalshell.core;

import com.finalshell.ui.model.CB3;
import java.util.List;

public class Sl2 extends ST {
   public final CB3 O;
   public final List s;
   public final com.finalshell.ui.panel.Us2 e;
   public final Zn2 W;
   public final Yz2_2 x;

   public Sl2(Yz2_2 var1, CB3 var2, List var3, com.finalshell.ui.panel.Us2 var4, Zn2 var5) {
      this.x = var1;
      this.O = var2;
      this.s = var3;
      this.e = var4;
      this.W = var5;
   }

   @Override
   public void y(CB3 var1, List var2) {
      String[] var3 = CB3.C$arrString();
      if (var3 != null) {
         if (var1 != this.O) {
            return;
         }

         this.x.b(this.s, this.O, this.e, this.W, this.O.getChildCount());
      }

      this.e.C(this);
   }

   @Override
   public void X(CB3 var1, Throwable var2) {
      if (var1 == this.O) {
         this.e.C(this);
      }
   }
}





