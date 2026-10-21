package com.finalshell.task;

import com.finalshell.reflect.Ref;
import javax.swing.JScrollPane;

public class Xf2 implements Runnable {
   final com.finalshell.ui.listener.FC W;

   Xf2(com.finalshell.ui.listener.FC var1) {
      this.W = var1;
   }

   @Override
   public void run() {
      Object var1 = 594813385295844719L;
      Ref.g(594813385295844719L, var1);
      Object var3 = 286366224900961634L;
      Ref.g(286366224900961634L, var3);
      Object var5 = 380806102838069194L;
      ((JScrollPane)Ref.g(380806102838069194L, var5)).getVerticalScrollBar().setValue(0);
   }
}





