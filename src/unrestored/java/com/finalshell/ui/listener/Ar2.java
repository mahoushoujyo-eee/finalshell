package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.TextEditorFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;

public class Ar2 extends WindowAdapter {
   public final TextEditorFrame M;

   public Ar2(TextEditorFrame var1) {
      this.M = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      Object var2 = 455891641469735311L;
      Ref.g(455891641469735311L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 262207364175608475L;
      Object[] var4 = var10002;
      Ref.h(262207364175608475L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





