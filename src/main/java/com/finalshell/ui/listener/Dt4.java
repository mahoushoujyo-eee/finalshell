package com.finalshell.ui.listener;

import com.finalshell.core.Lv4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.panel.AA;
import com.finalshell.ui.panel.ConnectionContextMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

public class Dt4 implements ActionListener {
   public final ConnectionContextMenu U;

   public Dt4(ConnectionContextMenu var1) {
      this.U = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      AA.z();
      Registry.emptyArgs();
      long var8 = 270389152141252877L;
      Ref.h2(270389152141252877L, var8);
      Object[] var10003 = Registry.emptyArgs();
      long var11 = 634817973682994708L;
      Object[] var10 = var10003;
      Ref.h(634817973682994708L, var10, var11);
      Object[] var10004 = Registry.emptyArgs();
      long var13 = 240567170779145617L;
      Object[] var12 = var10004;
      Ref.h(240567170779145617L, var12, var13);
      Object[] var10005 = Registry.emptyArgs();
      long var15 = 226341449505323490L;
      Object[] var14 = var10005;
      Ref.h(226341449505323490L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var52) {
         throw var52.getTargetException();
      }

      Object[] var10006 = Registry.emptyArgs();
      long var17 = 153346140499032202L;
      Object[] var16 = var10006;
      var10006 = Ref.h(153346140499032202L, var16, var17);
      Object[] var10007 = Registry.emptyArgs();
      long var19 = 221034384446077256L;
      Object[] var18 = var10007;
      Ref.h(221034384446077256L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      Object var2 = var10006;
      Object var20 = 161577402438259293L;
      Ref.g(161577402438259293L, var20);
      Object var22 = 131037384951395357L;
      Ref.g(131037384951395357L, var22);
      DefaultMutableTreeNode var10009 = (DefaultMutableTreeNode)(Registry.emptyArgs());
      long var25 = 148691699844242618L;
      Object var24 = var10009;
      var10009 = Ref.h(148691699844242618L, var24, var25);

      try {
         var10009 = (DefaultMutableTreeNode)var10009;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      DefaultMutableTreeNode var5 = var10009;
      var10009 = var5.getUserObject().getClass();
      if (var2 == null) {
         if (!var10009.equals(Ck4.class)) {
            return;
         }

         var10009 = (Object[])var5.getUserObject();
      }

      Ck4 var6 = (Ck4)var10009;
      Registry.emptyArgs();
      long var26 = 270389152141252877L;
      Ref.h2(270389152141252877L, var26);
      Object[] var10011 = Registry.emptyArgs();
      long var29 = 410905379772103887L;
      Object[] var28 = var10011;
      Ref.h(410905379772103887L, var28, var29);
      File var10013 = (File)(Registry.emptyArgs());
      long var31 = 272998330038223631L;
      Object var30 = var10013;
      var10013 = Ref.h(272998330038223631L, var30, var31);

      try {
         var10013 = (File)var10013;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      var10013 = Registry.packArgs(var10013.getAbsolutePath());
      long var33 = 489768706953623433L;
      Object var32 = var10013;
      var10013 = Ref.h(489768706953623433L, var32, var33);

      try {
         var10013 = (Lv4_2)var10013;
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      Lv4_2 var7 = var10013;
      Object[] var10015 = Registry.emptyArgs();
      long var35 = 380415140795833934L;
      Object[] var34 = var10015;
      Ref.h(380415140795833934L, var34, var35);
      Object[] var10017 = Registry.emptyArgs();
      long var37 = 286931176286176762L;
      Object[] var36 = var10017;
      Object[] var10016 = Registry.packArgs(var7, Ref.h(286931176286176762L, var36, var37));
      long var39 = 407547220859876749L;
      Object[] var38 = var10016;
      Ref.h(407547220859876749L, var38, var39);

      try {
         ;
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }

      Object var40 = 161577402438259293L;
      Ref.g(161577402438259293L, var40);
      Object var42 = 270550610354043937L;
      Ref.g(270550610354043937L, var42);
      Object[] var10019 = Registry.packArgs(false);
      long var45 = 634601920284847200L;
      Object[] var44 = var10019;
      Ref.h(634601920284847200L, var44, var45);

      try {
         ;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }
   }
}





