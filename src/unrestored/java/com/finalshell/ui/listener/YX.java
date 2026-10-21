package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Bq2;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;

public class YX implements MouseMotionListener {
   public final Bq2 U;

   public YX(Bq2 var1) {
      this.U = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Object var2 = 149040079554109209L;
      Ref.setLong(444246150125769098L, Ref.g(149040079554109209L, var2), System.currentTimeMillis());
      Object var4 = 149040079554109209L;
      Ref.g(149040079554109209L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 356550171956632315L;
      Object[] var6 = var10003;
      Ref.h(356550171956632315L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
   }
}





