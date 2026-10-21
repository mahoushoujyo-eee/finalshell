package com.finalshell.task;

import com.finalshell.connection.FileTransferConnection;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Ui4 implements Runnable {
   public final FileTransferConnection q;

   public Ui4(FileTransferConnection var1) {
      this.q = var1;
   }

   @Override
   public void run() {
      Object var1 = 232941551205899993L;
      Ref.g(232941551205899993L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 221509155912118006L;
      Object[] var3 = var10002;
      Ref.h(221509155912118006L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





