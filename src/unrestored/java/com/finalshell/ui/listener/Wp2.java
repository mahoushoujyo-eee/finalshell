package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.AW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Wp2 implements ActionListener {
   public final AW C;

   public Wp2(AW var1) {
      this.C = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var3 = 239736049163801477L;
      String var2 = JOptionPane.showInputDialog((AW)Ref.g(239736049163801477L, var3), "");
      if (var2 != null) {
         Object var5 = 239736049163801477L;
         Ref.g(239736049163801477L, var5);
         Object var7 = 220378371334645424L;
         JTextField var10003 = (JTextField)Ref.g(220378371334645424L, var7);
         Object var10004 = Registry.packArgs(var2);
         long var9 = 492016222988846142L;
         Object var10005 = Ref.h2(492016222988846142L, var9);

         try {
            var10005 = (String)var10005;
         } catch (InvocationTargetException var11) {
            throw new RuntimeException(var11.getTargetException());
         }

         ((javax.swing.text.JTextComponent)var10004).setText((String)var10005);
      }
   }
}





