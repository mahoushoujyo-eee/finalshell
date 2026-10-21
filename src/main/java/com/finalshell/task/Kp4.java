package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.ConfirmDeleteFolderListener;
import com.finalshell.ui.panel.Connection4;
import java.lang.reflect.InvocationTargetException;

public class Kp4 implements Runnable {
   public final ConfirmDeleteFolderListener H;

   public Kp4(ConfirmDeleteFolderListener var1) {
      this.H = var1;
   }

   @Override
   public void run() {
      Object var1 = 218112836542140074L;
      Ref.g(218112836542140074L, var1);
      Object var3 = 270662763281156011L;
      Ref.g(270662763281156011L, var3);
      Object var5 = 305402254993059552L;
      Ref.g(305402254993059552L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 346382751221538814L;
      Object[] var7 = var10004;
      Ref.h(346382751221538814L, var7, var8);
      Object var9 = 218112836542140074L;
      Ref.g(218112836542140074L, var9);
      Object var11 = 270662763281156011L;
      Ref.g(270662763281156011L, var11);
      Object var13 = 515525013030853953L;
      Ref.g(515525013030853953L, var13);
      Object var15 = 218112836542140074L;
      Ref.g(218112836542140074L, var15);
      Object var17 = 270662763281156011L;
      Object var10011 = Ref.g(270662763281156011L, var17);
      Object var19 = 305402254993059552L;
      var10011 = Registry.packArgs(var10011, ((Connection4)Ref.g(305402254993059552L, var19)).getParent(), true);
      long var22 = 244589320073274134L;
      Object[] var21 = (Object[])var10011;
      Ref.h(244589320073274134L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }
   }
}





