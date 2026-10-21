package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionEditorPanel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

public class MB implements ItemListener {
   public final ConnectionEditorPanel h;

   public MB(ConnectionEditorPanel var1) {
      this.h = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      if (var1.getStateChange() == 1) {
         Object var2 = 131512827751140192L;
         Ref.g(131512827751140192L, var2);
         Object[] var10002 = Registry.emptyArgs();
         long var5 = 533982889688130251L;
         Object[] var4 = var10002;
         Ref.h(533982889688130251L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }
   }
}





