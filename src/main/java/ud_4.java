import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

class ud_4 extends AbstractCellEditor implements TableCellRenderer, TableCellEditor {
   private nO l;
   private nO L;

   ud_4() {
      com.c.c(559060643683375928L).set(this, new nO());
      com.c.c(453775776041703446L).set(this, new nO());
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      Method var10000 = (Method)com.c.c(559060643683375928L).get(this);
      Object[] var10001 = com.c.a((UC)var2);
      Method var10003 = com.c.d(630964635219898912L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      return (nO)com.c.c(559060643683375928L).get(this);
   }

   @Override
   public Component getTableCellEditorComponent(JTable var1, Object var2, boolean var3, int var4, int var5) {
      Method var10000 = (Method)com.c.c(453775776041703446L).get(this);
      Object[] var10001 = com.c.a((UC)var2);
      Method var10003 = com.c.d(630964635219898912L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      return (nO)com.c.c(453775776041703446L).get(this);
   }

   @Override
   public Object getCellEditorValue() {
      Object var10000 = com.c.c(453775776041703446L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(290079908037379882L);
      Object[] var10002 = var10001;
      var10001 = (Object[])var10000;
      var10000 = var10003;

      try {
         return (UC)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
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





