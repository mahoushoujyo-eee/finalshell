package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.BU;
import java.lang.reflect.InvocationTargetException;

public class Ki2 implements Runnable {
   final BU t;

   Ki2(BU var1) {
      this.t = var1;
   }

   @Override
   public void run() {
      Object var1 = 597797036197355507L;
      Ref.g(597797036197355507L, var1);
      Object var3 = 267379412116570843L;
      Ref.g(267379412116570843L, var3);
      Object var5 = 476201740043670453L;
      Ref.g(476201740043670453L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 346382751221538814L;
      Object[] var7 = var10004;
      Ref.h(346382751221538814L, var7, var8);
      Object var9 = 597797036197355507L;
      Ref.g(597797036197355507L, var9);
      Object var11 = 588985816751341623L;
      Object[] var10007 = Registry.packArgs(Ref.g(588985816751341623L, var11));
      long var14 = 277808345207982888L;
      Object[] var13 = var10007;
      Ref.h(277808345207982888L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }
   }
}





