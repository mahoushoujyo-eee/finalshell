package com.finalshell.ui.listener;

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

public class Ua4 implements ActionListener {
   public final ConnectionContextMenu E;

   public Ua4(ConnectionContextMenu var1) {
      this.E = var1;
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
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
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
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      Object var2 = var10006;
      Object var20 = 248531329108093602L;
      Ref.g(248531329108093602L, var20);
      Object var22 = 131037384951395357L;
      Ref.g(131037384951395357L, var22);
      DefaultMutableTreeNode var10009 = (DefaultMutableTreeNode)(Registry.emptyArgs());
      long var25 = 148691699844242618L;
      Object var24 = var10009;
      var10009 = Ref.h(148691699844242618L, var24, var25);

      try {
         var10009 = (DefaultMutableTreeNode)var10009;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      DefaultMutableTreeNode var5 = var10009;
      var10009 = (DefaultMutableTreeNode)(var5.getUserObject().getClass());
      if (var2 == null) {
         if (!var10009.equals(Ck4.class)) {
            return;
         }

         var10009 = (DefaultMutableTreeNode)((Object[])var5.getUserObject());
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
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      var10013 = Registry.packArgs(var10013.getAbsolutePath());
      long var33 = 489768706953623433L;
      Object var32 = var10013;
      Ref.h(489768706953623433L, var32, var33);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      Object[] var10014 = Registry.emptyArgs();
      long var35 = 380415140795833934L;
      Object[] var34 = var10014;
      Registry.packArgs(Ref.h(380415140795833934L, var34, var35));
      long var36 = 396962080382410298L;
      Ref.h2(396962080382410298L, var36);

      try {
         ;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }
   }
}





