package com.finalshell.ui.adapter;

import com.finalshell.core.JR;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.K42;
import com.finalshell.ui.panel.KA_3;
import com.finalshell.ui.panel.N22;
import com.finalshell.ui.panel.Up2;
import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableModel;

public class Bx2 extends Oe2 {
   public Color t;
   public Border y;
   public JLabel z;
   public final N22 A;
   public final JR d;

   public Bx2(JR var1, N22 var2) {
      this.d = var1;
      this.A = var2;
      long var4 = 283651054618121503L;
      Color var3 = Color.white;
      Ref.s(283651054618121503L, var3, var4);
      Border var10002 = BorderFactory.createEmptyBorder(0, 3, 0, 0);
      long var6 = 494695275834458622L;
      Border var5 = var10002;
      Ref.s(494695275834458622L, var5, var6);
      Up2 var10003 = new Up2(this);
      long var8 = 264155899074958124L;
      Up2 var7 = var10003;
      Ref.s(264155899074958124L, var7, var8);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      int var8;
      label64: {
         KA_3.y$arrky_4();
         Object var10 = 264155899074958124L;
         ((JLabel)Ref.g(264155899074958124L, var10)).setOpaque(true);
         Object var12 = 264155899074958124L;
         ((JLabel)Ref.g(264155899074958124L, var12)).setIcon(null);
         Object var14 = 264155899074958124L;
         ((JLabel)Ref.g(264155899074958124L, var14)).setForeground(Color.white);
         Object var16 = 264155899074958124L;
         JLabel var10004 = (JLabel)Ref.g(264155899074958124L, var16);
         Object var18 = 494695275834458622L;
         this.setBorder((Border)Ref.g(494695275834458622L, var18));
         var8 = var1.convertColumnIndexToModel(var6);
         TableModel var10005 = var1.getModel();
         if (this == null) {
            if (var10005 == null) {
               break label64;
            }

            var10005 = var1.getModel();
         }

         K42 var9 = (K42)var10005;
         Object var20 = 264155899074958124L;
         JLabel var10006 = (JLabel)Ref.g(264155899074958124L, var20);
         String var10008 = (String)(Registry.packArgs(var8));
         long var23 = 366869564242274233L;
         Object var22 = var10008;
         var10008 = Ref.h(366869564242274233L, var22, var23);

         try {
            var10008 = (String)var10008;
         } catch (InvocationTargetException var59) {
            throw var59.getTargetException();
         }

         var9.setText(var10008);
      }

      Object var24 = 583289971016546929L;
      Ref.g(583289971016546929L, var24);
      Object var10009 = Registry.emptyArgs();
      long var27 = 589871071857415373L;
      Object var26 = var10009;
      var10009 = Ref.h(589871071857415373L, var26, var27);

      try {
         var64 = (Integer)var10009;
      } catch (InvocationTargetException var58) {
         throw var58.getTargetException();
      }

      label65: {
         int var60 = var64;
         int var65 = var60;
         int var10010 = Registry.lookupField(385183684097685197L).getInt(null);
         if (this == null) {
            if (var60 == var10010) {
               if (var8 == 0) {
                  Object var28 = 264155899074958124L;
                  JLabel var66 = (JLabel)Ref.g(264155899074958124L, var28);
                  Object var30 = 279211102447061689L;
                  Object var10012 = Ref.g(279211102447061689L, var30);
                  Object var32 = 435262014696409152L;
                  ((javax.swing.JComponent)var10012).setBackground((Color)Ref.g(435262014696409152L, var32));
                  if (this == null) {
                     break label65;
                  }
               }

               Object var34 = 264155899074958124L;
               JLabel var67 = (JLabel)Ref.g(264155899074958124L, var34);
               Object var36 = 279211102447061689L;
               Object var70 = Ref.g(279211102447061689L, var36);
               Object var38 = 262573955458954459L;
               ((javax.swing.JComponent)var70).setBackground((Color)Ref.g(262573955458954459L, var38));
               if (this == null) {
                  break label65;
               }
            }

            var65 = var60;
            var10010 = Registry.lookupField(259753199762599790L).getInt(null);
         }

         if (this == null) {
            if (var65 != var10010) {
               break label65;
            }

            var65 = var8;
            var10010 = 1;
         }

         if (var65 == var10010) {
            Object var40 = 264155899074958124L;
            JLabel var68 = (JLabel)Ref.g(264155899074958124L, var40);
            Object var42 = 279211102447061689L;
            Object var71 = Ref.g(279211102447061689L, var42);
            Object var44 = 435262014696409152L;
            ((javax.swing.JComponent)var71).setBackground((Color)Ref.g(435262014696409152L, var44));
            if (this == null) {
               break label65;
            }
         }

         Object var46 = 264155899074958124L;
         JLabel var69 = (JLabel)Ref.g(264155899074958124L, var46);
         Object var48 = 279211102447061689L;
         Object var72 = Ref.g(279211102447061689L, var48);
         Object var50 = 262573955458954459L;
         ((javax.swing.JComponent)var72).setBackground((Color)Ref.g(262573955458954459L, var50));
      }

      Object var52 = 264155899074958124L;
      Color var10014 = ((JLabel)Ref.g(264155899074958124L, var52)).getBackground();
      long var55 = 283651054618121503L;
      Color var54 = var10014;
      Ref.s(283651054618121503L, var54, var55);
      Object var56 = 264155899074958124L;
      return (JLabel)Ref.g(264155899074958124L, var56);
   }
   private static Object var64;
}





