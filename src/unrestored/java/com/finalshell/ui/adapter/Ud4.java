package com.finalshell.ui.adapter;

import com.finalshell.core.UC;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.NO;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class Ud4 extends AbstractCellEditor implements TableCellRenderer, TableCellEditor {
   public NO l;
   public NO L;

   public Ud4() {
      NO var10001 = new NO();
      long var2 = 559060643683375928L;
      NO var1 = var10001;
      Ref.s(559060643683375928L, var1, var2);
      NO var10002 = new NO();
      long var4 = 453775776041703446L;
      NO var3 = var10002;
      Ref.s(453775776041703446L, var3, var4);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      Object var7 = 559060643683375928L;
      Ref.g(559060643683375928L, var7);
      Object[] var10002 = Registry.packArgs((UC)var2);
      long var10 = 630964635219898912L;
      Object[] var9 = var10002;
      Ref.h(630964635219898912L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw new RuntimeException(var13.getTargetException());
      }

      Object var11 = 559060643683375928L;
      return (NO)Ref.g(559060643683375928L, var11);
   }

   @Override
   public Component getTableCellEditorComponent(JTable var1, Object var2, boolean var3, int var4, int var5) {
      Object var6 = 453775776041703446L;
      Ref.g(453775776041703446L, var6);
      Object[] var10002 = Registry.packArgs((UC)var2);
      long var9 = 630964635219898912L;
      Object[] var8 = var10002;
      Ref.h(630964635219898912L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw new RuntimeException(var12.getTargetException());
      }

      Object var10 = 453775776041703446L;
      return (NO)Ref.g(453775776041703446L, var10);
   }

   @Override
   public Object getCellEditorValue() {
      Object var1 = 453775776041703446L;
      Ref.g(453775776041703446L, var1);
      Object var10002 = Registry.emptyArgs();
      long var4 = 290079908037379882L;
      Object var3 = var10002;
      var10002 = Ref.h(290079908037379882L, var3, var4);

      try {
         return (UC)var10002;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }

   @Override
   public boolean isCellEditable(EventObject var1) {
      return true;
   }

   @Override
   public boolean shouldSelectCell(EventObject var1) {
      return false;
   }
}





