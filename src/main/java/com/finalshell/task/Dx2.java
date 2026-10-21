package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Ox4;

public class Dx2 implements Runnable {
   final YT3_2 l;

   Dx2(YT3_2 var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      Registry.lookupField(339870049399706971L).set(null, new Ox4(null));
   }
}





