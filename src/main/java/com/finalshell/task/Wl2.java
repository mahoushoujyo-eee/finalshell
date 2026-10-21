package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.AW;
import com.finalshell.ui.dialog.DU;
import java.lang.reflect.InvocationTargetException;

public class Wl2 implements Runnable {
   public final YT3_2 n;

   public Wl2(YT3_2 var1) {
      this.n = var1;
   }

   @Override
   public void run() {
      Object var1 = 214018044769332063L;
      Ref.g(214018044769332063L, var1);
      DU var10002 = new DU(null);
      long var4 = 179331486645727952L;
      DU var3 = var10002;
      Ref.s(179331486645727952L, var3, var4);
      Object var5 = 214018044769332063L;
      Ref.g(214018044769332063L, var5);
      Object var7 = 214018044769332063L;
      Object var10007 = Ref.g(214018044769332063L, var7);
      Object var9 = 179331486645727952L;
var10007 = new DU((DU)Ref.g(179331486645727952L, var9));
      long var12 = 274180952810189743L;
      Ref.s(274180952810189743L, this, var12);
      Object var13 = 214018044769332063L;
      Ref.g(214018044769332063L, var13);
      Object var15 = 179331486645727952L;
      Ref.g(179331486645727952L, var15);
      Object var17 = 214018044769332063L;
      Ref.g(214018044769332063L, var17);
      Object var19 = 274180952810189743L;
      Object[] var10011 = Registry.packArgs(Ref.g(274180952810189743L, var19));
      long var22 = 170030301797488080L;
      Object[] var21 = var10011;
      Ref.h(170030301797488080L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }
   }
}





