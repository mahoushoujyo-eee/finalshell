package com.finalshell.task;

import com.finalshell.connection.PortMapping;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;

public class Wh2 implements Runnable {
   public final ServerSocket s;
   public final PortMapping t;

   public Wh2(PortMapping var1, ServerSocket var2) {
      this.t = var1;
      this.s = var2;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Object var2 = 418793406764192211L;
            Socket var1 = ((ServerSocket)Ref.g(418793406764192211L, var2)).accept();
            Registry.lookupField(388376917454860932L).get(null);
            Object[] var10002 = Registry.packArgs(new Kt4(this, var1));
            long var5 = 434592463220957006L;
            Object[] var4 = var10002;
            Ref.h(434592463220957006L, var4, var5);

            try {
               ;
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }
         } catch (IOException var7) {
            var7.printStackTrace();
            return;
         }
      }
   }
}





