package com.finalshell.ui.listener;

import com.finalshell.core.Vn2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;

public class Db2 implements MouseMotionListener {
   public final Vn2 i;

   public Db2(Vn2 var1) {
      this.i = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Object var2 = 365227874678742036L;
      Ref.g(365227874678742036L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 168252186092657055L;
      Object[] var4 = var10002;
      Ref.h(168252186092657055L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
   }
}





