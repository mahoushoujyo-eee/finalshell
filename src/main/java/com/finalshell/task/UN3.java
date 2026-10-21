package com.finalshell.task;

import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import java.lang.reflect.InvocationTargetException;

public class UN3 implements Runnable {
   public final ConnectHost k;
   public final FileBrowserAddressBar n;

   public UN3(FileBrowserAddressBar var1, ConnectHost var2) {
      this.n = var1;
      this.k = var2;
   }

   @Override
   public void run() {
      try {
         Object var2 = 308169149668482324L;
         Ref.g(308169149668482324L, var2);
         Object var4 = 155399014126418660L;
         Registry.packArgs(this, Ref.g(155399014126418660L, var4));
         long var6 = 393095262109418205L;
         Ref.h2(393095262109418205L, var6);

         try {
            ;
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }
}





