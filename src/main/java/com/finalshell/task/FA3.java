package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.UpdateFrame;

public class FA3 implements Runnable {
   public final YT3_2 Q;

   public FA3(YT3_2 var1) {
      this.Q = var1;
   }

   @Override
   public void run() {
      Registry.lookupField(529321737223656579L).set(null, new UpdateFrame(null));
   }
}





