package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Xw2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TY implements ActionListener {
   final Xw2 a;

   TY(Xw2 var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 240860614129562710L;
      Registry.lookupField(619905985051257260L).setInt(Ref.g(240860614129562710L, var2), Registry.lookupField(265275935393846693L).getInt(null));
      Object var4 = 240860614129562710L;
      ((Xw2)Ref.g(240860614129562710L, var4)).setVisible(false);
   }
}





