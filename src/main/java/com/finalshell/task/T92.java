package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.TextEditorFrame;
import java.lang.reflect.InvocationTargetException;

public class T92 implements Runnable {
   final OT u;

   T92(OT var1) {
      this.u = var1;
   }

   @Override
   public void run() {
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      TextEditorFrame var10002 = (TextEditorFrame)(Registry.emptyArgs());
      long var5 = 176098798606098947L;
      Object[] var4 = var10002;
      var10002 = Ref.h(176098798606098947L, var4, var5);

      try {
         var10002 = (TextEditorFrame)var10002;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      TextEditorFrame var1 = var10002;
      var1.setVisible(true);
      Object var6 = 566236282398450369L;
      Ref.g(566236282398450369L, var6);
      Object var8 = 406580448552580548L;
      Ref.g(406580448552580548L, var8);
      Object[] var10006 = Registry.emptyArgs();
      long var11 = 191716730601734423L;
      Object[] var10 = var10006;
      var10006 = Registry.packArgs(Ref.h(191716730601734423L, var10, var11));
      long var13 = 553387157770947632L;
      Object[] var12 = var10006;
      Ref.h(553387157770947632L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }
}





