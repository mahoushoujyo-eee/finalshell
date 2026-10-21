package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Kl4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Connection4;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class ZJ implements TreeSelectionListener {
   public final Kl4 H;
   public final Connection4 b;

   public ZJ(Connection4 var1, Kl4 var2) {
      this.b = var1;
      this.H = var2;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      TreePath var3;
      label76: {
         Connection4.I();
         Object var6 = 392656021909457851L;
         Registry.lookupField(415368146415028056L).setLong(Ref.g(392656021909457851L, var6), System.currentTimeMillis());
         Object var8 = 392656021909457851L;
         var3 = ((Connection4)Ref.g(392656021909457851L, var8)).getSelectionPath();
         Object var10 = 392656021909457851L;
         Ref.g(392656021909457851L, var10);
         Object var12 = 285663222664681848L;
         Object var10004 = ((com.finalshell.core.Km2)Ref.g(285663222664681848L, var12)).getCellEditor();
         if (this != null) {
            if (var10004 == null) {
               break label76;
            }

            var10004 = this;
            Object var14 = 392656021909457851L;
            Ref.g(392656021909457851L, var14);
            Object var16 = 285663222664681848L;
            ((com.finalshell.core.Km2)Ref.g(285663222664681848L, var16)).getCellEditor();
         }

         var10004.stopCellEditing();
      }

      Object var48 = var3;
      if (this != null) {
         if (var3 == null) {
            return;
         }

         var48 = var3.getLastPathComponent();
      }

      DefaultMutableTreeNode var4 = (DefaultMutableTreeNode)var48;
      var48 = var4.getUserObject().getClass();
      if (this != null) {
         if (!var48.equals(Tf4.class)) {
            return;
         }

         var48 = var4.getUserObject();
      }

      Tf4 var5 = (Tf4)var48;
      Object var18 = 392656021909457851L;
      Ref.g(392656021909457851L, var18);
      Object var20 = 285663222664681848L;
      Ref.g(285663222664681848L, var20);
      Object[] var10007 = Registry.packArgs(0);
      long var23 = 598070921885718443L;
      Object[] var22 = var10007;
      Ref.h(598070921885718443L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }

      Object var24 = 219163962651374930L;
      Ref.g(219163962651374930L, var24);
      Object[] var10009 = Registry.packArgs(var5);
      long var27 = 217942201414471271L;
      Object[] var26 = var10009;
      Ref.h(217942201414471271L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      Object var28 = 392656021909457851L;
      Connection4 var10010 = (Connection4)Ref.g(392656021909457851L, var28);
      if (this != null) {
         Object[] var10012 = Registry.emptyArgs();
         long var31 = 498856411508641826L;
         Object[] var30 = var10012;
         var10012 = Ref.h(498856411508641826L, var30, var31);
         long var33 = 343160910034620817L;
         Object var32 = var10012;
         Ref.s(343160910034620817L, var32, var33);
         Object[] var10013 = Registry.emptyArgs();
         long var35 = 490764181082108623L;
         Object[] var34 = var10013;
         var10013 = Ref.h(490764181082108623L, var34, var35);

         try {
            var52 = (Boolean)var10013;
         } catch (InvocationTargetException var45) {
            throw var45.getTargetException();
         }

         if (var52) {
            return;
         }

         Object var36 = 392656021909457851L;
         Connection4 var10014 = (Connection4)Ref.g(392656021909457851L, var36);
      }

      Object var38 = 592764144014982287L;
      Ref.g(592764144014982287L, var38);
      Object[] var53 = Registry.emptyArgs();
      long var41 = 498856411508641826L;
      Object[] var40 = var53;
      var53 = Registry.packArgs(Ref.h(498856411508641826L, var40, var41));
      long var43 = 512058916537400437L;
      Object[] var42 = var53;
      Ref.h(512058916537400437L, var42, var43);

      try {
         ;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }
   }
}





