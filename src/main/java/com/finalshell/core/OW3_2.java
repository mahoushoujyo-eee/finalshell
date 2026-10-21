package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.ArrayList;
import java.util.List;

public class OW3_2 {
   public List u;

   public OW3_2() {
   super();
      int var10000 = WV.G();
      int var1 = var10000;
      this.u = new ArrayList();
      if (Ky4.F$arrString() != null) {
         WV.I(++var1);
      }
   }

   public List y() {
      return this.u;
   }

   public void g(Kq4 var1) {
      this.u.add(var1);
   }
}





