package com.finalshell.task;

import com.finalshell.reflect.Ref;
import java.awt.Point;
import javax.swing.JScrollPane;

public class Lo2 implements Runnable {
   final DY3 j;

   Lo2(DY3 var1) {
      this.j = var1;
   }

   @Override
   public void run() {
      Object var1 = 473269505583066322L;
      Ref.g(473269505583066322L, var1);
      Object var3 = 380012307976567663L;
      ((JScrollPane)Ref.g(380012307976567663L, var3)).getViewport().setViewPosition(new Point(0, 0));
   }
}





