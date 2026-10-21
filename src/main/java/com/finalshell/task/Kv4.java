package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import java.awt.Window;
import javax.swing.JFrame;

public class Kv4 implements Runnable {
   final Window v;

   Kv4(Window var1) {
      this.v = var1;
   }

   @Override
   public void run() {
      YT3_2.c();
      Object var3 = 309631282188126622L;
      ((Window)Ref.g(309631282188126622L, var3)).setVisible(true);
      Object var5 = 309631282188126622L;
      Object var10002 = (Window)Ref.g(309631282188126622L, var5);
      if (this != null) {
         if (var10002 instanceof JFrame) {
            Object var7 = 309631282188126622L;
            JFrame var2 = (JFrame)Ref.g(309631282188126622L, var7);
            var2.setState(0);
         }

         var10002 = this;
         Object var9 = 309631282188126622L;
         Window var10003 = (Window)Ref.g(309631282188126622L, var9);
      }

      var10002.toFront();
   }
}





