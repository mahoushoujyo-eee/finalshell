package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.KQ;
import com.finalshell.ui.dialog.SetByKeyboardDialog;
import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class PG_2 {
   public KeyboardFocusManager H;
   public ArrayList S;

   public PG_2() {
      ArrayList var10001 = new ArrayList();
      long var2 = 297544026394429738L;
      ArrayList var1 = var10001;
      Ref.s(297544026394429738L, var1, var2);
      KeyboardFocusManager var10002 = KeyboardFocusManager.getCurrentKeyboardFocusManager();
      long var4 = 482860935260321369L;
      KeyboardFocusManager var3 = var10002;
      Ref.s(482860935260321369L, var3, var4);
      Object var5 = 482860935260321369L;
      ((KeyboardFocusManager)Ref.g(482860935260321369L, var5)).addKeyEventDispatcher(new Oz2(this));
   }

   public void o(Qh2 var1) {
      Object var2 = 297544026394429738L;
      ((ArrayList)Ref.g(297544026394429738L, var2)).add(var1);
   }

   public void W(KeyEvent var1) {
      int[] var10000 = ZG_2.Z();
      Window var3 = SwingUtilities.getWindowAncestor(var1.getComponent());
      int[] var2 = var10000;
      KeyStroke var4 = KeyStroke.getKeyStrokeForEvent(var1);
      Registry.emptyArgs();
      long var7 = 270389152141252877L;
      Ref.h2(270389152141252877L, var7);
      Object[] var10002 = Registry.emptyArgs();
      long var10 = 306266403902896148L;
      Object[] var9 = var10002;
      Ref.h(306266403902896148L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var34) {
         throw new RuntimeException(var34.getTargetException());
      }

      KeyStroke var10004 = Registry.packArgs(((Integer)Ref.g(324822989783513741L, null)).intValue());
      long var12 = 487190762664997585L;
      Object var11 = var10004;
      var10004 = (KeyStroke)Ref.h(487190762664997585L, var11, var12);
      KeyStroke var10005 = (KeyStroke)(Registry.emptyArgs());
      long var14 = 546345160214988812L;
      Object var13 = var10005;
      var10005 = Ref.h(546345160214988812L, var13, var14);

      try {
         var10005 = (KeyStroke)var10005;
      } catch (InvocationTargetException var33) {
         throw new RuntimeException(var33.getTargetException());
      }

      boolean var36 = var10004.equals(var10005);
      if (var2 == null) {
         if (!var36) {
            return;
         }

         var36 = var3.getClass().equals(SetByKeyboardDialog.class);
      }

      if (!var36) {
         Registry.emptyArgs();
         long var15 = 270389152141252877L;
         Ref.h2(270389152141252877L, var15);
         Object[] var10006 = Registry.emptyArgs();
         long var18 = 634817973682994708L;
         Object[] var17 = var10006;
         Ref.h(634817973682994708L, var17, var18);
         Object[] var10007 = Registry.emptyArgs();
         long var20 = 240567170779145617L;
         Object[] var19 = var10007;
         Ref.h(240567170779145617L, var19, var20);
         Object[] var10008 = Registry.emptyArgs();
         long var22 = 402818413346430437L;
         Object[] var21 = var10008;
         Ref.h(402818413346430437L, var21, var22);

         try {
            ;
         } catch (InvocationTargetException var32) {
            throw new RuntimeException(var32.getTargetException());
         }

         if (var2 == null) {
            KQ var10009 = (KQ)(Registry.emptyArgs());
            long var24 = 337722834808748729L;
            Object var23 = var10009;
            var10009 = Ref.h(337722834808748729L, var23, var24);

            try {
               var10009 = (KQ)var10009;
            } catch (InvocationTargetException var31) {
               throw new RuntimeException(var31.getTargetException());
            }

            if (!var10009.isVisible()) {
               Object[] var10010 = Registry.emptyArgs();
               long var26 = 385826789103549433L;
               Object[] var25 = var10010;
               Ref.h(385826789103549433L, var25, var26);

               try {
                  ;
               } catch (InvocationTargetException var30) {
                  throw new RuntimeException(var30.getTargetException());
               }

               if (var2 == null) {
                  return;
               }
            }
         }

         Object[] var41 = Registry.emptyArgs();
         long var28 = 522547499406886283L;
         Object[] var27 = var41;
         Ref.h(522547499406886283L, var27, var28);

         try {
            ;
         } catch (InvocationTargetException var29) {
            throw new RuntimeException(var29.getTargetException());
         }
      }
   }
}





