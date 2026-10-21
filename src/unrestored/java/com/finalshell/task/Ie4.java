package com.finalshell.task;

import com.finalshell.core.C_C;
import com.finalshell.core.GR;
import com.finalshell.core.NE3;
import com.finalshell.core.W62;
import com.finalshell.core.WV_2;
import com.finalshell.ui.frame.XD3;
import com.finalshell.ui.panel.QX;
import com.finalshell.ui.panel.SZ;
import java.io.IOException;

public class Ie4 implements Runnable {
   public final com.finalshell.core.P2 I;
   public final com.finalshell.core.X2 j;
   public final com.finalshell.ui.panel.Oj2 r;
   public final XD3 P;

   public Ie4(XD3 var1, com.finalshell.core.P2 var2, com.finalshell.core.X2 var3, com.finalshell.ui.panel.Oj2 var4) {
      this.P = var1;
      this.I = var2;
      this.j = var3;
      this.r = var4;
   }

   @Override
   public void run() {
      try {
         String var1 = com.finalshell.core.Cz2.W(this.I.w(this.j));
         QX var2 = new QX();
         C_C var3 = new C_C(var1);
         var3.setEditable(false);
         var2.add(new SZ(var3, false));
         var2.c(this.r, true, true);
         W62.v(var3, GR.lD, new WV_2(this, var2));
      } catch (IOException var4) {
         NE3.g(this, var4);
      }
   }
}





