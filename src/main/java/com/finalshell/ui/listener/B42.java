package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.SelectPrivateKeyDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B42 implements ActionListener {
   public final SelectPrivateKeyDialog k;

   public B42(SelectPrivateKeyDialog var1) {
      this.k = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 446578830002090656L;
      Registry.lookupField(302973513284937780L).setBoolean(Ref.g(446578830002090656L, var2), false);
      Object var4 = 446578830002090656L;
      Ref.g(446578830002090656L, var4);
      long var7 = 496916588740471008L;
      Object var6 = null;
      Ref.s(496916588740471008L, var6, var7);
      Object var8 = 446578830002090656L;
      ((SelectPrivateKeyDialog)Ref.g(446578830002090656L, var8)).setVisible(false);
   }
}





