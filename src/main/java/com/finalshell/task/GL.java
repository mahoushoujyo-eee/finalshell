package com.finalshell.task;

import com.finalshell.core.Ty4;
import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class GL implements Runnable {
   final YT3_2 S;

   GL(YT3_2 var1) {
      this.S = var1;
   }

   @Override
   public void run() {
      Object var1 = 226726102134796735L;
      Ref.g(226726102134796735L, var1);
      Object[] var10002 = Registry.packArgs(new Ty4(Registry.lookupField(462380862468346033L).getInt(null)));
      long var4 = 473928376202613579L;
      Object[] var3 = var10002;
      Ref.h(473928376202613579L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





