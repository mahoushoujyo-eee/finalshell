import com.rv_4;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JTable;

public class KK extends JTable {
   public void V(int var1) {
      Rectangle var2 = this.getCellRect(var1, 0, true);
      Rectangle var3 = this.getCellRect(var1, this.getColumnCount() - 1, true);
      Rectangle var4 = rv_4.B(var2, var3);
      if (var4 != null) {
         this.scrollRectToVisible(var4);
      }
   }

   public void C(int var1) {
      Rectangle var2 = this.getCellRect(0, var1, true);
      Rectangle var3 = this.getCellRect(this.getRowCount() - 1, var1, true);
      Rectangle var4 = rv_4.B(var2, var3);
      if (var4 != null) {
         this.scrollRectToVisible(var4);
      }
   }

   public void c(int var1) {
      Object[] var10001 = com.c.a(var1, true);
      Method var10003 = com.c.d(523670771353153858L);
      Object[] var10002 = var10001;
      KK var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void X(int var1) {
      String[] var2 = F8.y();
      if (var2 == null) {
         if (var1 == -1) {
            return;
         }

         this.addColumnSelectionInterval(0, this.getColumnCount() - 1);
      }

      this.addRowSelectionInterval(var1, var1);
   }

   public void g(int var1, boolean var2) {
      String[] var10000 = F8.y();
      this.clearSelection();
      String[] var3 = var10000;
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(583499983650693747L);
      Object[] var10002 = var10001;
      KK var9 = this;
      Method var6 = var10003;

      try {
         var6.invoke(var9, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      int var7 = var1;
      if (var3 == null) {
         if (var1 == -1) {
            return;
         }

         var7 = var2;
      }

      if (var7 != 0) {
         var10001 = com.c.a(var1);
         var10003 = com.c.d(442091497690345581L);
         var10002 = var10001;
         KK var11 = this;
         Method var8 = var10003;

         try {
            var8.invoke(var11, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }

   public void K(int var1, int var2) {
      this.clearSelection();
      Object[] var10001 = com.c.a(var1, var2);
      Method var10003 = com.c.d(626454774509008032L);
      Object[] var10002 = var10001;
      KK var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void D(int var1, int var2) {
      String[] var3 = F8.y();
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





