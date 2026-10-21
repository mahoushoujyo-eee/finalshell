package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Kb2;
import com.finalshell.ui.panel.LocalDrive;
import com.finalshell.ui.panel.Z7;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class K72 implements TreeSelectionListener {
   public final DefaultMutableTreeNode s;
   public final LocalDrive q;
   public final Kb2 I;

   public K72(Kb2 var1, DefaultMutableTreeNode var2, LocalDrive var3) {
      this.I = var1;
      this.s = var2;
      this.q = var3;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      Z7.m();
      Object var5 = 432279057068136028L;
      Registry.lookupField(625121400334282112L).setLong(Ref.g(432279057068136028L, var5), System.currentTimeMillis());
      Object var7 = 432279057068136028L;
      Ref.g(432279057068136028L, var7);
      Object var9 = 418996528515713032L;
      Ref.g(418996528515713032L, var9);
      DefaultMutableTreeNode var10004 = (DefaultMutableTreeNode)(Registry.emptyArgs());
      long var12 = 148691699844242618L;
      Object[] var11 = var10004;
      var10004 = Ref.h(148691699844242618L, var11, var12);

      try {
         var10004 = (DefaultMutableTreeNode)var10004;
      } catch (InvocationTargetException var57) {
         throw var57.getTargetException();
      }

      DefaultMutableTreeNode var3 = var10004;
      if (this == null || var3 != null) {
         Object var10005;
         label91: {
            label92: {
               Object var13 = 278769137899237136L;
               var10005 = this.equals((DefaultMutableTreeNode)Ref.g(278769137899237136L, var13));
               if (this == null) {
                  if (var10005 == null) {
                     Object var15 = 432279057068136028L;
                     Ref.g(432279057068136028L, var15);
                     Object var17 = 605945497076756383L;
                     Ref.g(605945497076756383L, var17);
                     Object var19 = 124846334272944128L;
                     Object[] var10009 = Registry.packArgs(Ref.g(124846334272944128L, var19));
                     long var22 = 262788292718351309L;
                     Object[] var21 = var10009;
                     Ref.h(262788292718351309L, var21, var22);

                     try {
                        ;
                     } catch (InvocationTargetException var56) {
                        throw var56.getTargetException();
                     }

                     if (this == null) {
                        break label92;
                     }
                  }

                  var10005 = var3;
                  Object var23 = 432279057068136028L;
                  Object var10007 = Ref.g(432279057068136028L, var23);
                  Object var25 = 477205005732428780L;
                  var10007.equals((DefaultMutableTreeNode)Ref.g(477205005732428780L, var25));
               }

               if (this == null) {
                  break label91;
               }

               if (var10005 == null) {
                  Object var27 = 432279057068136028L;
                  Ref.g(432279057068136028L, var27);
                  Object var29 = 605945497076756383L;
                  Ref.g(605945497076756383L, var29);
                  Object var31 = 432279057068136028L;
                  Ref.g(432279057068136028L, var31);
                  Object var33 = 619862119829431751L;
                  Object[] var10010 = Registry.packArgs(Ref.g(619862119829431751L, var33));
                  long var36 = 262788292718351309L;
                  Object[] var35 = var10010;
                  Ref.h(262788292718351309L, var35, var36);

                  try {
                     ;
                  } catch (InvocationTargetException var55) {
                     throw var55.getTargetException();
                  }
               }
            }

            var10005 = this;
            Object var37 = 432279057068136028L;
            Ref.g(432279057068136028L, var37);
            Object[] var61 = Registry.emptyArgs();
            long var40 = 589770811905469363L;
            Object[] var39 = var61;
            var61 = Ref.h(589770811905469363L, var39, var40);

            try {
            } catch (InvocationTargetException var54) {
               throw var54.getTargetException();
            }
         }

         Object var4 = var10005;
         if (var1.getOldLeadSelectionPath() != null) {
         }

         label94: {
            var10005 = var4;
            if (this == null) {
               if (var4 == null) {
                  break label94;
               }

               var10005 = var3;
               Object var41 = 432279057068136028L;
               Object var63 = Ref.g(432279057068136028L, var41);
               Object var43 = 292193458601960086L;
               var63.equals((DefaultMutableTreeNode)Ref.g(292193458601960086L, var43));
            }

            if (var10005 == null) {
               return;
            }

            Object var45 = 432279057068136028L;
            Ref.g(432279057068136028L, var45);
            Object[] var64 = Registry.emptyArgs();
            long var48 = 467968002539848304L;
            Object[] var47 = var64;
            Ref.h(467968002539848304L, var47, var48);

            try {
               ;
            } catch (InvocationTargetException var53) {
               throw var53.getTargetException();
            }

            if (this == null) {
               return;
            }
         }

         Object var49 = 432279057068136028L;
         Ref.g(432279057068136028L, var49);
         long var52 = 292193458601960086L;
         Ref.s(292193458601960086L, var3, var52);
      }
   }
}





