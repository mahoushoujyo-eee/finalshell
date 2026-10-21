package com.finalshell.ui.listener;

import com.finalshell.core.C_C;
import com.finalshell.core.FX3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JPopupMenu;

public class L implements ActionListener {
   public final FX3 l;
   public final String Q;
   public final JPopupMenu h;
   public final com.finalshell.ui.panel.W8 L;
   public final SelectDownloadFolderPanel n;
   public static long a;

   public L(SelectDownloadFolderPanel var1, FX3 var2, String var3, JPopupMenu var4, com.finalshell.ui.panel.W8 var5) {
      this.n = var1;
      this.l = var2;
      this.Q = var3;
      this.h = var4;
      this.L = var5;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var4 = 597882109718658433L;
      Ref.g(597882109718658433L, var4);
      Object var6 = 215009972678572825L;
      Object[] var10003 = Registry.packArgs(Ref.g(215009972678572825L, var6));
      long var9 = 452642608051992089L;
      Object[] var8 = var10003;
      Ref.h(452642608051992089L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      Object var10 = 242072299205494154L;
      Ref.g(242072299205494154L, var10);
      Object[] var10005 = Registry.emptyArgs();
      long var13 = 528723233100399280L;
      Object[] var12 = var10005;
      Ref.h(528723233100399280L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var45) {
         throw var45.getTargetException();
      }

      Object var14 = 473012566903121712L;
      JPopupMenu var10006 = (JPopupMenu)Ref.g(473012566903121712L, var14);
      Object var16 = 240305057674664882L;
      this.remove((com.finalshell.ui.panel.W8)Ref.g(240305057674664882L, var16));
      Object var18 = 473012566903121712L;
      ((JPopupMenu)Ref.g(473012566903121712L, var18)).validate();
      Object var20 = 473012566903121712L;
      ((JPopupMenu)Ref.g(473012566903121712L, var20)).pack();
      Object var22 = 473012566903121712L;
      Dimension var2 = ((JPopupMenu)Ref.g(473012566903121712L, var22)).getPreferredSize();
      Object var24 = 473012566903121712L;
      JPopupMenu var10011 = (JPopupMenu)Ref.g(473012566903121712L, var24);
      Object var26 = 242072299205494154L;
      Ref.g(242072299205494154L, var26);
      Object var28 = 435031631667149019L;
      C_C var10014 = (C_C)Ref.g(435031631667149019L, var28);
      int var10015 = (int)a;
      Object var30 = 242072299205494154L;
      Object var10017 = Ref.g(242072299205494154L, var30);
      Object var32 = 435031631667149019L;
      var10015.show(this, (int)var10017, ((C_C)Ref.g(435031631667149019L, var32)).getHeight() + 4);
      Object var34 = 242072299205494154L;
      Ref.g(242072299205494154L, var34);
      Object var36 = 215009972678572825L;
      Object var10018 = Registry.packArgs(Ref.g(215009972678572825L, var36));
      long var39 = 491105122976850438L;
      Object var38 = var10018;
      var10018 = Ref.h(491105122976850438L, var38, var39);

      try {
         var10018 = (com.finalshell.ui.panel.W8)var10018;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      com.finalshell.ui.panel.W8 var3 = var10018;
      Object var40 = 242072299205494154L;
      Ref.g(242072299205494154L, var40);
      Object var42 = 585743319788652558L;
      ((ArrayList)Ref.g(585743319788652558L, var42)).remove(var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3271412899196078400L;
      long var10002 = -6757428886020458821L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





