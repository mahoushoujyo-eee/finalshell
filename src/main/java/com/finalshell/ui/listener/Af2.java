package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.AA;
import com.finalshell.ui.panel.Connection5;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Af2 implements TreeSelectionListener {
   final Connection5 x;

   Af2(Connection5 var1) {
      this.x = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      DefaultMutableTreeNode var27;
      label47: {
         AA.z();
         Object var6 = 317048384022246679L;
         Registry.lookupField(159470416555914823L).setLong(Ref.g(317048384022246679L, var6), System.currentTimeMillis());
         Object var8 = 317048384022246679L;
         TreePath var3 = ((Connection5)Ref.g(317048384022246679L, var8)).getSelectionPath();
         Object var4 = null;
         Object var10002 = var3;
         if (this == null) {
            if (var3 == null) {
               Object var10 = 317048384022246679L;
               Ref.g(317048384022246679L, var10);
               Object var12 = 213130010239103238L;
               var27 = (DefaultMutableTreeNode)Ref.g(213130010239103238L, var12);
               break label47;
            }

            var10002 = var3.getLastPathComponent();
         }

         var27 = (DefaultMutableTreeNode)var10002;
      }

      Object var30;
      label51: {
         boolean var29 = var27.getUserObject().getClass().equals(Tf4.class);
         if (this == null) {
            if (var29) {
               Tf4 var5 = (Tf4)var27.getUserObject();
               Object var14 = 317048384022246679L;
               Ref.g(317048384022246679L, var14);
               Object[] var10005 = Registry.emptyArgs();
               long var17 = 498856411508641826L;
               Object[] var16 = var10005;
               var10005 = Ref.h(498856411508641826L, var16, var17);
               long var19 = 348708854043337366L;
               Object var18 = var10005;
               Ref.s(348708854043337366L, var18, var19);
               if (this == null) {
                  return;
               }
            }

            var30 = var27.getUserObject().getClass();
            if (this != null) {
               break label51;
            }

            var29 = var30.equals(Ck4.class);
         }

         if (!var29) {
            return;
         }

         var30 = var27.getUserObject();
      }

      Ck4 var28 = (Ck4)var30;
      Object var20 = 317048384022246679L;
      Ref.g(317048384022246679L, var20);
      File var32;
      String var10007 = (String)(Registry.emptyArgs());
      long var23 = 605430732347023634L;
      Object[] var22 = var10007;
      var10007 = Ref.h(605430732347023634L, var22, var23);

      try {
         var10007 = (String)var10007;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

new Af2(var10007);
      String var33 = var32.getParent();
      long var25 = 348708854043337366L;
      String var24 = var33;
      Ref.s(348708854043337366L, var24, var25);
   }
}





