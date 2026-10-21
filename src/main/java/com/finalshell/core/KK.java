package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;

public class KK extends JTable {
   public void V(int var1) {
      Rectangle var2 = this.getCellRect(var1, 0, true);
      Rectangle var3 = this.getCellRect(var1, this.getColumnCount() - 1, true);
      Rectangle var4 = Rv4.B(var2, var3);
      if (var4 != null) {
         this.scrollRectToVisible(var4);
      }
   }

   public void C(int var1) {
      Rectangle var2 = this.getCellRect(0, var1, true);
      Rectangle var3 = this.getCellRect(this.getRowCount() - 1, var1, true);
      Rectangle var4 = Rv4.B(var2, var3);
      if (var4 != null) {
         this.scrollRectToVisible(var4);
      }
   }

   public void c(int var1) {
      Object[] var10001 = Registry.packArgs(var1, true);
      long var3 = 523670771353153858L;
      Object[] var2 = var10001;
      Ref.h(523670771353153858L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void X(int var1) {
      String[] var2 = com.finalshell.ui.panel.F8.y();
      if (var2 == null) {
         if (var1 == -1) {
            return;
         }

         this.addColumnSelectionInterval(0, this.getColumnCount() - 1);
      }

      this.addRowSelectionInterval(var1, var1);
   }

   public void g(int var1, boolean var2) {
      String[] var10000 = com.finalshell.ui.panel.F8.y();
      this.clearSelection();
      String[] var3 = var10000;
      Object[] var10001 = Registry.packArgs(var1);
      long var5 = 583499983650693747L;
      Object[] var4 = var10001;
      Ref.h(583499983650693747L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      int var10 = var1;
      if (var3 == null) {
         if (var1 == -1) {
            return;
         }

         var10 = (var2) ? 1 : 0;
      }

      if (var10 != 0) {
         Object[] var10002 = Registry.packArgs(var1);
         long var7 = 442091497690345581L;
         Object[] var6 = var10002;
         Ref.h(442091497690345581L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }
      }
   }

   public void K(int var1, int var2) {
      this.clearSelection();
      Object[] var10001 = Registry.packArgs(var1, var2);
      long var4 = 626454774509008032L;
      Object[] var3 = var10001;
      Ref.h(626454774509008032L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void D(int var1, int var2) {
      String[] var3 = com.finalshell.ui.panel.F8.y();
      int var10000 = var1;
      byte var10001 = -1;
      if (var3 == null) {
         if (var1 == -1) {
            return;
         }

         var10000 = var2;
         var10001 = -1;
      }

      if (var10000 != var10001) {
         this.addColumnSelectionInterval(0, this.getColumnCount() - 1);
         this.addRowSelectionInterval(var1, var2);
      }
   }
}





