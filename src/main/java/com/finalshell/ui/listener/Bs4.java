package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ImportExportPanel;
import com.finalshell.ui.panel.Tv2;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class Bs4 implements MouseListener {
   public final JButton Q;
   public final Tv2 g;

   public Bs4(Tv2 var1, JButton var2) {
      this.g = var1;
      this.Q = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object var5 = 314275367622392601L;
      Ref.g(314275367622392601L, var5);
      Object var7 = 336078366828898497L;
      ((ImportExportPanel)Ref.g(336078366828898497L, var7)).stopEditing();
      Object var9 = 513372155625613746L;
      JButton var10003 = (JButton)Ref.g(513372155625613746L, var9);
      var1.getPoint();
      Object var11 = 314275367622392601L;
      Object var10006 = Ref.g(314275367622392601L, var11);
      Object var13 = 336078366828898497L;
      Point var2 = SwingUtilities.convertPoint(this, (Point)var10006, (ImportExportPanel)Ref.g(336078366828898497L, var13));
      Object var15 = 314275367622392601L;
      Ref.g(314275367622392601L, var15);
      long var18 = 219376416234545265L;
      Object var17 = null;
      Ref.s(219376416234545265L, var17, var18);
      Object var19 = 314275367622392601L;
      Ref.g(314275367622392601L, var19);
      Object var21 = 336078366828898497L;
      Ref.g(336078366828898497L, var21);
      Object var10010 = Registry.packArgs(var2);
      long var24 = 379754982100791858L;
      Object var23 = var10010;
      var10010 = Ref.h(379754982100791858L, var23, var24);

      try {
         var39 = (Integer)var10010;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      int var3 = var39;
      Object var25 = 314275367622392601L;
      Ref.g(314275367622392601L, var25);
      Object var27 = 336078366828898497L;
      Ref.g(336078366828898497L, var27);
      DefaultMutableTreeNode var10013 = (DefaultMutableTreeNode)(Registry.packArgs(var3));
      long var30 = 313360281912871059L;
      Object var29 = var10013;
      var10013 = Ref.h(313360281912871059L, var29, var30);

      try {
         var10013 = (DefaultMutableTreeNode)var10013;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      DefaultMutableTreeNode var4 = var10013;
      Object var31 = 314275367622392601L;
      Ref.g(314275367622392601L, var31);
      Object[] var10015 = Registry.packArgs(var4);
      long var34 = 135515410391156914L;
      Object[] var33 = var10015;
      Ref.h(135515410391156914L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
   private static Object var39;
}





