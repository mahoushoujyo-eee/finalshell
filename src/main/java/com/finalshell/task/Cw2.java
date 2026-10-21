package com.finalshell.task;

import com.finalshell.core.O22;
import com.finalshell.core.Yz2_2;
import com.finalshell.core.Zn2;
import com.finalshell.ui.model.CB3;
import com.finalshell.ui.panel.Us2;
import java.util.List;

public class Cw2 implements Runnable {
   final Zn2 Z;
   final List A;
   final CB3 r;
   final int G;
   final Us2 H;
   final Yz2_2 i;

   Cw2(Yz2_2 var1, Zn2 var2, List var3, CB3 var4, int var5, Us2 var6) {
      this.i = var1;
      this.Z = var2;
      this.A = var3;
      this.r = var4;
      this.G = var5;
      this.H = var6;
   }

   @Override
   public void run() {
      this.Z.u(this.A, this.r, this.G);
      this.H.R(this.A);
      O22.P(this.H, new IF3(this));
   }
}





