package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.U;
import com.finalshell.ui.panel.NetworkMonitorPanel;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Xt2 implements Runnable {
   public final U C;

   public Xt2(U var1) {
      this.C = var1;
   }

   @Override
   public void run() {
      Object var1 = 179781909861381783L;
      Ref.g(179781909861381783L, var1);
      NetworkMonitorPanel var10002 = new NetworkMonitorPanel();
      long var4 = 498692346592337143L;
      NetworkMonitorPanel var3 = var10002;
      Ref.s(498692346592337143L, var3, var4);
      Object var5 = 179781909861381783L;
      Ref.g(179781909861381783L, var5);
      Object var7 = 498692346592337143L;
      ((NetworkMonitorPanel)Ref.g(498692346592337143L, var7)).setOpaque(false);
      Object var9 = 179781909861381783L;
      Ref.g(179781909861381783L, var9);
      Object var11 = 179781909861381783L;
      Ref.g(179781909861381783L, var11);
      Object var13 = 498692346592337143L;
      Object var10008 = Ref.g(498692346592337143L, var13);
      long var16 = 187791590270141607L;
      Object var15 = var10008;
      Ref.s(187791590270141607L, var15, var16);
      Object var17 = 179781909861381783L;
      Ref.g(179781909861381783L, var17);
      Object var19 = 467883177032167383L;
      JSplitPane var10010 = (JSplitPane)Ref.g(467883177032167383L, var19);
      Object var21 = 179781909861381783L;
      Object var10012 = Ref.g(179781909861381783L, var21);
      Object var23 = 187791590270141607L;
      var10012.setLeftComponent((JPanel)Ref.g(187791590270141607L, var23));
      Object var25 = 179781909861381783L;
      Ref.g(179781909861381783L, var25);
      Object[] var10014 = Registry.emptyArgs();
      long var28 = 526151509200330945L;
      Object[] var27 = var10014;
      Ref.h(526151509200330945L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      Object var29 = 179781909861381783L;
      Registry.lookupField(329679096789927195L).setBoolean(Ref.g(179781909861381783L, var29), true);
   }
}





