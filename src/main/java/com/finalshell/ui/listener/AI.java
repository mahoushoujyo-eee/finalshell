package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPopupMenu;

public class AI implements ActionListener {
   final JPopupMenu p;
   final JButton z;
   final ShowDeletedPanel S;

   AI(ShowDeletedPanel var1, JPopupMenu var2, JButton var3) {
      this.S = var1;
      this.p = var2;
      this.z = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 435569998697578167L;
      JPopupMenu var10001 = (JPopupMenu)Ref.g(435569998697578167L, var2);
      Object var4 = 428587681583803988L;
      JButton var10003 = (JButton)Ref.g(428587681583803988L, var4);
      Object var6 = 428587681583803988L;
      var10003.show(true, (int)this, ((JButton)Ref.g(428587681583803988L, var6)).getHeight() - 2);
   }
}





