package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AA;
import com.finalshell.ui.panel.RouteTracePanel2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JMenuItem;

public class I implements Runnable {
   public final JMenuItem J;
   public final JMenuItem H;
   public final JMenuItem w;
   public final RouteTracePanel2 t;

   public I(RouteTracePanel2 var1, JMenuItem var2, JMenuItem var3, JMenuItem var4) {
      this.t = var1;
      this.J = var2;
      this.H = var3;
      this.w = var4;
   }

   @Override
   public void run() {
      Object var3 = 504202582560507006L;
      Ref.g(504202582560507006L, var3);
      Object var5 = 131037384951395357L;
      Ref.g(131037384951395357L, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var8 = 545305462032614375L;
      Object[] var7 = var10003;
      var10003 = Ref.h(545305462032614375L, var7, var8);

      try {
         var26 = (Boolean)var10003;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      boolean var2 = var26;
      Object var9 = 329455657549197975L;
      ((JMenuItem)Ref.g(329455657549197975L, var9)).setEnabled(var2);
      AA.z();
      Object var11 = 367382779939447854L;
      ((JMenuItem)Ref.g(367382779939447854L, var11)).setEnabled(var2);
      Object var13 = 255849383768534640L;
      JMenuItem var10006 = (JMenuItem)Ref.g(255849383768534640L, var13);
      Object var15 = 504202582560507006L;
      Ref.g(504202582560507006L, var15);
      Object var17 = 131037384951395357L;
      Ref.g(131037384951395357L, var17);
      Object var19 = 359637467035547923L;
      Object var10010 = Ref.g(359637467035547923L, var19);
      ArrayList var10011 = Registry.emptyArgs();
      long var22 = 442657485924266205L;
      Object[] var21 = var10011;
      var10011 = Ref.h(442657485924266205L, var21, var22);

      try {
         var10011 = (ArrayList)var10011;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      int var29 = var10011.size();
      if (this == null) {
         var29 = var29 > 0 ? 1 : 0;
      }

      var10010.setEnabled((boolean)var29);
   }
}





