package com.finalshell.task;
import com.finalshell.reflect.Ref;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Ox4;

public class Dx2 implements Runnable {
   public final YT3_2 l;

   public Dx2(YT3_2 var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      Ref.setField(0L, null, new Ox4(null));
   }
}





