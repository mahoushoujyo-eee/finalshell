package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Tk2;
import com.finalshell.ui.panel.YJ;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;

public class DR3 implements FocusListener {
   public boolean r;
   public final JTextComponent O;

   public DR3(JTextComponent var1) {
      this.O = var1;
      Registry.lookupField(404708917332303584L).setBoolean(this, false);
   }

   @Override
   public void focusLost(FocusEvent var1) {
      label25: {
         String[] var2 = com.finalshell.ui.panel.F8.y();
         if (var2 == null) {
            Registry.emptyArgs();
            long var3 = 310867573767805863L;
            Object var10001 = Ref.h2(310867573767805863L, var3);

            try {
               var10001 = (YJ)var10001;
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }

            if (((YJ)var10001).isVisible()) {
               break label25;
            }

            Registry.lookupField(404708917332303584L).setBoolean(this, false);
         }

         if (var2 == null) {
            return;
         }
      }

      Registry.lookupField(404708917332303584L).setBoolean(this, true);
   }

   @Override
   public void focusGained(FocusEvent var1) {
      String[] var2;
      DR3 var10;
      label48: {
         Object var3;
         label51: {
            String[] var10000 = com.finalshell.ui.panel.F8.y();
            var3 = false;
            var2 = var10000;
            Component var9 = var1.getOppositeComponent();
            if (var2 == null) {
               if (var9 == null) {
                  break label51;
               }

               var9 = var1.getOppositeComponent();
            }

            var10 = (DR3)(var9.getClass().equals(JRootPane.class));
            if (var2 != null) {
               break label48;
            }

            if (var10 == null) {
               var3 = true;
            }
         }

         var10 = (DR3)var3;
      }

      if (var2 == null) {
         if (var10 == null) {
            return;
         }

         var10 = this;
         Object var4 = 442490695944429197L;
         Registry.packArgs(Ref.g(442490695944429197L, var4));
         long var6 = 620575814828970493L;
         Object var10002 = Ref.h2(620575814828970493L, var6);

         try {
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }
      }

      if (var2 == null) {
         if (var10 == null) {
            return;
         }

         var10 = (DR3)(Registry.lookupField(404708917332303584L).getBoolean(this));
      }

      if (var10 == null) {
         SwingUtilities.invokeLater(new Tk2(this));
      }
   }
}





