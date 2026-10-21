package com.finalshell.ui.listener;

import com.finalshell.core.Dv2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Yq2;
import com.finalshell.ui.panel.Address;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class TL implements ActionListener {
   public final Address W;

   public TL(Address var1) {
      this.W = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = Address.g();
      Object var4 = 285052103515156702L;
      Ref.g(285052103515156702L, var4);
      Object var6 = 625337668494616580L;
      Object var10002 = (ArrayList)Ref.g(625337668494616580L, var6);
      if (!var2) {
         if (var10002.size() <= 1) {
            return;
         }

         var10002 = this;
         Object var8 = 285052103515156702L;
         Ref.g(285052103515156702L, var8);
         Object var10 = 625337668494616580L;
         ArrayList var10004 = (ArrayList)Ref.g(625337668494616580L, var10);
         Object var12 = 285052103515156702L;
         Object var10006 = Ref.g(285052103515156702L, var12);
         Object var14 = 625337668494616580L;
         var10006.get(((ArrayList)Ref.g(625337668494616580L, var14)).size() - 2);
      }

      String var3 = (String)var10002;
      Object var16 = 285052103515156702L;
      Ref.g(285052103515156702L, var16);
      long var19 = 575820630826541433L;
      Ref.s(575820630826541433L, var3, var19);
      Object var20 = 285052103515156702L;
      Ref.g(285052103515156702L, var20);
      Object var22 = 426888588741823559L;
      Dv2 var31 = (Dv2)Ref.g(426888588741823559L, var22);
      Object var24 = 285052103515156702L;
      Object var10008 = Ref.g(285052103515156702L, var24);
      Object var26 = 426888588741823559L;
      ((Dv2)var10008).setCaretPosition(((Dv2)Ref.g(426888588741823559L, var26)).getDocument().getLength());
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10009 = Registry.packArgs(new Yq2(this, var3));
      long var29 = 434592463220957006L;
      Object[] var28 = var10009;
      Ref.h(434592463220957006L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }
   }
}





