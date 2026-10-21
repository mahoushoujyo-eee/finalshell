package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.RouteTracePanel2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class TK implements ActionListener {
   public final RouteTracePanel2 B;

   public TK(RouteTracePanel2 var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var3 = 146357017991029779L;
      Ref.g(146357017991029779L, var3);
      Object var5 = 520858298081292913L;
      Object var2 = ((DefaultMutableTreeNode)Ref.g(520858298081292913L, var5)).getUserObject();
   }
}





