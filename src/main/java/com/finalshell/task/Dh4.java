package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.U;
import com.finalshell.ui.panel.ConnectionProperty;
import java.lang.reflect.InvocationTargetException;

public class Dh4 implements Runnable {
   public final ConnectionProperty W;
   public final U c;

   public Dh4(U var1, ConnectionProperty var2) {
      this.c = var1;
      this.W = var2;
   }

   @Override
   public void run() {
      Object var1 = 208422905371258111L;
      Ref.g(208422905371258111L, var1);
      Object var3 = 477535583004817417L;
      Object[] var10003 = Registry.packArgs(Ref.g(477535583004817417L, var3));
      long var6 = 613530416605819306L;
      Object[] var5 = var10003;
      Ref.h(613530416605819306L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Object var7 = 477535583004817417L;
      ((ConnectionProperty)Ref.g(477535583004817417L, var7)).N$_y_2();
      Object var9 = 477535583004817417L;
      this.V(((ConnectionProperty)Ref.g(477535583004817417L, var9)).M$Ty_2());
      Object var11 = 477535583004817417L;
      ((ConnectionProperty)Ref.g(477535583004817417L, var11)).N$_y_2().t$CB();
      Object var13 = 477535583004817417L;
      Object[] var10008 = Registry.packArgs(((ConnectionProperty)Ref.g(477535583004817417L, var13)).M$Ty_2());
      long var16 = 623484186651590422L;
      Object[] var15 = var10008;
      Ref.h(623484186651590422L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }
   }
}





