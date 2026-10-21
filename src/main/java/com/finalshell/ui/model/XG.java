package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.Zn2;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class XG extends AbstractTableModel {
   public ArrayList Z;
   String[] w;
   Class[] E;

   XG() {
      ArrayList var10001 = new ArrayList();
      long var2 = 410487397827032565L;
      ArrayList var1 = var10001;
      Ref.s(410487397827032565L, var1, var2);
      Class[] var10002 = new Class[]{Object.class};
      long var4 = 186695375521450227L;
      Class[] var3 = var10002;
      Ref.s(186695375521450227L, var3, var4);
      String[] var10003 = new String[]{""};
      long var6 = 338876892181440577L;
      String[] var5 = var10003;
      Ref.s(338876892181440577L, var5, var6);
   }

   @Override
   public synchronized Object getValueAt(int var1, int var2) {
      String var3 = null;
      Object var4 = 410487397827032565L;
      if (this < ((ArrayList)Ref.g(410487397827032565L, var4)).size()) {
         Object var6 = 410487397827032565L;
         var3 = (String)((ArrayList)Ref.g(410487397827032565L, var6)).get(var1);
      }

      return var3;
   }

   public int L(String var1) {
      int[] var10000 = Zn2.g();
      int var3 = 0;
      int[] var2 = var10000;
      Object var6 = 410487397827032565L;
      Iterator var4 = ((ArrayList)Ref.g(410487397827032565L, var6)).iterator();

      int var10001;
      while (true) {
         if (var4.hasNext()) {
            String var5 = (String)var4.next();
            if (var2 == null) {
               if (var1 != null) {
                  var10001 = (var1.equals(var5)) ? 1 : 0;
                  if (var2 != null) {
                     break;
                  }

                  if (var10001 != 0) {
                     var10001 = var3;
                     break;
                  }
               }

               var3++;
            }

            if (var2 == null) {
               continue;
            }
         }

         return -1;
      }

      return var10001;
   }

   @Override
   public void setValueAt(Object var1, int var2, int var3) {
      this.fireTableCellUpdated(var2, var3);
   }

   @Override
   public synchronized int getRowCount() {
      Object var1 = 410487397827032565L;
      return ((ArrayList)Ref.g(410487397827032565L, var1)).size();
   }

   @Override
   public int getColumnCount() {
      Object var1 = 338876892181440577L;
      return ((String[])Ref.g(338876892181440577L, var1)).length;
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 338876892181440577L;
      return ((String[])Ref.g(338876892181440577L, var2))[var1];
   }

   @Override
   public Class getColumnClass(int var1) {
      Object var2 = 186695375521450227L;
      return ((Class[])Ref.g(186695375521450227L, var2))[var1];
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      int[] var10000 = Zn2.g();
      boolean var4 = false;
      int[] var3 = var10000;
      int var6 = var2;
      if (var3 == null) {
         if (var2 == 0) {
            var4 = true;
         }

         var6 = 0;
      }

      return var6 != 0;
   }

   public ArrayList j() {
      Object var1 = 410487397827032565L;
      return (ArrayList)Ref.g(410487397827032565L, var1);
   }

   public void g(ArrayList var1) {
      long var3 = 410487397827032565L;
      Ref.s(410487397827032565L, var1, var3);
   }
}





