package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.QW;
import com.finalshell.ui.panel.EnableBackgroundImage;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ML implements ListSelectionListener {
   final JCheckBox N;
   final EnableBackgroundImage T;
   public static String a;

   ML(EnableBackgroundImage var1, JCheckBox var2) {
      this.T = var1;
      this.N = var2;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      EnableBackgroundImage.I();
      Object var4 = 347805637754599459L;
      Object var10002 = Ref.g(347805637754599459L, var4);
      Object var6 = 563971228817595380L;
      String var3 = (String)((JList)Ref.g(563971228817595380L, var6)).getSelectedValue();
      Object var2 = var10002;
      if (var3 != null) {
         var10002 = var1.getValueIsAdjusting();
         if (var2 != null) {
            if (var10002 != false) {
               return;
            }

            var10002 = var3.startsWith(a);
         }

         label70: {
            label71: {
               if (var2 != null) {
                  if (var10002 != false) {
                     break label70;
                  }

                  var10002 = Registry.emptyArgs();
                  long var8 = 270389152141252877L;
                  Ref.h2(270389152141252877L, var8);

                  try {
                     ;
                  } catch (InvocationTargetException var25) {
                     throw var25.getTargetException();
                  }

                  if (var2 == null) {
                     break label71;
                  }

                  Object[] var10004 = Registry.emptyArgs();
                  long var11 = 163462326892114024L;
                  Object[] var10 = var10004;
                  Ref.h(163462326892114024L, var10, var11);
                  Object[] var10005 = Registry.emptyArgs();
                  long var13 = 133802226692684648L;
                  Object[] var12 = var10005;
                  var10005 = Ref.h(133802226692684648L, var12, var13);

                  try {
                  } catch (InvocationTargetException var24) {
                     throw var24.getTargetException();
                  }
               }

               if (var10002 != false) {
                  break label70;
               }

               Registry.emptyArgs();
               long var14 = 270389152141252877L;
               Ref.h2(270389152141252877L, var14);

               try {
                  ;
               } catch (InvocationTargetException var23) {
                  throw var23.getTargetException();
               }
            }

            Object[] var27 = Registry.emptyArgs();
            long var17 = 248890456776257543L;
            Object[] var16 = var27;
            Ref.h(248890456776257543L, var16, var17);

            try {
               return;
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }
         }

         Object var18 = 347805637754599459L;
         Registry.lookupField(427521949153014927L).setBoolean(Ref.g(347805637754599459L, var18), true);
         Object var20 = 279999345447201048L;
         ((JCheckBox)Ref.g(279999345447201048L, var20)).setSelected(true);
         SwingUtilities.invokeLater(new QW(this, var3));
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "*S".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 124;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 124;
         var10006 = var0;
      } else {
         var6 = 124;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 124;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 52;
               break;
            case 1:
               var23 = 72;
               break;
            case 2:
               var23 = 116;
               break;
            case 3:
               var23 = 54;
               break;
            case 4:
               var23 = 79;
               break;
            case 5:
               var23 = 37;
               break;
            default:
               var23 = 70;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





