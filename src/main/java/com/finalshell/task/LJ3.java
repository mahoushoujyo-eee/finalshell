package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;

public class LJ3 implements Runnable {
   final Socket t;
   final Ga2 I;

   LJ3(Ga2 var1, Socket var2) {
      this.I = var1;
      this.t = var2;
   }

   @Override
   public void run() {
      Object var1 = 129013387913622757L;
      Ref.g(129013387913622757L, var1);
      Object var3 = 531809486992927708L;
      Ref.g(531809486992927708L, var3);
      Object var5 = 422681488151755413L;
      Object[] var10004 = Registry.packArgs(Ref.g(422681488151755413L, var5));
      long var8 = 410208588171090910L;
      Object[] var7 = var10004;
      Ref.h(410208588171090910L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }
}





