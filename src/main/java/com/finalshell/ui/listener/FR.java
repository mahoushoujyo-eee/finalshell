package com.finalshell.ui.listener;

import com.finalshell.core.Lv4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Km4;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;

public class FR implements ActionListener {
   public final ConnectionProperty w;

   public FR(ConnectionProperty var1) {
      this.w = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var10000 = ConnectionProperty.y();
      this.w.kj.requestFocus();
      int var2 = var10000;
      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Ref.h2(270389152141252877L, var6);
      Object[] var10002 = Registry.emptyArgs();
      long var9 = 410905379772103887L;
      Object[] var8 = var10002;
      Ref.h(410905379772103887L, var8, var9);
      Lv4_2 var10004 = (Lv4_2)(Registry.emptyArgs());
      long var11 = 292557478156152530L;
      Object[] var10 = var10004;
      var10004 = Registry.packArgs(Ref.h(292557478156152530L, var10, var11));
      long var13 = 343419559142469673L;
      Object[] var12 = var10004;
      var10004 = Ref.h(343419559142469673L, var12, var13);

      try {
         var10004 = (Lv4_2)var10004;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      Lv4_2 var3 = var10004;
      if (var3 != null) {
         if (var2 == 0) {
            Object[] var10005 = Registry.emptyArgs();
            long var15 = 577438617729885268L;
            Object[] var14 = var10005;
            var10005 = Ref.h(577438617729885268L, var14, var15);

            try {
               var41 = (Boolean)var10005;
            } catch (InvocationTargetException var34) {
               throw var34.getTargetException();
            }

            if (var41) {
               Object[] var10006 = Registry.emptyArgs();
               long var17 = 222971910568398589L;
               Object[] var16 = var10006;
               Ref.h(222971910568398589L, var16, var17);

               try {
                  ;
               } catch (InvocationTargetException var33) {
                  throw var33.getTargetException();
               }
            }

            Registry.emptyArgs();
            long var18 = 270389152141252877L;
            Ref.h2(270389152141252877L, var18);
            Object[] var10007 = Registry.emptyArgs();
            long var21 = 271043866899908885L;
            Object[] var20 = var10007;
            Ref.h(271043866899908885L, var20, var21);
            Object[] var10009 = Registry.emptyArgs();
            long var23 = 292557478156152530L;
            Object[] var22 = var10009;
            var10009 = Registry.packArgs(Ref.h(292557478156152530L, var22, var23));
            long var25 = 285199883764466291L;
            Object[] var24 = var10009;
            Ref.h(285199883764466291L, var24, var25);

            try {
               ;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }
         }

         label95: {
            com.finalshell.ui.frame.U var4 = this.w.kD;
            com.finalshell.ui.frame.U var39 = var4;
            if (var2 == 0) {
               if (var4 == null) {
                  break label95;
               }

               var39 = var4;
            }

            Km4 var5 = (Km4)var39;
            Object[] var42 = Registry.packArgs(true);
            long var27 = 433716955203722428L;
            Object[] var26 = var42;
            Ref.h(433716955203722428L, var26, var27);

            try {
               ;
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }

            if (var2 == 0) {
               return;
            }
         }

         Object[] var44 = Registry.emptyArgs();
         long var28 = 513527511121793373L;
         Object var10010 = Ref.h2(513527511121793373L, var28);

         try {
            var10010 = (JDialog)var10010;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }

null = new FR(null, var44, (Window)var10010, var3, null);
      }
   }
}





