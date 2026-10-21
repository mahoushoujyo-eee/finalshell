package com.finalshell.task;

import com.finalshell.crypto.User;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.LogPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Cg4 implements Runnable {
   public final LogPanel b;

   public Cg4(LogPanel var1) {
      this.b = var1;
   }

   @Override
   public void run() {
      int var1 = User.w();
      Object var3 = 462021172812617353L;
      LogPanel var10001 = (LogPanel)Ref.g(462021172812617353L, var3);
      if (var1 != 0) {
         if (!((Boolean)Ref.g(376642468236131701L, var10001)).booleanValue()) {
            return;
         }

         Object var5 = 462021172812617353L;
         LogPanel var10002 = (LogPanel)Ref.g(462021172812617353L, var5);
      }

      Object var7 = 291624504329155555L;
      JScrollBar var2 = ((JScrollPane)Ref.g(291624504329155555L, var7)).getVerticalScrollBar();
      var2.setValue(var2.getMaximum());
   }
}





