package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.EnableBackgroundImage;
import com.finalshell.ui.panel.Ky4;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class UN extends AbstractTableModel {
   public ArrayList F;
   String[] a;
   Class[] j;

   UN() {
      ArrayList var10001 = new ArrayList();
      long var2 = 388227650086417294L;
      ArrayList var1 = var10001;
      Ref.s(388227650086417294L, var1, var2);
      Class[] var10002 = new Class[]{Object.class};
      long var4 = 281087138368221367L;
      Class[] var3 = var10002;
      Ref.s(281087138368221367L, var3, var4);
      String[] var10003 = new String[]{""};
      long var6 = 493768440842237655L;
      String[] var5 = var10003;
      Ref.s(493768440842237655L, var5, var6);
   }

   @Override
   public synchronized Object getValueAt(int var1, int var2) {
      String var3 = null;
      Object var4 = 388227650086417294L;
      if (this < ((ArrayList)Ref.g(388227650086417294L, var4)).size()) {
         Object var6 = 388227650086417294L;
         var3 = (String)((ArrayList)Ref.g(388227650086417294L, var6)).get(var1);
      }

      return var3;
   }

   public int j(String var1) {
      EnableBackgroundImage.I();
      int var3 = 0;
      Object var6 = 388227650086417294L;
      Iterator var4 = ((ArrayList)Ref.g(388227650086417294L, var6)).iterator();
      UN var2 = this;

      int var10001;
      while (true) {
         label24:
         if (var4.hasNext()) {
            String var5 = (String)var4.next();
            if (var2 != null) {
               var10001 = (var1.equals(var5)) ? 1 : 0;
               if (var2 == null) {
                  break;
               }

               if (var10001 != 0 && var2 != null) {
                  break label24;
               }

               var3++;
            }

            if (var2 != null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return var10001;
   }

   @Override
   public void setValueAt(Object var1, int var2, int var3) {
      this.fireTableCellUpdated(var2, var3);
   }

   @Override
   public synchronized int getRowCount() {
      Object var1 = 388227650086417294L;
      return ((ArrayList)Ref.g(388227650086417294L, var1)).size();
   }

   @Override
   public int getColumnCount() {
      Object var1 = 493768440842237655L;
      return ((String[])Ref.g(493768440842237655L, var1)).length;
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 493768440842237655L;
      return ((String[])Ref.g(493768440842237655L, var2))[var1];
   }

   @Override
   public Class getColumnClass(int var1) {
      Object var2 = 281087138368221367L;
      return ((Class[])Ref.g(281087138368221367L, var2))[var1];
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      Ky4[] var10000 = EnableBackgroundImage.I();
      boolean var4 = false;
      Ky4[] var3 = var10000;
      int var6 = var2;
      if (var3 != null) {
         if (var2 == 0) {
            var4 = true;
         }

         var6 = 0;
      }

      return var6 != 0;
   }

   public ArrayList B() {
      Object var1 = 388227650086417294L;
      return (ArrayList)Ref.g(388227650086417294L, var1);
   }

   public void N(ArrayList var1) {
      long var3 = 388227650086417294L;
      Ref.s(388227650086417294L, var1, var3);
   }
}





