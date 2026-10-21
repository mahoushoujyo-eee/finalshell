package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.U;
import com.finalshell.ui.panel.F8;
import java.lang.reflect.InvocationTargetException;

public class FS3 implements Runnable {
   final Qn2 i;

   FS3(Qn2 var1) {
      this.i = var1;
   }

   @Override
   public void run() {
      String[] var1 = F8.y();
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 306266403902896148L;
      Object[] var4 = var10002;
      Ref.h(306266403902896148L, var4, var5);
      Boolean var10003 = (Boolean)(Registry.emptyArgs());
      long var7 = 577875833820570498L;
      Object[] var6 = var10003;
      var10003 = Ref.h(577875833820570498L, var6, var7);

      try {
         var10003 = (Boolean)var10003;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      label47: {
         if (var1 == null) {
            if (var10003 == false) {
               return;
            }

            var10003 = this;
            Object var8 = 516278995074848564L;
            Ref.g(516278995074848564L, var8);
            Object var10 = 389567756310007794L;
            U var10005 = (U)Ref.g(389567756310007794L, var10);
            if (var1 != null) {
               break label47;
            }

            var10005.isVisible();
         }

         if (var10003 == false) {
            return;
         }

         Object var12 = 516278995074848564L;
         Ref.g(516278995074848564L, var12);
         Object var14 = 389567756310007794L;
         U var22 = (U)Ref.g(389567756310007794L, var14);
      }

      Object[] var10006 = Registry.emptyArgs();
      long var17 = 526151509200330945L;
      Object[] var16 = var10006;
      Ref.h(526151509200330945L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }
   }
}





