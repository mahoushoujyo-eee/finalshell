package com.finalshell.task;

import com.finalshell.core.Zh2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.F5;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class J5 implements Runnable {
   public final String Q;
   public final F5 c;

   public J5(F5 var1, String var2) {
      this.c = var1;
      this.Q = var2;
   }

   @Override
   public void run() {
      try {
         Object var2 = 263547688617831596L;
         Registry.packArgs(InetAddress.getByName((String)Ref.g(263547688617831596L, var2)).getHostAddress());
         long var4 = 602697815696322216L;
         Object var10002 = Ref.h2(602697815696322216L, var4);

         try {
            var10002 = (Zh2_2)var10002;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         Zh2_2 var1 = (Zh2_2)var10002;
         Object var6 = 558489952055562116L;
         Ref.g(558489952055562116L, var6);
         Object var8 = 474524358810565567L;
         Ref.g(474524358810565567L, var8);
         Object[] var10005 = Registry.packArgs(var1);
         long var11 = 452301227209549294L;
         Object[] var10 = var10005;
         Ref.h(452301227209549294L, var10, var11);

         try {
            ;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }
      } catch (UnknownHostException var14) {
         var14.printStackTrace();
      }
   }
}





