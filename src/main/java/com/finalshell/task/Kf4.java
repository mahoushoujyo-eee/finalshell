package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Kf4 implements Runnable {
   public final int a;
   public final AM w;

   public Kf4(AM var1, int var2) {
      this.w = var1;
      this.a = var2;
   }

   @Override
   public void run() {
      label40: {
         String[] var1 = AM.s$arrString();
         int var10000 = Registry.lookupField(295015697832332578L).getInt(this);
         if (var1 == null) {
            if (var10000 <= 0) {
               return;
            }

            if (var1 != null) {
               break label40;
            }

            Registry.lookupField(295015697832332578L).getInt(this);
         }

         Object var2 = 318753840802082969L;
         Ref.g(318753840802082969L, var2);
         Object var4 = 142536030060271800L;
         Object var10003 = Ref.g(142536030060271800L, var4);
         ArrayList var10004 = (ArrayList)(Registry.emptyArgs());
         long var7 = 230171768324088030L;
         Object[] var6 = var10004;
         var10004 = Ref.h(230171768324088030L, var6, var7);

         try {
            var10004 = (ArrayList)var10004;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }

         if (var10003 != var10004.size() - 1) {
            return;
         }
      }

      Object var8 = 318753840802082969L;
      Ref.g(318753840802082969L, var8);
      Object var10 = 142536030060271800L;
      Ref.g(142536030060271800L, var10);
      Object[] var10006 = Registry.packArgs(Registry.lookupField(295015697832332578L).getInt(this) - 1);
      long var13 = 451518351793196330L;
      Object[] var12 = var10006;
      Ref.h(451518351793196330L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }
}





