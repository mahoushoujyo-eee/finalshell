package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;

public class Vl2 implements MouseMotionListener {
   public final com.finalshell.ui.panel.OG3 Q;

   public Vl2(com.finalshell.ui.panel.OG3 var1) {
      this.Q = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Object var2 = 551714858448237927L;
      Ref.g(551714858448237927L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 494456998971578926L;
      Object[] var4 = var10002;
      Ref.h(494456998971578926L, var4, var5);

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





