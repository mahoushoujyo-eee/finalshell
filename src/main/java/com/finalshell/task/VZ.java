package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import java.lang.reflect.InvocationTargetException;

public class VZ implements Runnable {
   public final String Q;
   public final boolean H;
   public final boolean n;
   public final FileBrowserAddressBar u;

   public VZ(FileBrowserAddressBar var1, String var2, boolean var3, boolean var4) {
      this.u = var1;
      this.Q = var2;
      this.H = var3;
      this.n = var4;
   }

   @Override
   public void run() {
      Object var1 = 362622006565678895L;
      Ref.g(362622006565678895L, var1);
      Object var3 = 224814590812340268L;
      Object[] var10003 = Registry.packArgs(
         Ref.g(224814590812340268L, var3),
         Registry.lookupField(383034791155443148L).getBoolean(this),
         Registry.lookupField(155686081050602246L).getBoolean(this)
      );
      long var6 = 326794563214348939L;
      Object[] var5 = var10003;
      Ref.h(326794563214348939L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Object var7 = 362622006565678895L;
      Ref.g(362622006565678895L, var7);
      Object var9 = 224814590812340268L;
      Object[] var10006 = Registry.packArgs(Ref.g(224814590812340268L, var9), true);
      long var12 = 203282927631494339L;
      Object[] var11 = var10006;
      Ref.h(203282927631494339L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }
}





