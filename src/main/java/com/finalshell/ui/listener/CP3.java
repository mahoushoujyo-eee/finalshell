package com.finalshell.ui.listener;

import com.finalshell.core.YE;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.EditTunnelDialog;
import com.finalshell.ui.panel.TunnelList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CP3 implements ActionListener {
   final TunnelList t;

   CP3(TunnelList var1) {
      this.t = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var3 = 204980472334034752L;
      TunnelList var10003 = (TunnelList)Ref.g(204980472334034752L, var3);
      Object var5 = 204980472334034752L;
      Object var10006 = Ref.g(204980472334034752L, var5);
      Object var7 = 432008228546876612L;
new CP3(this, (YE)var10006, (ArrayList)Ref.g(432008228546876612L, var7), false);
   }
}





