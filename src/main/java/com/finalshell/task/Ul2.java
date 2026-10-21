package com.finalshell.task;

import com.finalshell.core.RemoteProcessManager;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Ul2 implements Runnable {
   public final RemoteProcessManager e;

   public Ul2(RemoteProcessManager var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      try {
         Object var2 = 393801433552238231L;
         Ref.g(393801433552238231L, var2);
         Object[] var10002 = Registry.emptyArgs();
         long var5 = 292384188416717446L;
         Object[] var4 = var10002;
         Ref.h(292384188416717446L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10003 = Registry.packArgs(new D1(this));
         long var7 = 434592463220957006L;
         Object[] var6 = var10003;
         Ref.h(434592463220957006L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10004 = Registry.packArgs(new ZQ(this));
         long var9 = 434592463220957006L;
         Object[] var8 = var10004;
         Ref.h(434592463220957006L, var8, var9);

         try {
            ;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }
      } catch (Exception var13) {
      }
   }
}





