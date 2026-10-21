package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Ff2;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.lang.reflect.InvocationTargetException;

public class Lg2_2 implements Runnable {
   public final SetBackgroundImagePanel e;

   public Lg2_2(SetBackgroundImagePanel var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      Ff2 var1 = this.e.L.o$Ff_2();
      Object[] var10001 = Registry.packArgs(false);
      long var3 = 464995000560394494L;
      Object[] var2 = var10001;
      Ref.h(464995000560394494L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw new RuntimeException(var10.getTargetException());
      }

      Object[] var10002 = Registry.emptyArgs();
      long var5 = 306221011327708335L;
      Object[] var4 = var10002;
      Ref.h(306221011327708335L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw new RuntimeException(var9.getTargetException());
      }

      Object[] var10003 = Registry.emptyArgs();
      long var7 = 612990022110170911L;
      Object[] var6 = var10003;
      Ref.h(612990022110170911L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }
   }
}





