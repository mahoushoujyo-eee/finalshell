package com.finalshell.task;

import com.finalshell.core.XB_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ga2 implements Runnable {
   public final XB_2 K;

   public Ga2(XB_2 var1) {
      this.K = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Object var2 = 531809486992927708L;
            Ref.g(531809486992927708L, var2);
            Object var4 = 451006777344254157L;
            Socket var1 = ((ServerSocket)Ref.g(451006777344254157L, var4)).accept();
            Registry.lookupField(388376917454860932L).get(null);
            Object[] var10003 = Registry.packArgs(new LJ3(this, var1));
            long var7 = 434592463220957006L;
            Object[] var6 = var10003;
            Ref.h(434592463220957006L, var6, var7);

            try {
               ;
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }
         } catch (IOException var9) {
            var9.printStackTrace();
         }
      }
   }
}





