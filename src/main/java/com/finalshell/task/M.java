package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.ConfirmDeleteFolderListener2;
import com.finalshell.ui.panel.Connection4;
import java.lang.reflect.InvocationTargetException;

public class M implements Runnable {
   public final ConfirmDeleteFolderListener2 n;

   public M(ConfirmDeleteFolderListener2 var1) {
      this.n = var1;
   }

   @Override
   public void run() {
      Object var1 = 497805502478041018L;
      Ref.g(497805502478041018L, var1);
      Object var3 = 481028078493164457L;
      Ref.g(481028078493164457L, var3);
      Object var5 = 305402254993059552L;
      Ref.g(305402254993059552L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 346382751221538814L;
      Object[] var7 = var10004;
      Ref.h(346382751221538814L, var7, var8);
      Object var9 = 497805502478041018L;
      Ref.g(497805502478041018L, var9);
      Object var11 = 481028078493164457L;
      Ref.g(481028078493164457L, var11);
      Object var13 = 515525013030853953L;
      Ref.g(515525013030853953L, var13);
      Object var15 = 497805502478041018L;
      Ref.g(497805502478041018L, var15);
      Object var17 = 481028078493164457L;
      Object var10011 = Ref.g(481028078493164457L, var17);
      Object var19 = 305402254993059552L;
      var10011 = Registry.packArgs(var10011, ((Connection4)Ref.g(305402254993059552L, var19)).getParent(), true);
      long var22 = 424588502733950890L;
      Object[] var21 = (Object[])var10011;
      Ref.h(424588502733950890L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }
   }
}





