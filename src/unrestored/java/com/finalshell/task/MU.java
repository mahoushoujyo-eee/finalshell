package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.EnableBackgroundImage;

public class MU implements Runnable {
   public final EnableBackgroundImage y;

   public MU(EnableBackgroundImage var1) {
      this.y = var1;
   }

   @Override
   public void run() {
      Object var1 = 141916790889280621L;
      ((EnableBackgroundImage)Ref.g(141916790889280621L, var1)).doLayout();
      Object var3 = 141916790889280621L;
      ((EnableBackgroundImage)Ref.g(141916790889280621L, var3)).validate();
   }
}





