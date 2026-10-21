package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Connection4;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Fk4 implements KeyListener {
   public final Connection4 G;
   public static long a;

   public Fk4(Connection4 var1) {
      this.G = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int[] var2 = Connection4.I();
      Fk4 var10000 = var1.getKeyCode();
      if (var2 != null) {
         if (var10000 != (int)a) {
            return;
         }

         var10000 = this;
         Object var9 = 173244602779313450L;
         ((Connection4)Ref.g(173244602779313450L, var9)).getMinSelectionRow();
      }

      Fk4 var3 = var10000;
      Object var11 = 173244602779313450L;
      Ref.g(173244602779313450L, var11);
      DefaultMutableTreeNode var10002 = (DefaultMutableTreeNode)(Registry.packArgs((int)var3));
      long var14 = 290714206414786866L;
      Object[] var13 = var10002;
      var10002 = Ref.h(290714206414786866L, var13, var14);

      try {
         var10002 = (DefaultMutableTreeNode)var10002;
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }

      DefaultMutableTreeNode var4 = var10002;
      Tf4 var5 = (Tf4)var4.getUserObject();
      boolean var6 = false;
      Object var15 = 173244602779313450L;
      Ref.g(173244602779313450L, var15);
      Object var17 = 230619793659643674L;
      TreePath var7 = ((Connection4)Ref.g(230619793659643674L, var17)).getPathForRow((int)var3);
      Object var19 = 173244602779313450L;
      Ref.g(173244602779313450L, var19);
      Object var21 = 428509894309855334L;
      HashSet var10006 = (HashSet)Ref.g(428509894309855334L, var21);
      String var10008 = (String)(Registry.emptyArgs());
      long var24 = 498856411508641826L;
      Object[] var23 = var10008;
      var10008 = Ref.h(498856411508641826L, var23, var24);

      try {
         var10008 = (String)var10008;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      var5.add(var10008);
      DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var4.getParent();
      Object var25 = 173244602779313450L;
      Ref.g(173244602779313450L, var25);
      Object[] var10009 = Registry.packArgs(var8, var5, var7, null, true, false);
      long var28 = 523405946948830526L;
      Object[] var27 = var10009;
      Ref.h(523405946948830526L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var45) {
         throw var45.getTargetException();
      }

      Object var29 = 173244602779313450L;
      Ref.g(173244602779313450L, var29);
      Object var31 = 490343386624486773L;
      HashSet var10011 = (HashSet)Ref.g(490343386624486773L, var31);
      Connection4 var10013 = Registry.emptyArgs();
      long var34 = 498856411508641826L;
      Object[] var33 = var10013;
      var10013 = Ref.h(498856411508641826L, var33, var34);

      try {
         var10013 = (String)var10013;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      label74: {
         Fk4 var10012 = var5.contains(var10013);
         if (var2 != null) {
            if (var10012 == null) {
               return;
            }

            var10012 = this;
            Object var35 = 173244602779313450L;
            var10013 = (Connection4)Ref.g(173244602779313450L, var35);
            if (var2 == null) {
               break label74;
            }

            Object[] var10014 = Registry.packArgs(var4);
            long var38 = 201726770406369370L;
            Object[] var37 = var10014;
            var10014 = Ref.h(201726770406369370L, var37, var38);

            try {
            } catch (InvocationTargetException var43) {
               throw var43.getTargetException();
            }
         }

         if (var10012 == null) {
            Object var39 = 173244602779313450L;
            ((Connection4)Ref.g(173244602779313450L, var39)).collapsePath(new TreePath(var4.getPath()));
            if (var2 != null) {
               return;
            }
         }

         Object var41 = 173244602779313450L;
         var10013 = (Connection4)Ref.g(173244602779313450L, var41);
      }

      var10013.expandPath(new TreePath(var4.getPath()));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7404190692422060865L;
      long var10002 = 7091899772039203659L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





