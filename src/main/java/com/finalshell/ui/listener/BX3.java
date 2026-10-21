package com.finalshell.ui.listener;

import com.finalshell.core.NH;
import com.finalshell.core.YE;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.TunnelList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class BX3 implements ActionListener {
   public final TunnelList v;

   public BX3(TunnelList var1) {
      this.v = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var4 = 510728451723433244L;
      Ref.g(510728451723433244L, var4);
      Object var6 = 548989663897657123L;
      int var2 = ((NH)Ref.g(548989663897657123L, var6)).getSelectedRow();
      if (var2 > -1) {
         Object var8 = 510728451723433244L;
         Ref.g(510728451723433244L, var8);
         Object var10 = 384272417246389638L;
         Ref.g(384272417246389638L, var10);
         YE var10005 = (YE)(Registry.packArgs(var2));
         long var13 = 619629146278140254L;
         Object[] var12 = var10005;
         var10005 = Ref.h(619629146278140254L, var12, var13);

         try {
            var10005 = (YE)var10005;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }

         YE var3 = var10005;
         Object var14 = 510728451723433244L;
         Ref.g(510728451723433244L, var14);
         Object[] var10007 = Registry.packArgs(var3);
         long var17 = 359557313276269404L;
         Object[] var16 = var10007;
         Ref.h(359557313276269404L, var16, var17);

         try {
            ;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }
      }
   }
}





