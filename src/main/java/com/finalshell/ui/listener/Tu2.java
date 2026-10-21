package com.finalshell.ui.listener;

import com.finalshell.core.ZG_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Bq_2;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.KeyStroke;

public class Tu2 implements KeyListener {
   final ConnectionProperty V;
   final Bq_2 M;

   Tu2(Bq_2 var1, ConnectionProperty var2) {
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
      ConnectionProperty.M$int();
      Object[] var10001 = Registry.packArgs(KeyStroke.getKeyStrokeForEvent(var1));
      long var5 = 219793214144533914L;
      Object var10002 = Ref.h2(219793214144533914L, var5);

      try {
         var10002 = (ZG_2)var10002;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      ZG_2 var3 = (ZG_2)var10002;
      Object[] var2 = var10001;
      if (var2 == false || var3 != null) {
         var10002 = Registry.emptyArgs();
         long var8 = 468069908955066583L;
         Object[] var7 = (Object[])var10002;
         var10002 = Ref.h(468069908955066583L, var7, var8);

         try {
            var14 = (Integer)var10002;
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         int var4 = var14;
         if (var4 == Registry.lookupField(460316126853161418L).getInt(null)) {
            this.V.s$void();
         }
      }
   }
}





