package com.finalshell.ui.listener;

import com.finalshell.core.Dv2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Address;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class C2 implements ActionListener {
   public final Address B;

   public C2(Address var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = Address.g();
      Object var4 = 544299623884011127L;
      Ref.g(544299623884011127L, var4);
      Object var6 = 130333487516543213L;
      Object var10002 = (String)Ref.g(130333487516543213L, var6);
      if (var2) {
         Object var3 = var10002;
         if (!var2) {
            if (var3 == null) {
               return;
            }

            Object var14 = 544299623884011127L;
            Ref.g(544299623884011127L, var14);
            Object var16 = 426888588741823559L;
            ((Dv2)Ref.g(426888588741823559L, var16)).setText((String)var3);
            Object var18 = 544299623884011127L;
            Ref.g(544299623884011127L, var18);
            Object var20 = 426888588741823559L;
            Dv2 var10006 = (Dv2)Ref.g(426888588741823559L, var20);
            Object var22 = 544299623884011127L;
            Object var10008 = Ref.g(544299623884011127L, var22);
            Object var24 = 426888588741823559L;
            ((Dv2)var10008).setCaretPosition(((Dv2)Ref.g(426888588741823559L, var24)).getDocument().getLength());
         }

         Object var26 = 544299623884011127L;
         Ref.g(544299623884011127L, var26);
         Object[] var10004 = Registry.packArgs(var3, true, true);
         long var29 = 324338769529465951L;
         Object[] var28 = var10004;
         Ref.h(324338769529465951L, var28, var29);

         try {
            ;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }
      } else if (var10002 != null) {
         var10002 = this;
         Object var8 = 544299623884011127L;
         Ref.g(544299623884011127L, var8);
         Object var10 = 130333487516543213L;
         Registry.packArgs(Ref.g(130333487516543213L, var10));
         long var12 = 405430188584561323L;
         Ref.h2(405430188584561323L, var12);

         label23:
         try {
            break label23;
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }
      }
   }
}





