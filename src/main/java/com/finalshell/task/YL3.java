package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class YL3 implements Runnable {
   final YT3_2 l;

   YL3(YT3_2 var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      Registry.packArgs(0);
      long var1 = 456004516276525137L;
      Ref.h2(456004516276525137L, var1);
   }
}





