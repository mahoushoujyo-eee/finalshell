package com.finalshell.ui.listener;

import com.finalshell.core.C_C;
import com.finalshell.core.FX3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;

public class QV implements MouseListener {
   public final String V;
   public final FX3 j;
   public final JLabel F;
   public final Color O;
   public final com.finalshell.ui.panel.W8 l;
   public final JPopupMenu X;
   public final SelectDownloadFolderPanel y;
   public static String a;

   public QV(SelectDownloadFolderPanel var1, String var2, FX3 var3, JLabel var4, Color var5, com.finalshell.ui.panel.W8 var6, JPopupMenu var7) {
      this.y = var1;
      this.V = var2;
      this.j = var3;
      this.F = var4;
      this.O = var5;
      this.l = var6;
      this.X = var7;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Integer var77;
      int[] var2 = SelectDownloadFolderPanel.O$arrint();
      if (var2 == null) {
         if (var1.getButton() != 1) {
            return;
         }

         Object var4 = 169328206873800150L;
         Ref.g(169328206873800150L, var4);
         Object var6 = 435031631667149019L;
         C_C var10002 = (C_C)Ref.g(435031631667149019L, var6);
         StringBuilder var10003 = new StringBuilder().append(a);
         File var10004;
         Object var8 = 198856776624497515L;
         // [VF-super] super((String)Ref.g(198856776624497515L, var8));
         var10003.setText(var10004.append(var10004.getAbsolutePath()).toString());
         Object var10 = 169328206873800150L;
         Ref.g(169328206873800150L, var10);
         Object var12 = 435031631667149019L;
         C_C var10005 = (C_C)Ref.g(435031631667149019L, var12);
         Object var14 = 198856776624497515L;
         this.setToolTipText((String)Ref.g(198856776624497515L, var14));
         Object var16 = 163486738077339335L;
         Ref.g(163486738077339335L, var16);
         Object var18 = 198856776624497515L;
         Object[] var10009 = Registry.packArgs(Ref.g(198856776624497515L, var18));
         long var21 = 586754005152705687L;
         Object[] var20 = var10009;
         Ref.h(586754005152705687L, var20, var21);

         try {
            ;
         } catch (InvocationTargetException var70) {
            throw var70.getTargetException();
         }

         Object var22 = 169328206873800150L;
         Ref.g(169328206873800150L, var22);
         Object var24 = 269586463206323716L;
         Ref.g(269586463206323716L, var24);
         Object var26 = 198856776624497515L;
         Object[] var10013 = Registry.packArgs(Ref.g(198856776624497515L, var26));
         long var29 = 565172623409340742L;
         Object[] var28 = var10013;
         Ref.h(565172623409340742L, var28, var29);

         try {
            ;
         } catch (InvocationTargetException var69) {
            throw var69.getTargetException();
         }

         Object var30 = 169328206873800150L;
         Ref.g(169328206873800150L, var30);
         Object[] var10015 = Registry.emptyArgs();
         long var33 = 528723233100399280L;
         Object[] var32 = var10015;
         Ref.h(528723233100399280L, var32, var33);

         try {
            ;
         } catch (InvocationTargetException var68) {
            throw var68.getTargetException();
         }

         Object var34 = 633058136790218286L;
         JLabel var10016 = (JLabel)Ref.g(633058136790218286L, var34);
         Object var36 = 287908082145461409L;
         this.setBackground((Color)Ref.g(287908082145461409L, var36));
         Object var38 = 322971539312536767L;
         com.finalshell.ui.panel.W8 var10018 = (com.finalshell.ui.panel.W8)Ref.g(322971539312536767L, var38);
         Object var40 = 287908082145461409L;
         this.setBackground((Color)Ref.g(287908082145461409L, var40));
         Object var42 = 600739725726203285L;
         ((JPopupMenu)Ref.g(600739725726203285L, var42)).setVisible(false);
      }

      Object var44 = 169328206873800150L;
      Ref.g(169328206873800150L, var44);
      Object var46 = 198856776624497515L;
      Object var71 = Registry.packArgs(Ref.g(198856776624497515L, var46));
      long var49 = 491105122976850438L;
      Object var48 = var71;
      var71 = Ref.h(491105122976850438L, var48, var49);

      try {
         var71 = (com.finalshell.ui.panel.W8)var71;
      } catch (InvocationTargetException var67) {
         throw var67.getTargetException();
      }

      com.finalshell.ui.panel.W8 var3 = var71;
      Object var50 = 169328206873800150L;
      Ref.g(169328206873800150L, var50);
      Object var52 = 585743319788652558L;
      ((ArrayList)Ref.g(585743319788652558L, var52)).remove(var3);
      Object var54 = 169328206873800150L;
      Ref.g(169328206873800150L, var54);
      Object var56 = 585743319788652558L;
      ((ArrayList)Ref.g(585743319788652558L, var56)).add(0, var3);
      Object var58 = 600739725726203285L;
      ((JPopupMenu)Ref.g(600739725726203285L, var58)).remove(var3);
      Object var60 = 600739725726203285L;
      JPopupMenu var74 = (JPopupMenu)Ref.g(600739725726203285L, var60);
      Object var62 = 163486738077339335L;
      Object var10012 = Ref.g(163486738077339335L, var62);
      Object var75 = Registry.emptyArgs();
      long var65 = 284002349345105786L;
      Object var64 = var75;
      var75 = Ref.h(284002349345105786L, var64, var65);

      try {
         var77 = (Integer)var75;
      } catch (InvocationTargetException var66) {
         throw var66.getTargetException();
      }

      this.insert((Component)var10012, var77 - 1);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "丠輪s\u0001".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 123;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 123;
         var10006 = var0;
      } else {
         var6 = 123;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 123;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 80;
               break;
            case 1:
               var23 = 44;
               break;
            case 2:
               var23 = 50;
               break;
            case 3:
               var23 = 90;
               break;
            case 4:
               var23 = 30;
               break;
            case 5:
               var23 = 91;
               break;
            default:
               var23 = 48;
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





