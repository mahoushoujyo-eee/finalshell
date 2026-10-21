package com.finalshell.ui.listener;

import com.finalshell.core.L1;
import com.finalshell.core.Tq4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class Lk4 implements MouseListener {
   public final ClearListDialog d;

   public Lk4(ClearListDialog var1) {
      this.d = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      ClearListDialog.i$arrString();
      Object var6 = 489298198098055579L;
      Ref.g(489298198098055579L, var6);
      Object var8 = 618427502576624312L;
      Object var3 = ((Tq4)Ref.g(618427502576624312L, var8)).getSelectedRow();
      Object var10 = 489298198098055579L;
      Registry.lookupField(461146548297071424L).setBoolean(Ref.g(489298198098055579L, var10), false);
      Lk4 var10003 = (Lk4)var3;
      if (this == null) {
         if (!(var3 > -1)) {
            return;
         }

         var10003 = this;
         Object var12 = 489298198098055579L;
         Ref.g(489298198098055579L, var12);
         Object var14 = 618427502576624312L;
         ((Tq4)Ref.g(618427502576624312L, var14)).convertRowIndexToModel((int)var3);
      }

      Lk4 var4 = var10003;
      Object var16 = 489298198098055579L;
      Ref.g(489298198098055579L, var16);
      Object var18 = 598800499692003827L;
      Ref.g(598800499692003827L, var18);
      Object[] var10006 = Registry.packArgs((int)var4, 0);
      long var21 = 130061847059020450L;
      Object[] var20 = var10006;
      L1 var5 = (L1)Ref.h(130061847059020450L, var20, var21);
      Object var22 = 489298198098055579L;
      ClearListDialog var10007 = (ClearListDialog)Ref.g(489298198098055579L, var22);
      if (this == null) {
         Registry.lookupField(251701947004354642L).setLong(var10007, System.currentTimeMillis());
         if (var1.getButton() != 1) {
            return;
         }

         Object var24 = 489298198098055579L;
         ClearListDialog var10008 = (ClearListDialog)Ref.g(489298198098055579L, var24);
      }

      Object var26 = 489298198098055579L;
      Object var10009 = Ref.g(489298198098055579L, var26);
      Object var28 = 618427502576624312L;
      int var10010 = ((Tq4)Ref.g(618427502576624312L, var28)).getRowCount() - var4;
      if (this == null) {
         var10010 = var10010 < Registry.lookupField(231094135750452722L).getInt(null) ? 1 : 0;
      }

      label70: {
         Registry.lookupField(461146548297071424L).setBoolean(var10009, (boolean)var10010);
         if (this == null) {
            Registry.emptyArgs();
            long var30 = 270389152141252877L;
            Ref.h2(270389152141252877L, var30);
            Object[] var10011 = Registry.emptyArgs();
            long var33 = 163462326892114024L;
            Object[] var32 = var10011;
            Ref.h(163462326892114024L, var32, var33);
            Object[] var10012 = Registry.emptyArgs();
            long var35 = 633712494917113170L;
            Object[] var34 = var10012;
            var10012 = Ref.h(633712494917113170L, var34, var35);

            try {
               var57 = (Boolean)var10012;
            } catch (InvocationTargetException var53) {
               throw var53.getTargetException();
            }

            if (!var57) {
               Object var36 = 489298198098055579L;
               ClearListDialog var10013 = (ClearListDialog)Ref.g(489298198098055579L, var36);
               if (this != null) {
                  break label70;
               }

               Object var38 = 618427502576624312L;
               if (((Tq4)Ref.g(618427502576624312L, var38)).getRowCount() - var4 > Registry.lookupField(231094135750452722L).getInt(null)) {
                  Registry.emptyArgs();
                  long var40 = 128283426706089385L;
                  Ref.h2(128283426706089385L, var40);

                  try {
                     return;
                  } catch (InvocationTargetException var50) {
                     throw var50.getTargetException();
                  }
               }
            }

            Object var42 = 489298198098055579L;
            Ref.g(489298198098055579L, var42);
            Object[] var10014 = Registry.emptyArgs();
            long var45 = 496821856781947383L;
            Object[] var44 = var10014;
            Ref.h(496821856781947383L, var44, var45);

            try {
               ;
            } catch (InvocationTargetException var52) {
               throw var52.getTargetException();
            }
         }

         Object var46 = 489298198098055579L;
         ClearListDialog var54 = (ClearListDialog)Ref.g(489298198098055579L, var46);
      }

      Object[] var55 = Registry.packArgs(var5);
      long var49 = 345502075173010592L;
      Object[] var48 = var55;
      Ref.h(345502075173010592L, var48, var49);

      try {
         ;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }
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
}





