package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.BT;
import com.finalshell.ui.panel.Address;
import com.finalshell.ui.panel.PathPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextField;

public class Lw2 implements ActionListener {
   final PathPanel Z;

   Lw2(PathPanel var1) {
      this.Z = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = Address.g();
      Object var4 = 257342744894307012L;
      Ref.g(257342744894307012L, var4);
      Object var6 = 291327501867436911L;
      Object var10002 = (String)Ref.g(291327501867436911L, var6);
      if (var2) {
         Object var3 = var10002;
         if (!var2) {
            if (var3 == null) {
               return;
            }

            Object var14 = 257342744894307012L;
            Ref.g(257342744894307012L, var14);
            Object var16 = 626158744249045388L;
            ((JTextField)Ref.g(626158744249045388L, var16)).setText((String)var3);
            Object var18 = 257342744894307012L;
            Ref.g(257342744894307012L, var18);
            Object var20 = 626158744249045388L;
            JTextField var10006 = (JTextField)Ref.g(626158744249045388L, var20);
            Object var22 = 257342744894307012L;
            Object var10008 = Ref.g(257342744894307012L, var22);
            Object var24 = 626158744249045388L;
            var10008.setCaretPosition(((JTextField)Ref.g(626158744249045388L, var24)).getDocument().getLength());
         }

         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10003 = Registry.packArgs(new BT(this, (String)var3));
         long var27 = 434592463220957006L;
         Object[] var26 = var10003;
         Ref.h(434592463220957006L, var26, var27);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }
      } else if (var10002 != null) {
         var10002 = this;
         Object var8 = 257342744894307012L;
         Ref.g(257342744894307012L, var8);
         Object var10 = 291327501867436911L;
         Registry.packArgs(Ref.g(291327501867436911L, var10));
         long var12 = 405430188584561323L;
         Ref.h2(405430188584561323L, var12);

         label23:
         try {
            break label23;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }
      }
   }
}





