package com.finalshell.task;

import com.finalshell.core.Yl4;
import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Registry;

public class Be2 implements Runnable {
   final ConnectHost u;

   Be2(ConnectHost var1) {
      this.u = var1;
   }

   @Override
   public void run() {
      this.u.r(new Yl4(this.u, Registry.lookupField(292074870577220689L).getInt(null)));
   }
}





