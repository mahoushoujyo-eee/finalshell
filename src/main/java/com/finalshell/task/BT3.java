package com.finalshell.task;

import com.finalshell.connection.Mapping;
import com.finalshell.core.Ty4;
import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;

public class BT3 implements Runnable {
   public final YT3_2 j;

   public BT3(YT3_2 var1) {
      this.j = var1;
   }

   @Override
   public void run() {
      Object var1 = 500337766327596840L;
      Ref.g(500337766327596840L, var1);
      Mapping var10002 = new Mapping();
      long var4 = 271302278039639994L;
      Mapping var3 = var10002;
      Ref.s(271302278039639994L, var3, var4);
      Object var5 = 500337766327596840L;
      Ref.g(500337766327596840L, var5);
      Object[] var10004 = Registry.packArgs(new Ty4(Registry.lookupField(371285800720733657L).getInt(null)));
      long var8 = 473928376202613579L;
      Object[] var7 = var10004;
      Ref.h(473928376202613579L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      Registry.lookupField(222367947831078517L).set(null, new com.finalshell.ui.dialog.C5(new JFrame()));
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10005 = Registry.packArgs(new V8(this));
      long var10 = 434592463220957006L;
      Object[] var9 = var10005;
      Ref.h(434592463220957006L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }
}





