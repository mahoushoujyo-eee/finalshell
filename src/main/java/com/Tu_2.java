package com;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.KeyStroke;

class Tu_2 implements KeyListener {
   final _y_2 V;
   final com.Bq_2 M;

   Tu_2(com.Bq_2 var1, _y_2 var2) {
      this.M = var1;
      this.V = var2;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int var10000 = _y_2.M();
      Object[] var10001 = com.c.a(KeyStroke.getKeyStrokeForEvent(var1));
      Method var10 = com.c.d(219793214144533914L);
      Object[] var16 = var10001;
      Object var14 = null;

      try {
         var10001 = (zG)var10.invoke(var14, var16);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      zG var3 = var10001;
      int var2 = var10000;
      zG var7 = var3;
      if (var2 != 0) {
         if (var3 == null) {
            return;
         }

         var7 = var3;
      }

      var10001 = com.c.f();
      Method var17 = com.c.d(468069908955066583L);
      var14 = var10001;
      zG var13 = var7;
      Method var8 = var17;

      try {
         var10000 = (Integer)var8.invoke(var13, (Object[])var14);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      int var4 = var10000;
      if (var4 == com.c.c(460316126853161418L).getInt(null)) {
         this.V.s();
      }
   }
}





