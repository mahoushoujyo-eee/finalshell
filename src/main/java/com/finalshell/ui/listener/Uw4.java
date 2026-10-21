package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.SelectPrivateKeyDialog;
import com.finalshell.ui.panel.ConnectionEditorPanel;
import com.finalshell.ui.panel.Z7;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Uw4 implements ActionListener {
   public final ConnectionEditorPanel U;

   public Uw4(ConnectionEditorPanel var1) {
      this.U = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var32;
      Z7.M();
      Object var5 = 590487090493354324L;
      Window var3 = SwingUtilities.getWindowAncestor((ConnectionEditorPanel)Ref.g(590487090493354324L, var5));
      SelectPrivateKeyDialog var4 = new SelectPrivateKeyDialog(var3);
      var4.setLocationRelativeTo(var3);
      var4.setVisible(true);
      if (this == null) {
         Object var10002 = Registry.emptyArgs();
         long var8 = 232671688978587550L;
         Object var7 = var10002;
         var10002 = Ref.h(232671688978587550L, var7, var8);

         try {
            var32 = (Boolean)var10002;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }

         if (!var32) {
            return;
         }

         Object var9 = 590487090493354324L;
         Ref.g(590487090493354324L, var9);
         Object[] var10005 = Registry.emptyArgs();
         long var12 = 354630440848279501L;
         Object[] var11 = var10005;
         var10005 = Ref.h(354630440848279501L, var11, var12);
         long var14 = 581836656594480986L;
         Object var13 = var10005;
         Ref.s(581836656594480986L, var13, var14);
      }

      Object var15 = 590487090493354324L;
      ConnectionEditorPanel var33 = (ConnectionEditorPanel)Ref.g(590487090493354324L, var15);
      if (this == null) {
         Object var17 = 581836656594480986L;
         if ((com.finalshell.core.LN3)Ref.g(581836656594480986L, var17) == null) {
            return;
         }

         Object var19 = 590487090493354324L;
         ConnectionEditorPanel var10004 = (ConnectionEditorPanel)Ref.g(590487090493354324L, var19);
      }

      Object var21 = 132310058849395865L;
      JTextField var10003 = (JTextField)Ref.g(132310058849395865L, var21);
      Object var23 = 590487090493354324L;
      Ref.g(590487090493354324L, var23);
      Object var25 = 581836656594480986L;
      Object var10006 = Ref.g(581836656594480986L, var25);
      String var10007 = (String)(Registry.emptyArgs());
      long var28 = 286931176286176762L;
      Object var27 = var10007;
      var10007 = Ref.h(286931176286176762L, var27, var28);

      try {
         var10007 = (String)var10007;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      ((javax.swing.text.JTextComponent)var10006).setText(var10007);
   }
}





